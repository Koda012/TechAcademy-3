import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogo {
    private Jogador jogador;
    private BancoDados db;

    public Jogo() {
        this.db = new BancoDados();
        this.jogador = new Jogador();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        boolean jogando = true;

        System.out.println("Bem-vindo ao Jogo de Aventura em Texto!");

        while (jogando) {
            System.out.print("> ");
            String input = scanner.nextLine();
            jogando = processarComando(input);
        }
        scanner.close();
    }

    private boolean processarComando(String input) {
        String[] partes = input.split(" ");
        String comando = partes[0];

        switch (comando) {
            case "pegar":
                return comandoPegar(partes);
            case "olhar":
                return comandoOlhar();
            case "falar":
                return comandoFalar(partes);
            case "salvar":
                salvarJogo();
                return true;
            case "carregar":
                carregarJogo();
                return true;
            case "sair":
                return false;
            default:
                System.out.println("Comando não reconhecido.");
                return true;
        }
    }

    private boolean comandoPegar(String[] partes) {
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

    private boolean comandoOlhar() {
        String localizacao = jogador.getLocalizacao();
        System.out.println(db.getDescricaoLocalizacao(localizacao));
        return true;
    }

    private boolean comandoFalar(String[] partes) {
        if (partes.length < 2) {
            System.out.println("Uso: falar [npc]");
            return true;
        }

        String nomeNpc = partes[1];
        System.out.println(db.getDescricaoNpc(nomeNpc));
        return true;
    }

    private void salvarJogo() {
        db.salvarEstadoJogador(jogador);
        System.out.println("Jogo salvo com sucesso.");
    }

    private void carregarJogo() {
        db.carregarEstadoJogador(jogador);
        System.out.println("Jogo carregado com sucesso.");
    }

    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogo.iniciar();
    }
}

class Jogador {
    private String nome;
    private List<String> inventario;
    private String localizacao;

    public Jogador() {
        this.nome = "Jogador";
        this.inventario = new ArrayList<>();
        this.localizacao = "Caverna Escura";
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