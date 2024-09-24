package game;

import database.JogoMySQL;
import player.Player;
import room.Room;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Game {

    private Player player;
    private Room room;
    private Connection connection;

    public Game() throws SQLException {
        connection = JogoMySQL.connect(); // Conexão com o banco de dados
        player = new Player("Jogador");
        room = new Room(connection);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do jogador: ");
        String playerName = scanner.nextLine(); // Permite o jogador inserir o nome
        player.setName(playerName); // Define o nome do jogador

        // Tenta carregar o progresso salvo
        if (loadGame(playerName)) {
            System.out.println("Progresso carregado com sucesso!");
        } else {
            System.out.println("Novo jogo iniciado.");
        }

        // Inicia o jogo normalmente
        System.out.println(getPhrase("start_game"));
        System.out.println(getPhrase("note_on_floor"));
        showCommands();

        boolean gameRunning = true;

        while (gameRunning) {
            System.out.print("Jogador digita: ");
            String input = scanner.nextLine().toUpperCase();

            switch (input) {
                case "PEGAR BILHETE":
                    System.out.println(getPhrase("read_note"));
                    break;
                case "OLHAR AO REDOR":
                    room.lookAround();
                    break;
                case "EXAMINAR CAMA":
                    room.examineBed();
                    break;
                case "EXAMINAR PEDRA":
                    room.examineStone();
                    break;
                case "PEGAR CHAVE":
                    room.pickKey();
                    break;
                case "EXAMINAR PORTA":
                    room.examineDoor();
                    break;
                case "USAR CHAVE NA PORTA":
                    if (room.useKey()) {
                        gameRunning = false;
                    }
                    break;
                case "SALVAR JOGO":  // Novo comando para salvar o jogo
                    saveGame(); // Chama o método para salvar o progresso
                    break;
                default:
                    System.out.println("Comando não reconhecido.");
                    showCommands();
                    break;
            }
        }

        System.out.println(getPhrase("game_end"));
        saveGame(); // Salva o progresso ao finalizar o jogo
        scanner.close();
    }

    // Método para mostrar os comandos disponíveis
    private void showCommands() {
        System.out.println("Comandos disponíveis:");
        System.out.println("PEGAR BILHETE");
        System.out.println("OLHAR AO REDOR");
        System.out.println("EXAMINAR CAMA");
        System.out.println("EXAMINAR PEDRA");
        System.out.println("PEGAR CHAVE");
        System.out.println("EXAMINAR PORTA");
        System.out.println("USAR CHAVE NA PORTA");
        System.out.println("SALVAR JOGO");
    }

    // Método para salvar o progresso do jogo no banco de dados
    private void saveGame() {
        try {
            String query = "INSERT INTO game_state (player_name, room_description, has_key, door_open) VALUES (?, ?, ?, ?) " +
                    "ON DUPLICATE KEY UPDATE room_description = VALUES(room_description), has_key = VALUES(has_key), door_open = VALUES(door_open)";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, player.getName());
            stmt.setString(2, room.getDescription());
            stmt.setBoolean(3, room.hasKey());
            stmt.setBoolean(4, room.isDoorOpen());
            stmt.executeUpdate();
            System.out.println("Progresso salvo com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao salvar o jogo: " + e.getMessage());
        }
    }

    // Método para carregar o progresso salvo do banco de dados
    private boolean loadGame(String playerName) {
        try {
            String query = "SELECT * FROM game_state WHERE player_name = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, playerName);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // Se houver progresso salvo, restaura o estado do quarto e do jogador
                room.setHasKey(rs.getBoolean("has_key"));
                room.setDoorOpen(rs.getBoolean("door_open"));
                System.out.println("Jogo carregado para o jogador: " + playerName);
                return true; // Progresso carregado com sucesso
            }
        } catch (SQLException e) {
            System.out.println("Erro ao carregar o jogo: " + e.getMessage());
        }
        return false; // Não encontrou progresso salvo para o jogador
    }

    // Método para buscar frases do banco de dados
    private String getPhrase(String phraseKey) {
        String phrase = "Frase não encontrada.";
        try {
            String query = "SELECT phrase FROM game_frases WHERE phrase_key = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, phraseKey);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                phrase = rs.getString("phrase");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar a frase: " + e.getMessage());
        }
        return phrase;
    }
}
