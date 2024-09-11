import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Game {

    private Player player;
    private Room room;

    // Conexão com o banco de dados
    private Connection connection;

    public Game() throws SQLException {
        // Inicializa a conexão com o banco de dados (presumindo que você já configurou a conexão)
        connection = JogoMySQL.connect();
        player = new Player("Jogador");  // Nome pode ser passado ou pego do banco
        room = new Room(connection);  // Passa a conexão para a sala
    }

    public void start() {
        System.out.println(getPhrase("start_game"));
        System.out.println(getPhrase("note_on_floor"));
        showCommands();

        Scanner scanner = new Scanner(System.in);
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
                        gameRunning = false;  // O jogo termina após abrir a porta
                    }
                    break;
                default:
                    System.out.println("Comando não reconhecido.");
                    showCommands();
                    break;
            }
        }

        System.out.println(getPhrase("game_end"));
        saveGame();  // Salva o progresso no banco de dados
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
    }

    // Função para salvar o estado do jogo no banco de dados
    private void saveGame() {
        try {
            String query = "INSERT INTO game_state (player_name, room_description, has_key, door_open) VALUES (?, ?, ?, ?)";
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

    // Função para buscar frases no banco de dados
    private String getPhrase(String phraseKey) {
        String phrase = "Frase não encontrada.";  // Valor padrão caso a frase não seja encontrada
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
