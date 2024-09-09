import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BancoDados {
    private Connection connection;


    public BancoDados() {
        try {
            String url = "jdbc:mysql://localhost:3306/jogo";
            String usuario = "root";
            String senha = "";
            this.connection = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão bem-sucedida ao banco de dados.");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }


    public void salvarEstadoJogador(Jogador jogador) {
        String query = "INSERT INTO saves (nome_jogador, localizacao, inventario) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, jogador.getNome());
            statement.setString(2, jogador.getLocalizacao());
            statement.setString(3, String.join(",", jogador.getInventario()));
            statement.executeUpdate();
            System.out.println("Jogo salvo com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao salvar o estado do jogo: " + e.getMessage());
        }
    }


    public void carregarEstadoJogador(Jogador jogador) {
        String query = "SELECT localizacao, inventario FROM saves WHERE nome_jogador = ? ORDER BY id DESC LIMIT 1";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, jogador.getNome());
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    String localizacao = resultSet.getString("localizacao");
                    String inventario = resultSet.getString("inventario");
                    jogador.setLocalizacao(localizacao);

                    List<String> inventarioList = new ArrayList<>();
                    if (inventario != null && !inventario.isEmpty()) {
                        String[] items = inventario.split(",");
                        for (String item : items) {
                            inventarioList.add(item);
                        }
                    }
                    jogador.setInventario(inventarioList);
                    System.out.println("Jogo carregado com sucesso.");
                } else {
                    System.out.println("Nenhum estado de jogo encontrado para carregar.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao carregar o estado do jogo: " + e.getMessage());
        }
    }


    public String getDescricaoItem(String nomeItem) {
        String query = "SELECT descricao FROM itens WHERE nome = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, nomeItem);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getString("descricao");
            } else {
                return "Item não encontrado.";
            }
        } catch (SQLException e) {
            return "Erro ao buscar item: " + e.getMessage();
        }
    }


    public String getDescricaoLocalizacao(String localizacao) {
        String query = "SELECT descricao FROM locais WHERE nome = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, localizacao);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getString("descricao");
            } else {
                return "Localização não encontrada.";
            }
        } catch (SQLException e) {
            return "Erro ao buscar localização: " + e.getMessage();
        }
    }

    
    public String getDescricaoNpc(String nomeNpc) {
        String query = "SELECT descricao FROM npcs WHERE nome = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, nomeNpc);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getString("descricao");
            } else {
                return "NPC não encontrado.";
            }
        } catch (SQLException e) {
            return "Erro ao buscar NPC: " + e.getMessage();
        }
    }
}
