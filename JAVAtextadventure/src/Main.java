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
                    "\n" );

            System.out.println("Opção 3\n" +
                    "Ouvir Réu Carlos\n" +
                    "\n" );

            System.out.println("Opção 4\n" +
                    "Ouvir Réu Maria\n" +
                    "\n" );

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("No local do crime a vítima foi encontrada com um 6 facadas na região do peito, e ao perguntar aos suspeitos Maria a única a confessar diz ter sido João.");
                     //dentro de cada uma destas opções vamos colocar de dois até 4 "int do" e isso vai ser demorado pra krl kkkk 
                                                        //de cada opção kkkkkkkkkkkkkkkk fiquei até agora só pra fazer 4 subtextos
                        int  escolhaPolicia;
                        do {    
                                System.out.println ("\n");
                                System.out.println ("O que deseja fazer agora?");
                                System.out.println ("2 - Ouvir réu João"+"\n" +"3 - Ouvir réu Carlos"+"\n" +"4 - Ouvir réu Maria");
                                escolhaPolicia = scanner.nextInt();
                                
                                switch (escolhaPolicia) { 
                                case 2: { System.out.println("Opção 2\n" +
                                                "\n" +
                                                "João nervoso diz: seu juiz armaro pra mim num é possive, eu escutei os grito na otra casa e fui correno ajuda, chegueime la e o caba tava mortim\"\n" +
                                                "\n" );
                                                
                                                int  escolhaPoliciajoão;
                                                do {    
                                                        System.out.println ("\n");
                                                        System.out.println ("O que deseja fazer agora?");
                                                        System.out.println ("3 - Ouvir réu Carlos"+"\n" +"4 - Ouvir réu Maria");
                                                        escolhaPoliciajoão = scanner.nextInt();
                                                        
                                                        switch (escolhaPoliciajoão) { 
                                                        
                                                        case 3: System.out.println("Opção 3\n" +
                                                                        "Carlos diz normalmente diz: Foi o joão, ele algumas horas atrás havia brigado com o meu irmão o Luiz Felipe, e foi para a casa e matou o meu irmão, não contente de esfaquear ele, ele queria atirar em nós\n" +
                                                                        "\n" ); 
                                                                        break;
                                                        case 4: System.out.println("Opção 4\n" +
                                                                        "Maria desesperada diz: Foi ele, foi ele, seu MENTIROSO, ALÉM DE ESFAQUEAR MEU CUNHADO ELE QUERIA ATIRAR EM NÓS. e começa a chorar desesperada\n" +
                                                                        "\n" );
                                                                        break;
                                                        default: System.out.println("Opação invalida. escolher de 3 ou 4" );
                                                                        break;
                                                        }    }    while (escolhaPoliciajoão < 3 || escolhaPoliciajoão > 4);   
                                                                        break;
                                                                    }
                                case 3: {System.out.println("Opção 3\n" +
                                                 "Carlos diz normalmente diz: Foi o joão, ele algumas horas atrás havia brigado com o meu irmão o Luiz Felipe, e foi para a casa e matou o meu irmão, não contente de esfaquear ele, ele queria atirar em nós\n" +
                                                "\n" ); 
                                                
                                                int  escolhaPoliciacarlos;
                                                do {    
                                                        System.out.println ("\n");
                                                        System.out.println ("O que deseja fazer agora?");
                                                        System.out.println ("3 - Ouvir réu João"+"\n" +"4 - Ouvir réu Maria");
                                                        escolhaPoliciacarlos = scanner.nextInt();
                                                        
                                                        switch (escolhaPoliciacarlos) { 
                                                        
                                                        case 3: System.out.println("Opção 3\n" +
                                                                        "João bravo diz: seu juiz ele está mentindo, MENTIROSO, EU ESCUTEI OS GRITOS E FUI AJUDAR CORRENO, QUANDU CHEGUEI ELE JÁ TAVA MORTO\n" +
                                                                        "\n" ); 
                                                                        break;
                                                        case 4: System.out.println("Opção 4\n" +
                                                                        "Maria desesperada diz: Foi ele, foi ele, seu MENTIROSO, ALÉM DE ESFAQUEAR MEU CUNHADO ELE QUERIA ATIRAR EM NÓS. e começa a chorar desesperada\n" +
                                                                        "\n" );
                                                                        break;
                                                        default: System.out.println("Opação invalida. escolher de 3 ou 4" );
                                                                        break;
                                                        }    }    while (escolhaPoliciacarlos < 3 || escolhaPoliciacarlos > 4);   
                                                                        break;
                                                                    }
                                case 4: {System.out.println("Opção 4\n" +
                                                "Maria desesperada diz: Foi ele, foi ele, além de esfaquear no meu cunhado ele queria nos atirar em nós. e começa a chorar desesperada\n" +
                                                "\n" );

                                                int  escolhaPoliciamaria;
                                                do {    
                                                        System.out.println ("\n");
                                                        System.out.println ("O que deseja fazer agora?");
                                                        System.out.println ("3 - Ouvir réu Carlos"+"\n" +"4 - Ouvir réu João");
                                                        escolhaPoliciamaria = scanner.nextInt();
                                                        
                                                        switch (escolhaPoliciamaria) { 
                                                        
                                                        case 3: System.out.println("Opção 3\n" +
                                                                        "Carlos diz normalmente diz: Foi o joão, ele algumas horas atrás havia brigado com o meu irmão o Luiz Felipe, e foi para a casa e matou o meu irmão, não contente de esfaquear ele, ele queria atirar em nós\n" +
                                                                        "\n" ); 
                                                                        break;
                                                        case 4: System.out.println("Opção 4\n" +
                                                                        "João bravo diz: seu juiz ela está mentindo, MENTIROSA, EU ESCUTEI OS GRITOS E FUI AJUDAR CORRENO, QUANDU CHEGUEI ELE JÁ TAVA MORTO\n" +
                                                                        "\n");
                                                                        break;
                                                        default: System.out.println("Opação invalida. escolher de 3 ou 4" );
                                                                        break;
                                                        }    }    while (escolhaPoliciamaria < 3 || escolhaPoliciamaria > 4);   
                                                                        break;
                                                                    }
                                default: System.out.println("Opação invalida. escolher de 4 a 2" );
                                                break;                
                                                       
                        }    }    while (escolhaPolicia < 2 || escolhaPolicia > 4);
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
                    System.out.println("João nervoso diz: seu juiz armaro pra mim num é possive, eu escutei os grito na otra casa e fui correno ajuda, chegueime la e o caba tava mortim");
                                      
                        int  escolhaJoão;
                        do {    
                                System.out.println ("\n");
                                System.out.println ("O que deseja fazer agora?");
                                System.out.println ("1 - Ouvir os policiais"+"\n" +"2 - Ouvir réu Carlos"+"\n" +"3 - Ouvir réu Maria");
                                escolhaJoão = scanner.nextInt();
                                        
                                switch (escolhaJoão) { 
                                case 1: System.out.println("Opção 1\n" +
                                                        "\n" +
                                                        "No local do crime a vítima foi encontrada com um 6 facadas na região do peito, e ao perguntar aos suspeitos Maria a única a confessar diz ter sido João.”\"\n" +
                                                        "\n" );
                                                        break;
                                case 2: System.out.println("Opção 2\n" +
                                                        "Carlos diz normalmente diz: Foi o joão, ele algumas horas atrás havia brigado com o meu irmão o Luiz Felipe, e foi para a casa e matou o meu irmão, não contente de esfaquear ele, ele queria atirar em nós\n" +
                                                        "\n" );
                                                        break;
                                case 3: System.out.println("Opção 3\n" +
                                                        "Maria desesperada diz: Foi ele, foi ele, além de atirar no meu cunhado ele queria nos esfaquear. e começa a chorar desesperada\n" +
                                                        "\n" );
                                                        break;
                                default: System.out.println("Opação invalida. escolher de 1, 2 e 3" );
                                                        break;                
                                                   
                    }    }        while (escolhaJoão < 1 || escolhaJoão > 3);
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
                    System.out.println("Carlos diz normalmente diz: Foi o joão, ele algumas horas atrás havia brigado com o meu irmão o Luiz Felipe, e foi para a casa e matou o meu irmão, não contente de esfaquear ele, ele queria atirar em nós");
                    int  escolhaCarlos;
                    do {    
                                System.out.println ("\n");
                                System.out.println ("O que deseja fazer agora?");
                                System.out.println ("1 - Ouvir os policiais"+"\n" +"2 - Ouvir réu João"+"\n" +"3 - Ouvir réu Maria");
                                escolhaCarlos = scanner.nextInt();
                                        
                                switch (escolhaCarlos) { 
                                case 1: System.out.println("Opção 1\n" +
                                                        "\n" +
                                                        "No local do crime a vítima foi encontrada com um 6 facadas na região do peito, e ao perguntar aos suspeitos Maria a única a confessar diz ter sido João.”\"\n" +
                                                        "\n" );
                                                        break;
                                case 2: System.out.println("Opção 2\n" +
                                                        "João bravo diz: seu juiz ele está mentindo, MENTIROSO, EU ESCUTEI OS GRITOS E FUI AJUDAR CORRENO, QUANDU CHEGUEI ELE JÁ TAVA MORTIM\n" +
                                                        "\n" );
                                                        break;
                                case 3: System.out.println("Opção 3\n" +
                                                        "Maria desesperada diz: Foi ele, foi ele, além de atirar no meu cunhado ele queria nos esfaquear. e começa a chorar desesperada\n" +
                                                        "\n" );
                                                        break;
                                default: System.out.println("Opação invalida. escolher de 1, 2 e 3" );
                                                        break;                
                                                
                        }    }        while (escolhaCarlos < 1 || escolhaCarlos > 3);
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
                    System.out.println("Maria desesperada diz: Foi ele, foi ele, além de atirar no meu cunhado ele queria nos esfaquear. e assim começa a chorar desesperada");
                    int  escolhaMaria;
                    do {    
                                System.out.println ("\n");
                                System.out.println ("O que deseja fazer agora?");
                                System.out.println ("1 - Ouvir os policiais"+"\n" +"2 - Ouvir réu Carlos"+"\n" +"3 - Ouvir réu João");
                                escolhaMaria = scanner.nextInt();
                                        
                                switch (escolhaMaria) { 
                                case 1: System.out.println("Opção 1\n" +
                                                        "\n" +
                                                        "No local do crime a vítima foi encontrada com um 6 facadas na região do peito, e ao perguntar aos suspeitos Maria a única a confessar diz ter sido João.”\"\n" +
                                                        "\n" );
                                                        break;
                                case 2: System.out.println("Opção 2\n" +
                                                        "Carlos diz normalmente diz: Foi o joão, ele algumas horas atrás havia brigado com o meu irmão o Luiz Felipe, e foi para a casa e matou o meu irmão, não contente de esfaquear ele, ele queria atirar em nós\n" +
                                                        "\n" );
                                                        break;
                                case 3: System.out.println("Opção 3\n" +
                                                        "João bravo diz: seu juiz ele está mentindo, MENTIROSO, EU ESCUTEI OS GRITOS E FUI AJUDAR CORRENO, QUANDU CHEGUEI ELE JÁ TAVA MORTIM\n" +
                                                        "\n" );
                                                        break;
                                default: System.out.println("Opação invalida. escolher de 1, 2 e 3" );
                                                        break;                
                                                
                }    }        while (escolhaMaria < 1 || escolhaMaria > 3);      
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha 1, 2, 3 ou 4.");
                    break;
            }
        } while (escolha < 1 || escolha > 4);

        scanner.close();
    }
}