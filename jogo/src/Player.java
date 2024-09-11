public class Player {
    private String name;

    // Construtor da classe Player
    public Player(String name) {
        this.name = name;
    }

    // Método para obter o nome do jogador
    public String getName() {
        return name;
    }

    // Método para definir um novo nome, caso necessário
    public void setName(String name) {
        this.name = name;
    }
}