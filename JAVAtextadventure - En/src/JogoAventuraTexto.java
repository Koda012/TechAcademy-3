import java.util.*;
import java.sql.*;

public class JogoAventuraTexto {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogo.iniciar();
    }
}

class Jogo {
    private Jogador jogador;
    private Mundo mundo;
    private BancoDados db;

    public Jogo() {
        this.db = new BancoDados();
        this.mundo = new Mundo(db);
        this.jogador = new Jogador();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        boolean jogando = true;

        System.out.println("Bem-vindo ao Jogo de Aventura em Texto!");

        while (jogando) {
            System.out.print("> ");
            String input = scanner.nextLine();
            jogando = Comando.processar(input, jogador, mundo, db, this);
        }
        scanner.close();
    }

    public void salvarJogo() {
        db.salvarEstadoJogador(jogador);
        System.out.println("Jogo salvo com sucesso.");
    }

    public void carregarJogo() {
        db.carregarEstadoJogador(jogador);
        System.out.println("Jogo carregado com sucesso.");
    }

    public String processarComando(String comando) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'processarComando'");
    }
}

class Jogador {
    private String nome;
    private List<String> inventario;
    private String localizacao;

    public Jogador() {
        this.nome = "Jogador";
        this.inventario = new ArrayList<>();
        this.localizacao = "Caverna Escura"; // Local inicial
    }

    public void adicionarItem(String item) {
        inventario.add(item);
    }

    public boolean possuiItem(String item) {
        return inventario.contains(item);
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public String getNome() {
        return nome;
    }

    public List<String> getInventario() {
        return inventario;
    }

    public void setInventario(List<String> inventario) {
        this.inventario = inventario;
    }
}

class BancoDados {
    private Connection conexao;

    public BancoDados() {
        try {
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/jogo", "usuario", "senha");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String getDescricaoItem(String nomeItem) {
        try {
            PreparedStatement stmt = conexao.prepareStatement("SELECT descricao FROM itens WHERE nome = ?");
            stmt.setString(1, nomeItem);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getString("descricao");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Item não encontrado.";
    }

    public String getDescricaoLocalizacao(String nomeLocal) {
        try {
            PreparedStatement stmt = conexao.prepareStatement("SELECT descricao FROM locais WHERE nome = ?");
            stmt.setString(1, nomeLocal);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getString("descricao");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Localização não encontrada.";
    }

    public String getDescricaoNpc(String nomeNpc) {
        try {
            PreparedStatement stmt = conexao.prepareStatement("SELECT descricao FROM npcs WHERE nome = ?");
            stmt.setString(1, nomeNpc);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getString("descricao");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "NPC não encontrado.";
    }

    public void salvarEstadoJogador(Jogador jogador) {
        try {
            String inventarioString = String.join(",", jogador.getInventario());

            PreparedStatement stmt = conexao.prepareStatement(
                "INSERT INTO saves (nome_jogador, localizacao, inventario) VALUES (?, ?, ?) ON DUPLICATE KEY UPDATE localizacao = VALUES(localizacao), inventario = VALUES(inventario)"
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
        try {
            PreparedStatement stmt = conexao.prepareStatement("SELECT localizacao, inventario FROM saves WHERE nome_jogador = ?");
            stmt.setString(1, jogador.getNome());
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                jogador.setLocalizacao(rs.getString("localizacao"));
                String inventarioString = rs.getString("inventario");
                jogador.setInventario(Arrays.asList(inventarioString.split(",")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

class Mundo {
    private BancoDados db;

    public Mundo(BancoDados db) {
        this.db = db;
    }

    public String descreverLocalizacao(String localizacao) {
        return db.getDescricaoLocalizacao(localizacao);
    }

    public String descreverNpc(String nomeNpc) {
        return db.getDescricaoNpc(nomeNpc);
    }
}

class Comando {
    public static boolean processar(String input, Jogador jogador, Mundo mundo, BancoDados db, Jogo jogo) {
        String[] partes = input.split(" ");
        String comando = partes[0];

        switch (comando) {
            case "foo":
                return comandoFoo(partes, jogador, mundo, db);
            case "pegar":
                return comandoPegar(partes, jogador, mundo, db);
            case "olhar":
                return comandoOlhar(partes, jogador, mundo, db);
            case "falar":
                return comandoFalar(partes, jogador, mundo, db);
            case "salvar":
                jogo.salvarJogo();
                return true;
            case "carregar":
                jogo.carregarJogo();
                return true;
            case "sair":
                return false; // Encerra o jogo
            default:
                System.out.println("Comando não reconhecido.");
                return true;
        }
    }

    private static boolean comandoFoo(String[] partes, Jogador jogador, Mundo mundo, BancoDados db) {
        System.out.println("Comando 'foo' executado.");
        return true;
    }

    private static boolean comandoPegar(String[] partes, Jogador jogador, Mundo mundo, BancoDados db) {
        if (partes.length < 2) {
            System.out.println("Uso: pegar [item]");
            return true;
        }

        String nomeItem = partes[1];
        String descricao = db.getDescricaoItem(nomeItem);

        if (!descricao.equals("Item não encontrado.")) {
            jogador.adicionarItem(nomeItem);
            System.out.println("Você pegou o item: " + nomeItem);
            System.out.println("Descrição: " + descricao);
        } else {
            System.out.println(descricao);
        }

        return true;
    }

    private static boolean comandoOlhar(String[] partes, Jogador jogador, Mundo mundo, BancoDados db) {
        String localizacao = jogador.getLocalizacao();
        System.out.println(mundo.descreverLocalizacao(localizacao));
        return true;
    }

    private static boolean comandoFalar(String[] partes, Jogador jogador, Mundo mundo, BancoDados db) {
        if (partes.length < 2) {
            System.out.println("Uso: falar [npc]");
            return true;
        }

        String nomeNpc = partes[1];
        String descricao = mundo.descreverNpc(nomeNpc);

        System.out.println(descricao);
        return true;
    }
}
