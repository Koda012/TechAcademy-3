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
                    "Contatar policial\n");

            System.out.println("Opção 2\n" +
                    "Ouvir Réu João\n" +
                    "\n");

            System.out.println("Opção 3\n" +
                    "Ouvir Réu Carlos\n" +
                    "\n");

            System.out.println("Opção 4\n" +
                    "Ouvir Réu Maria\n" +
                    "\n");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println(
                            "No local do crime a vítima foi encontrada com um 6 facadas na região do peito, e ao perguntar aos suspeitos Maria a única a confessar diz ter sido João.");
                    int escolhaP;
                    do {
                        System.out.println("\n");
                        System.out.println("O que deseja fazer agora?");
                        System.out.println(
                                "2 - Ouvir réu João" + "\n" + "3 - Ouvir réu Carlos" + "\n" + "4 - Ouvir réu Maria");
                        escolhaP = scanner.nextInt();

                        switch (escolhaP) {
                            case 2: {
                                System.out.println("Opção 2\n" +
                                        "\n" +
                                        "João nervoso diz: seu juiz armaro pra mim num é possive, eu escutei os grito na otra casa e fui correno ajuda, chegueime la e o caba tava mortim\"\n"
                                        +
                                        "\n");

                                int escolhaPj;
                                do {
                                    System.out.println("\n");
                                    System.out.println("O que deseja fazer agora?");
                                    System.out.println("3 - Ouvir réu Carlos" + "\n" + "4 - Ouvir réu Maria");
                                    escolhaPj = scanner.nextInt();

                                    switch (escolhaPj) {

                                        case 3: {
                                            System.out.println("Opção 3\n" +
                                                    "Carlos diz normalmente diz: Foi o joão, ele algumas horas atrás havia brigado com o meu irmão o Luiz Felipe, e foi para a casa e matou o meu irmão, não contente de esfaquear ele, ele queria atirar em nós\n"
                                                    +
                                                    "\n");
                                            int escolhaPjc;
                                            do {
                                                System.out.println("\n");
                                                System.out.println("O que deseja fazer agora?");
                                                System.out.println("3 - Ouvir réu joão" + "\n" + "4 - Ouvir réu Maria");
                                                escolhaPjc = scanner.nextInt();

                                                switch (escolhaPjc) {

                                                    case 3:
                                                        System.out.println("Opção 3\n" +
                                                                "João diz bravo diz: não fui eu dotor, aqueles desgraçadus taõ me acusando, eu havia brigado com ele mesmo, mas não havia nada dimais\n"
                                                                +
                                                                "\n");
                                                        break;
                                                    case 4:
                                                        System.out.println("Opção 4\n" +
                                                                "Maria desesperada diz: sim, senhor juiz, alem de matar meu cunhado, ele havia ameçado ele algumas horas antes, eles haviam brigado, e bebado o João foi buscar a arma na casa dele\n"
                                                                +
                                                                "\n");
                                                        break;
                                                    default:
                                                        System.out.println("Opação invalida. escolher de 3 ou 4");
                                                        break;
                                                }
                                            } while (escolhaPjc < 3 || escolhaPjc > 4);
                                            break;
                                        }

                                        case 4: {
                                            System.out.println("Opção 4\n" +
                                                    "Maria desesperada diz: Foi ele, foi ele, seu MENTIROSO, ALÉM DE ESFAQUEAR MEU CUNHADO ELE QUERIA ATIRAR EM NÓS. e começa a chorar desesperada\n"
                                                    +
                                                    "\n");
                                            int escolhaPjm;
                                            do {
                                                System.out.println("\n");
                                                System.out.println("O que deseja fazer agora?");
                                                System.out
                                                        .println("3 - Ouvir réu joão" + "\n" + "4 - Ouvir réu Carlos");
                                                escolhaPjm = scanner.nextInt();

                                                switch (escolhaPjm) {

                                                    case 3:
                                                        System.out.println("Opção 3\n" +
                                                                "João diz bravo diz: não fui eu dotor, aqueles desgraçadus taõ me acusando, mas não havia feito nada dimais\n"
                                                                +
                                                                "\n");
                                                        break;
                                                    case 4:
                                                        System.out.println("Opção 4\n" +
                                                                "Carlos diz normalmente diz: Foi o joão, ele algumas horas atrás havia brigado com o meu irmão o Luiz Felipe, e foi para a casa e matou o meu irmão, não contente de esfaquear ele, ele queria atirar em nós\n"
                                                                +
                                                                "\n");
                                                        break;
                                                    default:
                                                        System.out.println("Opação invalida. escolher de 3 ou 4");
                                                        break;
                                                }
                                            } while (escolhaPjm < 3 || escolhaPjm > 4);
                                            break;
                                        }

                                        default:
                                            System.out.println("Opação invalida. escolher de 3 ou 4");
                                            break;
                                    }
                                } while (escolhaPj < 3 || escolhaPj > 4);
                                break;
                            }
                            case 3: {
                                System.out.println("Opção 3\n" +
                                        "Carlos diz normalmente diz: Foi o joão, ele algumas horas atrás havia brigado com o meu irmão o Luiz Felipe, e foi para a casa e matou o meu irmão, não contente de esfaquear ele, ele queria atirar em nós\n"
                                        +
                                        "\n");

                                int escolhaPc;
                                do {
                                    System.out.println("\n");
                                    System.out.println("O que deseja fazer agora?");
                                    System.out.println("3 - Ouvir réu João" + "\n" + "4 - Ouvir réu Maria");
                                    escolhaPc = scanner.nextInt();

                                    switch (escolhaPc) {

                                        case 3: {
                                            System.out.println("Opção 3\n" +
                                                    "João bravo diz: seu juiz ele está mentindo, MENTIROSO, EU ESCUTEI OS GRITOS E FUI AJUDAR CORRENO, QUANDU CHEGUEI ELE JÁ TAVA MORTO\n"
                                                    +
                                                    "\n");
                                            int escolhaPcj;
                                            do {
                                                System.out.println("\n");
                                                System.out.println("O que deseja fazer agora?");
                                                System.out
                                                        .println("3 - Ouvir réu Maria" + "\n" + "4 - Ouvir réu Carlos");
                                                escolhaPcj = scanner.nextInt();

                                                switch (escolhaPcj) {

                                                    case 3:
                                                        System.out.println("Opção 3\n" +
                                                                "Maria desesperada diz: Foi ele, foi ele, seu MENTIROSO, ALÉM DE ESFAQUEAR MEU CUNHADO ELE QUERIA ATIRAR EM NÓS. e começa a chorar desesperada\n"
                                                                +
                                                                "\n");
                                                        break;
                                                    case 4:
                                                        System.out.println("Opção 4\n" +
                                                                "Carlos diz normalmente diz: Foi o joão, ele algumas horas atrás havia brigado com o meu irmão o Luiz Felipe, e foi para a casa e matou o meu irmão, não contente de esfaquear ele, ele queria atirar em nós\n"
                                                                +
                                                                "\n");
                                                        break;
                                                    default:
                                                        System.out.println("Opação invalida. escolher de 3 ou 4");
                                                        break;
                                                }
                                            } while (escolhaPcj < 3 || escolhaPcj > 4);
                                            break;
                                        }
                                        case 4: {
                                            System.out.println("Opção 4\n" +
                                                    "Maria desesperada diz: Foi ele, foi ele, além de esfaquear no meu cunhado ele queria nos atirar em nós. e começa a chorar desesperada\n"
                                                    +
                                                    "\n");
                                            int escolhaPcm;
                                            do {
                                                System.out.println("\n");
                                                System.out.println("O que deseja fazer agora?");
                                                System.out
                                                        .println("3 - Ouvir réu João" + "\n" + "4 - Ouvir réu Carlos");
                                                escolhaPcm = scanner.nextInt();

                                                switch (escolhaPcm) {

                                                    case 3:
                                                        System.out.println("Opção 3\n" +
                                                                "João bravo diz: seu juiz ela está mentindo, MENTIROSA, EU ESCUTEI OS GRITOS E FUI AJUDAR CORRENO, QUANDU CHEGUEI ELE JÁ TAVA MORTO\n"
                                                                +
                                                                "\n");
                                                        break;
                                                    case 4:
                                                        System.out.println("Opção 4\n" +
                                                                "Carlos diz normalmente diz: Foi o joão, ele algumas horas atrás havia brigado com o meu irmão o Luiz Felipe, e foi para a casa e matou o meu irmão, não contente de esfaquear ele, ele queria atirar em nós\n"
                                                                +
                                                                "\n");
                                                        break;
                                                    default:
                                                        System.out.println("Opação invalida. escolher de 3 ou 4");
                                                        break;
                                                }
                                            } while (escolhaPcm < 3 || escolhaPcm > 4);
                                            break;
                                        }

                                        default:
                                            System.out.println("Opação invalida. escolher de 3 ou 4");
                                            break;
                                    }
                                } while (escolhaPc < 3 || escolhaPc > 4);
                                break;
                            }
                            case 4: {
                                System.out.println("Opção 4\n" +
                                        "Maria desesperada diz: Foi ele, foi ele, além de esfaquear no meu cunhado ele queria nos atirar em nós. e começa a chorar desesperada\n"
                                        +
                                        "\n");

                                int escolhaPm;
                                do {
                                    System.out.println("\n");
                                    System.out.println("O que deseja fazer agora?");
                                    System.out.println("3 - Ouvir réu Carlos" + "\n" + "4 - Ouvir réu João");
                                    escolhaPm = scanner.nextInt();

                                    switch (escolhaPm) {

                                        case 3: {
                                            System.out.println("Opção 3\n" +
                                                    "Carlos diz normalmente diz: Foi o joão, ele algumas horas atrás havia brigado com o meu irmão o Luiz Felipe, e foi para a casa e matou o meu irmão, não contente de esfaquear ele, ele queria atirar em nós\n"
                                                    +
                                                    "\n");
                                            int escolhaPmc;
                                            do {
                                                System.out.println("\n");
                                                System.out.println("O que deseja fazer agora?");
                                                System.out
                                                        .println("3 - Ouvir réu João" + "\n" + "4 - Ouvir réu Carlos");
                                                escolhaPmc = scanner.nextInt();

                                                switch (escolhaPmc) {

                                                    case 3:
                                                        System.out.println("Opção 3\n" +
                                                                "João bravo diz: seu juiz ela está mentindo, MENTIROSA, EU ESCUTEI OS GRITOS E FUI AJUDAR CORRENO, QUANDU CHEGUEI ELE JÁ TAVA MORTO\n"
                                                                +
                                                                "\n");
                                                        break;
                                                    case 4:
                                                        System.out.println("Opção 4\n" +
                                                                "Carlos diz normalmente diz: Foi o joão, ele algumas horas atrás havia brigado com o meu irmão o Luiz Felipe, e foi para a casa e matou o meu irmão, não contente de esfaquear ele, ele queria atirar em nós\n"
                                                                +
                                                                "\n");
                                                        break;
                                                    default:
                                                        System.out.println("Opação invalida. escolher de 3 ou 4");
                                                        break;
                                                }
                                            } while (escolhaPmc < 3 || escolhaPmc > 4);
                                            break;
                                        }
                                        case 4: {
                                            System.out.println("Opção 4\n" +
                                                    "João bravo diz: seu juiz ela está mentindo, MENTIROSA, EU ESCUTEI OS GRITOS E FUI AJUDAR CORRENO, QUANDU CHEGUEI ELE JÁ TAVA MORTO\n"
                                                    +
                                                    "\n");
                                            int escolhaPcj;
                                            do {
                                                System.out.println("\n");
                                                System.out.println("O que deseja fazer agora?");
                                                System.out
                                                        .println("3 - Ouvir réu Maria" + "\n" + "4 - Ouvir réu Carlos");
                                                escolhaPcj = scanner.nextInt();

                                                switch (escolhaPcj) {

                                                    case 3:
                                                        System.out.println("Opção 3\n" +
                                                                "Maria brava diz: VOCÊ MATOU ELE E AINDA TEM CORAGEM DE DIZER ISSO SEU DESGRAÇADO!!!!!!!!!\n"
                                                                +
                                                                "\n");
                                                        break;
                                                    case 4:
                                                        System.out.println("Opção 4\n" +
                                                                "Carlos diz normalmente diz: Ele não tem coragem de mentir, e ainda se comporta como um alucinado imbecil\n"
                                                                +
                                                                "\n");
                                                        break;
                                                    default:
                                                        System.out.println("Opação invalida. escolher de 3 ou 4");
                                                        break;
                                                }
                                            } while (escolhaPcj < 3 || escolhaPcj > 4);
                                            break;
                                        }
                                        default:
                                            System.out.println("Opação invalida. escolher de 3 ou 4");
                                            break;
                                    }
                                } while (escolhaPm < 3 || escolhaPm > 4);
                                break;
                            }
                            default:
                                System.out.println("Opação invalida. escolher de 4 a 2");
                                break;

                        }
                    } while (escolhaP < 2 || escolhaP > 4);
                    break;
                //
                //
                //
                //
                //
                //
                //
                //
                case 2:
                    System.out.println(
                            "João nervoso diz: seu juiz armaro pra mim num é possive, eu escutei os grito na otra casa e fui correno ajuda, chegueime la e o caba tava mortim");
                    int escolhaJ;
                    do {
                        System.out.println("\n");
                        System.out.println("O que deseja fazer agora?");
                        System.out.println("1 - Ouvir os policiais" + "\n" + "2 - Ouvir réu Carlos" + "\n"
                                + "3 - Ouvir réu Maria");
                        escolhaJ = scanner.nextInt();

                        switch (escolhaJ) {
                            case 1: {
                                System.out.println("Opção 1\n" +
                                        "\n" +
                                        "No local do crime a vítima foi encontrada com um 6 facadas na região do peito, e ao perguntar aos suspeitos Maria a única a confessar diz ter sido João.”\"\n"
                                        +
                                        "\n");
                                int escolhaJP;
                                do {
                                    System.out.println("\n");
                                    System.out.println("O que deseja fazer agora?");
                                    System.out.println("2 - Ouvir Policial" + "\n" + "3 - Ouvir réu Maria" + "\n"
                                            + "4 - Ouvir réu Carlos");
                                    escolhaJP = scanner.nextInt();

                                    switch (escolhaJP) {

                                        case 3: {
                                            System.out.println("Opção 3\n" +
                                                    "Maria brava diz: VOCÊ MATOU ELE E AINDA TEM CORAGEM DE DIZER QUE NÃO SEU DESGRAÇADO!!!!!!!!!\n"
                                                    +
                                                    "\n");
                                            int escolhaPjm;
                                            do {
                                                System.out.println("\n");
                                                System.out.println("O que deseja fazer agora?");
                                                System.out
                                                        .println("3 - Ouvir réu joão" + "\n" + "4 - Ouvir réu Carlos");
                                                escolhaPjm = scanner.nextInt();

                                                switch (escolhaPjm) {

                                                    case 3:
                                                        System.out.println("Opção 3\n" +
                                                                "João diz bravo diz: não fui eu dotor, aqueles desgraçadus taõ me acusando, mas não havia feito nada dimais, E ESSA DESGRAÇADA INSISTE\n"
                                                                +
                                                                "\n");
                                                        break;
                                                    case 4:
                                                        System.out.println("Opção 4\n" +
                                                                "Carlos diz normalmente diz: Foi o joão, ele algumas horas atrás havia brigado com o meu irmão o Luiz Felipe, e foi para a casa e matou o meu irmão, não contente de esfaquear ele, ele queria atirar em nós\n"
                                                                +
                                                                "\n");
                                                        break;
                                                    default:
                                                        System.out.println("Opação invalida. escolher de 3 ou 4");
                                                        break;
                                                }
                                            } while (escolhaPjm < 3 || escolhaPjm > 4);
                                            break;
                                        }
                                        case 4: {
                                            System.out.println("Opção 4\n" +
                                                    "Carlos diz normalmente diz: Ele não tem coragem de mentir, e ainda se comporta como um alucinado imbecil\n"
                                                    +
                                                    "\n");
                                            int escolhaJpc;
                                            do {
                                                System.out.println("\n");
                                                System.out.println("O que deseja fazer agora?");
                                                System.out
                                                        .println("3 - Ouvir réu Maria" + "\n" + "4 - Ouvir réu Carlos");
                                                escolhaJpc = scanner.nextInt();

                                                switch (escolhaJpc) {

                                                    case 3:
                                                        System.out.println("Opção 3\n" +
                                                                "Maria desesperada diz: Foi ele, foi ele, seu MENTIROSO, ALÉM DE ESFAQUEAR MEU CUNHADO ELE QUERIA ATIRAR EM NÓS. e começa a chorar desesperada\n"
                                                                +
                                                                "\n");
                                                        break;
                                                    case 4:
                                                        System.out.println("Opção 4\n" +
                                                                "Carlos diz normalmente diz: Foi o joão, ele algumas horas atrás havia brigado com o meu irmão o Luiz Felipe, e foi para a casa e matou o meu irmão, não contente de esfaquear ele, ele queria atirar em nós\n"
                                                                +
                                                                "\n");
                                                        break;
                                                    default:
                                                        System.out.println("Opação invalida. escolher de 3 ou 4");
                                                        break;
                                                }
                                            } while (escolhaJpc < 3 || escolhaJpc > 4);
                                            break;
                                        }
                                        default:
                                            System.out.println("Opação invalida. escolher de 3 ou 4");
                                            break;
                                    }
                                } while (escolhaJP < 2 || escolhaJP > 5);
                                break;
                            }
                            case 2: {
                                System.out.println("Opção 2\n" +
                                        "Carlos diz normalmente diz: Foi o joão, ele algumas horas atrás havia brigado com o meu irmão o Luiz Felipe, e foi para a casa e matou o meu irmão, não contente de esfaquear ele, ele queria atirar em nós, seu mentiroso maldito, eu amava meu irmão\n"
                                        +
                                        "\n");
                                int escolhaJC;
                                do {
                                    System.out.println("\n");
                                    System.out.println("O que deseja fazer agora?");
                                    System.out.println("2 - Ouvir Policial" + "\n" + "3 - Ouvir réu Maria" + "\n"
                                            + "4 - Ouvir réu João");
                                    escolhaJC = scanner.nextInt();

                                    switch (escolhaJC) {

                                        case 2: {
                                            System.out.println("Opção 2\n" +
                                                    "No local do crime a vítima foi encontrada com um 6 facadas na região do peito, e ao perguntar aos suspeitos Maria a única a confessar diz ter sido João.\n"
                                                    +
                                                    "\n");
                                            int escolhaJcp;
                                            do {
                                                System.out.println("\n");
                                                System.out.println("O que deseja fazer agora?");
                                                System.out.println("3 - Ouvir réu Maria" + "\n" + "4 - Ouvir réu João");
                                                escolhaJcp = scanner.nextInt();

                                                switch (escolhaJcp) {

                                                    case 3:
                                                        System.out.println("Opção 3\n" +
                                                                "Maria desesperada diz: Foi ele, foi ele, seu MENTIROSO, ALÉM DE ESFAQUEAR MEU CUNHADO ELE QUERIA ATIRAR EM NÓS. e começa a chorar desesperada\n"
                                                                +
                                                                "\n");
                                                        break;
                                                    case 4:
                                                        System.out.println("Opção 4\n" +
                                                                "João diz bravo diz: não fui eu dotor, aqueles desgraçadus taõ me acusando, mas não havia feito nada dimais, E ESSA DESGRAÇADA INSISTE\n"
                                                                +
                                                                "\n");
                                                        break;
                                                    default:
                                                        System.out.println("Opação invalida. escolher de 3 ou 4");
                                                        break;
                                                }
                                            } while (escolhaJcp < 2 || escolhaJcp > 5);
                                            break;
                                        }
                                        case 3: {
                                            System.out.println("Opção 3\n" +
                                                    "Maria brava diz: VOCÊ JOÃO, VOCÊ MATOU ELE E AINDA TEM CORAGEM DE DIZER QUE FOMOS NÓS SEU DESGRAÇADO!!!!!!!!!\n"
                                                    +
                                                    "\n");
                                            int escolhaJcm;
                                            do {
                                                System.out.println("\n");
                                                System.out.println("O que deseja fazer agora?");
                                                System.out.println("3 - Ouvir réu Maria" + "\n" + "4 - Ouvir réu João");
                                                escolhaJcm = scanner.nextInt();

                                                switch (escolhaJcm) {

                                                    case 3:
                                                        System.out.println("Opção 3\n" +
                                                                "Maria desesperada diz: Foi ele, foi ele, seu MENTIROSO, ALÉM DE ATIRAR MEU CUNHADO ELE QUERIA ATIRAR EM NÓS. e começa a chorar desesperada\n"
                                                                +
                                                                "\n");
                                                        break;
                                                    case 4:
                                                        System.out.println("Opção 4\n" +
                                                                "João diz bravo diz: não fui eu dotor, aqueles desgraçadus taõ me acusando, mas não havia feito nada dimais, E ESSE DESGRAÇADO INSISTE\n"
                                                                +
                                                                "\n");
                                                        break;
                                                    default:
                                                        System.out.println("Opação invalida. escolher de 3 ou 4");
                                                        break;
                                                }
                                            } while (escolhaJcm < 3 || escolhaJcm > 4);
                                            break;
                                        }
                                        case 4: {
                                            System.out.println("Opção 4\n" +
                                                    "João diz Nervoso diz diz: Ele não tem corage de menti, seu dresgaçadu maldito\n"
                                                    +
                                                    "\n");
                                            int escolhaJcj;
                                            do {
                                                System.out.println("\n");
                                                System.out.println("O que deseja fazer agora?");
                                                System.out.println("1 - Ouvir réu Maria" + "\n");
                                                escolhaJcj = scanner.nextInt();

                                                switch (escolhaJcj) {

                                                    case 1:
                                                        System.out.println("Opção 1\n" +
                                                                "Maria desesperada diz: Foi ele, foi ele, seu MENTIROSO, ALÉM DE ATIRAR MEU CUNHADO ELE QUERIA ATIRAR EM NÓS. e começa a chorar desesperada\n"
                                                                +
                                                                "\n");
                                                        break;

                                                    default:
                                                        System.out.println("Opação invalida. escolher de 3 ou 4");
                                                        break;
                                                }
                                            } while (escolhaJcj >= 1);
                                            break;
                                        }
                                        default:
                                            System.out.println("Opação invalida. escolher de 3 ou 4");
                                            break;
                                    }
                                } while (escolhaJC < 2 || escolhaJC > 5);
                                break;
                            }
                            case 3: {
                                System.out.println("Opção 3\n" +
                                        "Maria desesperada diz: Foi ele, foi ele, além de atirar no meu cunhado ele queria nos esfaquear. e começa a chorar desesperada\n"
                                        +
                                        "\n");
                                int escolhaJM;
                                do {
                                    System.out.println("\n");
                                    System.out.println("O que deseja fazer agora?");
                                    System.out.println("2 - Ouvir Policial" + "3 - Ouvir réu Carlos" + "\n"
                                            + "4 - Ouvir réu João");
                                    escolhaJM = scanner.nextInt();

                                    switch (escolhaJM) {
                                        case 2: {
                                            System.out.println("Opção 2\n" +
                                                    "No local do crime a vítima foi encontrada com um 6 facadas na região do peito, e ao perguntar aos suspeitos Maria a única a confessar diz ter sido João.\n"
                                                    +
                                                    "\n");
                                            int escolhaJMP;
                                            do {
                                                System.out.println("\n");
                                                System.out.println("O que deseja fazer agora?");
                                                System.out.println("1 - Ouvir réu Carlos" + "\n");
                                                escolhaJMP = scanner.nextInt();

                                                switch (escolhaJMP) {
                                                    case 1:
                                                        System.out.println("Opção 1\n" +
                                                                "Carlos diz normalmente diz: Foi o joão, ele algumas horas atrás havia brigado com o meu irmão o Luiz Felipe, e foi para a casa e matou o meu irmão, não contente de esfaquear ele, ele queria atirar em nós, seu mentiroso maldito, eu amava meu irmão, ele ainda mentiu até agora\n"
                                                                +
                                                                "\n");
                                                    default:
                                                        System.out.println("Opação invalida. escolher 1");
                                                        break;
                                                }
                                            } while (escolhaJMP >= 1);
                                            break;
                                        }
                                        case 3: {
                                            System.out.println("Opção 3\n" +
                                                    "Carlos diz normalmente diz: Foi o joão, ele algumas horas atrás havia brigado com o meu irmão o Luiz Felipe, e foi para a casa e matou o meu irmão, não contente de esfaquear ele, ele queria atirar em nós, seu mentiroso maldito, eu amava meu irmão\n"
                                                    +
                                                    "\n");
                                            int escolhaJMC;
                                            do {
                                                System.out.println("\n");
                                                System.out.println("O que deseja fazer agora?");
                                                System.out.println("1 - Ouvir réu Carlos" + "\n");
                                                escolhaJMC = scanner.nextInt();

                                                switch (escolhaJMC) {
                                                    case 1:
                                                        System.out.println("Opção 1\n" +
                                                                "No local do crime a vítima foi encontrada com um 6 facadas na região do peito, e ao perguntar aos suspeitos Maria a única a confessar diz ter sido João.\n");
                                                    default:
                                                        System.out.println("Opação invalida. escolher apenas 1");
                                                        break;
                                                }
                                            } while (escolhaJMC >= 1);
                                            break;
                                        }
                                        default:
                                            System.out.println("Opação invalida. escolher de 2 ou 3");
                                            break;
                                    }
                                } while (escolhaJM < 1 || escolhaJM > 5);
                                break;
                            }
                            default:
                                System.out.println("Opação invalida. escolher de 1, 2 e 3");
                                break;

                        }
                    } while (escolhaJ < 1 || escolhaJ > 3);
                    break;
                //
                //
                //
                //
                //
                //
                //
                //
                case 3:
                    System.out.println(
                            "Carlos diz normalmente diz: Foi o joão, ele algumas horas atrás havia brigado com o meu irmão o Luiz Felipe, e foi para a casa e matou o meu irmão, não contente de esfaquear ele, ele queria atirar em nós");
                    int escolhaC;
                    do {
                        System.out.println("\n");
                        System.out.println("O que deseja fazer agora?");
                        System.out.println(
                                "1 - Ouvir os policiais" + "\n" + "2 - Ouvir réu João" + "\n" + "3 - Ouvir réu Maria");
                        escolhaC = scanner.nextInt();
                        switch (escolhaC) {
                            case 1:
                                System.out.println("Opção 1\n" +
                                        "\n" +
                                        "No local do crime a vítima foi encontrada com um 6 facadas na região do peito, e ao perguntar aos suspeitos Maria a única a confessar diz ter sido João.”\"\n"
                                        +
                                        "\n");
                                int escolhaCp;
                                do {
                                    System.out.println("\n");
                                    System.out.println("O que deseja fazer agora?");
                                    System.out.println("3 - Ouvir réu Maria" + "\n" + "4 - Ouvir réu João");
                                    escolhaCp = scanner.nextInt();

                                    switch (escolhaCp) {

                                        case 3:
                                            System.out.println("Opção 3\n" +
                                                    "Maria brava diz: VOCÊ MATOU ELE E AINDA TEM CORAGEM DE DIZER ISSO SEU DESGRAÇADO!!!!!!!!!\n"
                                                    +
                                                    "\n");
                                            break;
                                        case 4:
                                            System.out.println("Opção 4\n" +
                                                    "Carlos diz normalmente diz: Ele não tem coragem de mentir, e ainda se comporta como um alucinado imbecil\n"
                                                    +
                                                    "\n");
                                            break;
                                        default:
                                            System.out.println("Opação invalida. escolher de 3 ou 4");
                                            break;
                                    }
                                } while (escolhaCp < 3 || escolhaCp > 4);
                                break;

                            case 2:
                                System.out.println("Opção 2\n" +
                                        "João bravo diz: seu juiz ele está mentindo, MENTIROSO, EU ESCUTEI OS GRITOS E FUI AJUDAR CORRENO, QUANDU CHEGUEI ELE JÁ TAVA MORTIM\n"
                                        +
                                        "\n");
                                break;
                            case 3:
                                System.out.println("Opção 3\n" +
                                        "Maria desesperada diz: Foi ele, foi ele, além de atirar no meu cunhado ele queria nos esfaquear. e começa a chorar desesperada\n"
                                        +
                                        "\n");
                                break;
                            default:
                                System.out.println("Opação invalida. escolher de 1, 2 e 3");
                                break;

                        }
                    } while (escolhaC < 1 || escolhaC > 3);
                    break;
                //
                //
                //
                //
                //
                //
                //
                //
                case 4:
                    System.out.println(
                            "Maria desesperada diz: Foi ele, foi ele, além de atirar no meu cunhado ele queria nos esfaquear. e assim começa a chorar desesperada");
                    int escolhaM;
                    do {
                        System.out.println("\n");
                        System.out.println("O que deseja fazer agora?");
                        System.out.println(
                                "1 - Ouvir os policiais" + "\n" + "2 - Ouvir réu Carlos" + "\n" + "3 - Ouvir réu João");
                        escolhaM = scanner.nextInt();

                        switch (escolhaM) {
                            case 1:
                                System.out.println("Opção 1\n" +
                                        "\n" +
                                        "No local do crime a vítima foi encontrada com um 6 facadas na região do peito, e ao perguntar aos suspeitos Maria a única a confessar diz ter sido João.”\"\n"
                                        +
                                        "\n"); {
                                System.out.println("Opção 1\n" +
                                        "\n" +
                                        "No local do crime a vítima foi encontrada com um 6 facadas na região do peito, e ao perguntar aos suspeitos Maria a única a confessar diz ter sido João.”\"\n"
                                        +
                                        "\n");
                                int escolhaMp;
                                do {
                                    System.out.println("\n");
                                    System.out.println("O que deseja fazer agora?");
                                    System.out.println("3 - Ouvir réu Maria" + "\n" + "4 - Ouvir réu Carlos");
                                    escolhaMp = scanner.nextInt();

                                    switch (escolhaMp) {

                                        case 3:
                                            System.out.println("Opção 3\n" +
                                                    "Maria brava diz: VOCÊ MATOU ELE E AINDA TEM CORAGEM DE DIZER ISSO SEU DESGRAÇADO!!!!!!!!!\n"
                                                    +
                                                    "\n");
                                            break;
                                        case 4:
                                            System.out.println("Opção 4\n" +
                                                    "Carlos diz normalmente diz: Ele não tem coragem de mentir, e ainda se comporta como um alucinado imbecil\n"
                                                    +
                                                    "\n");
                                            break;
                                        default:
                                            System.out.println("Opação invalida. escolher de 3 ou 4");
                                            break;
                                    }
                                } while (escolhaMp < 3 || escolhaMp > 4);
                                break;
                            }
                            case 2:
                                System.out.println("Opção 2\n" +
                                        "Carlos diz normalmente diz: Foi o joão, ele algumas horas atrás havia brigado com o meu irmão o Luiz Felipe, e foi para a casa e matou o meu irmão, não contente de esfaquear ele, ele queria atirar em nós\n"
                                        +
                                        "\n");
                                break;
                            case 3:
                                System.out.println("Opção 3\n" +
                                        "João bravo diz: seu juiz ele está mentindo, MENTIROSO, EU ESCUTEI OS GRITOS E FUI AJUDAR CORRENO, QUANDU CHEGUEI ELE JÁ TAVA MORTIM\n"
                                        +
                                        "\n");
                                break;
                            default:
                                System.out.println("Opação invalida. escolher de 1, 2 e 3");
                                break;

                        }
                    } while (escolhaM < 1 || escolhaM > 3);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha 1, 2, 3 ou 4.");
                    break;
            }
        } while (escolha < 1 || escolha > 4);

        scanner.close();
    }
}