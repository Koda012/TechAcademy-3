import java.util.Scanner;

public class InterfaceUsuario {

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public String lerEntrada(Scanner scanner) {
        return scanner.nextLine();
    }
}

