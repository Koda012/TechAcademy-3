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
        connection = JogoMySQL.connect();
        player = new Player("Jogador");
        room = new Room(connection);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do jogador: ");
        String playerName = scanner.nextLine();
        player.setName(playerName);


        if (loadGame(playerName)) {
            System.out.println("Progresso carregado com sucesso!");
        } else {
            System.out.println("Novo jogo iniciado.");
        }


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
                case "SALVAR JOGO":
                    saveGame();
                    break;
                default:
                    System.out.println("Comando não reconhecido.");
                    showCommands();
                    break;
            }
        }

        System.out.println(getPhrase("game_end"));
        saveGame();
        scanner.close();
    }


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


    private boolean loadGame(String playerName) {
        try {
            String query = "SELECT * FROM game_state WHERE player_name = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, playerName);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                room.setHasKey(rs.getBoolean("has_key"));
                room.setDoorOpen(rs.getBoolean("door_open"));
                System.out.println("Jogo carregado para o jogador: " + playerName);
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao carregar o jogo: " + e.getMessage());
        }
        return false;
    }


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
