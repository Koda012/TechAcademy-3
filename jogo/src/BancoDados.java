import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class BancoDados {
    private Connection conexao;

    public BancoDados() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            this.conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/jogo", "root", "");
            if (this.conexao != null) {
                System.out.println("Conexão com o banco de dados estabelecida com sucesso.");
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC não encontrado: " + e.getMessage());
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            e.printStackTrace();
        }
    }

    
    public String getDescricaoItem(String nomeItem) {
        if (conexao == null) {
            return "Conexão com o banco de dados não estabelecida.";
        }

        String descricao = "Item não encontrado.";
        try (PreparedStatement stmt = conexao.prepareStatement("SELECT descricao FROM itens WHERE nome = ?")) {
            stmt.setString(1, nomeItem);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    descricao = rs.getString("descricao");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return descricao;
    }

   
    public String getDescricaoLocalizacao(String nomeLocal) {
        if (conexao == null) {
            return "Conexão com o banco de dados não estabelecida.";
        }

        String descricao = "Localização não encontrada.";
        try (PreparedStatement stmt = conexao.prepareStatement("SELECT descricao FROM locais WHERE nome = ?")) {
            stmt.setString(1, nomeLocal);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    descricao = rs.getString("descricao");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return descricao;
    }

    public String getDescricaoNpc(String nomeNpc) {
        if (conexao == null) {
            return "Conexão com o banco de dados não estabelecida.";
        }

        String descricao = "NPC não encontrado.";
        try (PreparedStatement stmt = conexao.prepareStatement("SELECT descricao FROM npcs WHERE nome = ?")) {
            stmt.setString(1, nomeNpc);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    descricao = rs.getString("descricao");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return descricao;
    }

    
    public void salvarEstadoJogador(Jogador jogador) {
        if (conexao == null) {
            System.err.println("Conexão com o banco de dados não estabelecida.");
            return;
        }

        try {
            String inventarioString = String.join(",", jogador.getInventario());
            PreparedStatement stmt = conexao.prepareStatement(
                "INSERT INTO saves (nome_jogador, localizacao, inventario) VALUES (?, ?, ?) " +
                "ON DUPLICATE KEY UPDATE localizacao = VALUES(localizacao), inventario = VALUES(inventario)"
            );
            stmt.setString(1, jogador.getNome());
            stmt.setString(2, jogador.getLocalizacao());
            stmt.setString(3, inventarioString);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void carregarEstadoJogador(Jogador jogador) {
        if (conexao == null) {
            System.err.println("Conexão com o banco de dados não estabelecida.");
            return;
        }

        try (PreparedStatement stmt = conexao.prepareStatement("SELECT localizacao, inventario FROM saves WHERE nome_jogador = ?")) {
            stmt.setString(1, jogador.getNome());
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    jogador.setLocalizacao(rs.getString("localizacao"));
                    String inventarioString = rs.getString("inventario");
                    jogador.setInventario(Arrays.asList(inventarioString.split(",")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
