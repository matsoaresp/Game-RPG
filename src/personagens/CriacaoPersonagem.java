package personagens;

import java.util.List;
import java.util.Scanner;

public class CriacaoPersonagem {
    private List<Personagem> personagens;

    public CriacaoPersonagem(List<Personagem> listaPersonagens) {
        this.personagens = listaPersonagens;
    }

    public void escolherPersonagem() {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (true) {
            opcaoPersonagem();

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();

                if (opcao == 0) {
                    break;
                } else if (opcao >= 1 && opcao <= 3) {
                    criarPersonagem(opcao, scanner);
                    break;
                } else if (opcao == 4) {
                    listarPersonagens();
                } else {
                    System.out.println("Opção inválida! Tente novamente.");
                }
            } else {
                System.out.println("Digite apenas números!");
                scanner.nextLine();
            }
        }
    }

    private void criarPersonagem(int tipo, Scanner scanner) {
        System.out.print("Digite o nome do personagem: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sexo (Masculino/Feminino): ");
        String sexo = scanner.nextLine();

        switch (tipo) {
            case 1:
                personagens.add(new Mago(nome, sexo));
                break;
            case 2:
                personagens.add(new Assassino(nome, sexo));
                break;
            case 3:
                personagens.add(new Guerreiro(nome, sexo));
                break;
        }
        System.out.println("Personagem criado com sucesso!");
    }

    public void listarPersonagens() {
        if (personagens.isEmpty()) {
            System.out.println("Nenhum personagem cadastrado");
            return;
        }

        System.out.println("\n=== PERSONAGENS DO JOGO ===");
        for (Personagem p : personagens) {
            p.imprimePersonagem();
            System.out.println("Gênero: " + sexoPersonagem(p.getSexo()));
            System.out.println("------------");
        }
    }

    private String sexoPersonagem(String sexo) {
        if (sexo.equalsIgnoreCase("Masculino")) {
            return "Homem";
        } else if (sexo.equalsIgnoreCase("Feminino")) {
            return "Mulher";
        } else {
            return "Outro/Não informado";
        }
    }

    public static void opcaoPersonagem() {
        System.out.println(
                "╔════════════════════════════════════════════╗\n" +
                        "║             CRIE SEU PERSONAGEM            ║\n" +
                        "╠════════════════════════════════════════════╣\n" +
                        "║  1.🧙 M A G O                              ║\n" +
                        "║      (∩｀-´)⊃━☆ﾟ.*･｡                        ║\n" +
                        "║      Domina os elementos da natureza       ║\n" +
                        "║                                            ║\n" +
                        "║  CARACTERÍSTICAS:                          ║\n" +
                        "║  • Vida: 100                               ║\n" +
                        "║  • Habilidade: Soltar Magia                ║\n" +
                        "║  • Descrição: Nascido com aptidão ao       ║\n" +
                        "║    conhecimento, aos estudos das práticas  ║\n" +
                        "║    arcanas e ao descobrimento do           ║\n" +
                        "║    desconhecido.                           ║\n" +
                        "║  • Altura: 1,75                            ║\n" +
                        "╠════════════════════════════════════════════╣\n" +
                        "║  2. 🗡️ A S S A S S I N O                   ║\n" +
                        "║      (⌐■_■)  ─╼                            ║\n" +
                        "║      Silencioso e letal com a lâmina       ║\n" +
                        "║                                            ║\n" +
                        "║  CARACTERÍSTICAS:                          ║\n" +
                        "║  • Vida: 150                               ║\n" +
                        "║  • Habilidade: Ataques furtivos            ║\n" +
                        "║  • Descrição: Treinado para eliminar alvos ║\n" +
                        "║    com precisão e agir nas sombras.        ║\n" +
                        "║  • Altura: 1,80                            ║\n" +
                        "╠════════════════════════════════════════════╣\n" +
                        "║  3. 🛡️ G U E R R E I R O                   ║\n" +
                        "║      o==[::::::::::::>                     ║\n" +
                        "║      Defensor da honra                     ║\n" +
                        "║                                            ║\n" +
                        "║  CARACTERÍSTICAS:                          ║\n" +
                        "║  • Vida: 200                               ║\n" +
                        "║  • Habilidade: Combate físico              ║\n" +
                        "║  • Descrição: Combatente resistente e      ║\n" +
                        "║    habilidoso em lutas corpo a corpo,      ║\n" +
                        "║    mestre em armas e armaduras.            ║\n" +
                        "║  • Altura: 2,10                            ║\n" +
                        "╚════════════════════════════════════════════╝\n"

        );
    }
    public void escolherPersonagens() {
        Scanner scanner = new Scanner(System.in);

        opcaoPersonagem();

        int opcao = -1;
        boolean entradaValida = false;

        while (!entradaValida) {

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();
                switch (opcao) {
                    case 1:
                        personagens.add(new Guerreiro(
                                "Thoran", 200, 30, "Guerreiro",
                                "Combatente resistente e habilidoso em lutas corpo a corpo, mestre em armas e armaduras.",
                                "2,10", "Masculino"
                        ));
                        entradaValida = true;
                        break;
                    case 2:
                        personagens.add(new Mago(
                                "Elandra", 100, 25, "Mago",
                                "Nascido com aptidão ao conhecimento, aos estudos das práticas arcanas e ao descobrimento do desconhecido.",
                                "1,75", "Feminino"
                        ));
                        entradaValida = true;
                        break;
                    case 3:
                        personagens.add(new Assassino(
                                "Kael", 150, 20, "Assassino",
                                "Treinado para eliminar alvos com precisão e agir nas sombras.",
                                "1,80", "Masculino"
                        ));
                        entradaValida = true;
                        break;
                    default:
                        System.out.print("Opção inválida. Tente novamente: ");
                        break;
                }
            } else {
                System.out.print("Digite apenas números válidos (1, 2 ou 3): ");
                scanner.nextLine();
            }
        }
    }


}