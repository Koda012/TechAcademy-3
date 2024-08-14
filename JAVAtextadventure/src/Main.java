import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Introdução: \n" +
                    "Você é o Juiz José da Silva, conhecido por sua imparcialidade e \n" +
                    "justiça. Hoje, você tem um caso complicado envolvendo três suspeitos \n" +
                    "de assassinato: João Ferreira, Carlos Oliveira e Maria Santos. As suas \n" +
                    "decisões determinarão o destino dos acusados e o curso da justiça.");
            System.out.println("\n");
            System.out.println("Contexto: Os suspeitos, João Ferreira, Carlos Oliveira e Maria Santos,\n" +
                    "foram presos na cena do crime. A polícia encontrou João com uma pistola em sua mão," +
                    "mas Carlos e Maria estavam próximos.\n");

            System.out.println("JULGAMENTO:\n" +
                    " Sua função é determinar o culpado conforme as provas expostas," +
                    " como juiz escolha o'que deseja fazer\n");

            System.out.println("Opção 1\n" +
                    "Contatar policial\n" +
                    "\n" +
                    "Return: No local do crime a vítima foi encontrada com um 6 facadas na região do peito, e ao perguntar aos suspeitos Maria a única a confessar diz ter sido João.\n");

            System.out.println("Opção 2\n" +
                    "\n" +
                    "Ouvir Réu João\n" +
                    "\n" +
                    "Return: João nervoso diz “seu juiz armaro pra mim num é possive, eu escutei os grito na otra casa e fui correno ajuda, chegueime la e o caba tava mortim”\n");

            System.out.println("Opção 3\n" +
                    "Ouvir Réu Carlos\n" +
                    "\n" +
                    "Return: Carlos diz normalmente diz “Foi o joão, ele algumas horas atrás havia brigado com o meu irmão o Luiz Felipe, e foi para a casa e matou o meu irmão, não contente de esfaquear ele, ele queria atirar em nós”\n");

            System.out.println("Opção 4\n" +
                    "Ouvir Réu Carlos\n" +
                    "\n" +
                    "Return: Carlos diz normalmente diz “Foi o joão, ele algumas horas atrás havia brigado com o meu irmão o Luiz Felipe, e foi para a casa e matou o meu irmão, não contente de esfaquear ele, ele queria atirar em nós”\n");


            System.out.println("1 - Opção 1\n" +
                    "Declarar João, Carlos e Maria culpados.\n");
            System.out.println("2 - Opção 2\n" +
                    "Declarar João culpado.\n");
            System.out.println("3 - Opção 3\n" +
                    "Declarar Carlos e Maria culpados.\n");
            System.out.println("4 - Opção 4\n" +
                    "Declarar João e Maria culpados.\n");
            System.out.print("Digite o número da opção desejada: ");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Você escolheu a Opção 1.");
                    
                    break;
                case 2:
                    System.out.println("Você escolheu a Opção 2.");

                    break;
                case 3:
                    System.out.println("Você escolheu a Opção 3.");

                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha 1, 2 ou 3.");
                    break;
            }
        } while (escolha < 1 || escolha > 3);

        scanner.close();
    }
}
