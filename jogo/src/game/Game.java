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
    private int currentRoom;

    public Game() throws SQLException {
        connection = JogoMySQL.connect();
        player = new Player("Jogador");
        room = new Room(connection, 1);
        currentRoom = 1;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do jogador: ");
        String playerName = scanner.nextLine();
        player.setName(playerName);

        if (loadGame(playerName)) {
            System.out.println("Progresso carregado com sucesso! Comandos disponíveis: OLHAR AO REDOR e AJUDA.");
        } else {
            System.out.println("Novo jogo iniciado. Comandos disponíveis: OLHAR AO REDOR AJUDA.");
        }

        System.out.println(getPhrase("start_game"));

        boolean gameRunning = true;

        while (gameRunning) {
            System.out.print("Jogador digita: ");
            String input = scanner.nextLine().toUpperCase();

            switch (input) {
                case "OLHAR AO REDOR":
                    room.lookAround();
                    break;
                case "EXAMINAR CAMA":
                    room.examineBed();
                    break;
                case "EXAMINAR ARMÁRIO":
                    room.examineCabinet();
                    break;
                case "PEGAR CHAVE":
                    room.pickKey();
                    break;
                case "ABRIR ARMÁRIO":
                    room.openCabinet();
                    break;
                case "EXAMINAR PEDRA":
                    room.examineStone();
                    break;
                case "EXAMINAR PORTA":
                    room.examineDoor();
                    break;
                case "USAR CHAVE NA PORTA":
                    if (room.useKeyOnStoneDoor()) {
                        nextRoom();
                    }
                    break;
                case "USAR MARRETA NA PORTA":
                    if (room.useHammerOnWoodenDoor()) {
                        nextRoom();
                    }
                    break;
                case "USAR PÉ DE CABRA NA PORTA":
                    if (room.useCrowbarOnMetalDoor()) {
                        nextRoom();
                    }
                    break;
                case "INVENTÁRIO":
                    showInventory();
                    break;
                case "AJUDA":
                    showHelp();
                    break;
                case "SALVAR JOGO":
                    saveGame();
                    break;
                case "REINICIAR JOGO":
                    resetGame();
                    break;
                default:
                    System.out.println(getPhrase("command_not_recognized"));
                    break;
            }
        }

        System.out.println(getPhrase("game_end"));
        saveGame();
        scanner.close();
    }

    private void resetGame() {
        currentRoom = 1;
        room = new Room(connection, currentRoom);
        System.out.println("O jogo foi reiniciado.");
    }

    private void showInventory() {
        System.out.println("Inventário: " + room.getInventory());
    }

    private void showHelp() {
        System.out.println(" Comandos disponíveis: OLHAR AO REDOR, EXAMINAR CAMA, EXAMINAR ARMÁRIO, ABRIR ARMÁRIO, PEGAR CHAVE,EXAMINAR PEDRA, EXAMINAR PORTA, USAR CHAVE NA PORTA, USAR MARRETA NA PORTA, USAR PÉ DE CABRA NA PORTA, INVENTÁRIO, AJUDA, SALVAR JOGO, REINICIAR JOGO.");
    }

    private void nextRoom() {
        if (currentRoom < 4) {
            currentRoom++;
            room = new Room(connection, currentRoom);
            System.out.println("Você entrou no quarto " + currentRoom + " Comandos disponíveis: OLHAR AO REDOR.");
        } else {
            System.out.println("Você completou o jogo!");
            System.exit(0);
        }
    }

    private void saveGame() {
        try {
            String query = "INSERT INTO game_state (player_name, room_number, has_key, has_hammer, has_crowbar, door_open) VALUES (?, ?, ?, ?, ?, ?) " +
                    "ON DUPLICATE KEY UPDATE room_number = VALUES(room_number), has_key = VALUES(has_key), has_hammer = VALUES(has_hammer), has_crowbar = VALUES(has_crowbar), door_open = VALUES(door_open)";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, player.getName());
            stmt.setInt(2, currentRoom);
            stmt.setBoolean(3, room.hasKey());
            stmt.setBoolean(4, room.hasHammer());
            stmt.setBoolean(5, room.hasCrowbar());
            stmt.setBoolean(6, room.isDoorOpen());

            stmt.executeUpdate();
            System.out.println("Jogo salvo com sucesso!");
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
                currentRoom = rs.getInt("room_number");
                boolean hasKey = rs.getBoolean("has_key");
                boolean hasHammer = rs.getBoolean("has_hammer");
                boolean hasCrowbar = rs.getBoolean("has_crowbar");
                boolean doorOpen = rs.getBoolean("door_open");

                room = new Room(connection, currentRoom);
                room.setHasKey(hasKey);
                room.setHasHammer(hasHammer);
                room.setHasCrowbar(hasCrowbar);
                room.setDoorOpen(doorOpen);
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao carregar o jogo: " + e.getMessage());
        }

        return false;
    }

    private String getPhrase(String key) {
        try {
            String query = "SELECT phrase FROM game_frases WHERE phrase_key = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, key);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getString("phrase");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar a frase: " + e.getMessage());
        }

        return "Frase não encontrada!";
    }

    public static void main(String[] args) throws SQLException {
        Game game = new Game();
        game.start();
    }
}
