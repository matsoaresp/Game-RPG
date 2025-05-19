package personagens;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CriacaoPersonagem {
    private List<Personagem> personagens;

    public CriacaoPersonagem() {
        this.personagens = new ArrayList<>();
    }

    public void adicionarPersonagem(int tipo) {
        Personagem novoPersonagem = criarPersonagem(tipo);
        if (novoPersonagem != null) {
            personagens.add(novoPersonagem);
            System.out.println("Personagem criado com sucesso!");
        }
    }

    public Personagem criarPersonagem(int tipo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do personagem: ");
        String nome = sc.nextLine();
        System.out.println("Digite o sexo do personagem: ");
        String sexo = sc.nextLine();

        switch (tipo) {
            case 1:
                return new Mago(nome, sexo);
            case 2:
                return new Assassino(nome, sexo);
            case 3:
                return new Guerreiro(nome, sexo);
            default:
                System.out.println("Tipo inválido");
                return null;
        }
    }

    public void listarPersonagens() {
        if (personagens.isEmpty()) {
            System.out.println("Nenhum personagem cadastrado");
            return;
        }

        System.out.println("\n=== PERSONAGENS DO JOGO ===");
        for (Personagem p : personagens) {
            p.imprimePersonagem();
            System.out.println("------------");
        }
    }

    public static void opcaoPersonagem() {
        System.out.println(
                "╔════════════════════════════════════════════╗\n" +
                        "║             CRIE SEU PERSONAGEM            ║\n" +
                        "╠════════════════════════════════════════════╣\n" +
                        "║  1.🧙 M A G O                              ║\n" +
                        "║      (∩｀-´)⊃━☆ﾟ.*･｡                       ║\n" +
                        "║      Domina os elementos da natureza       ║\n" +
                        "╠════════════════════════════════════════════╣\n" +
                        "║  2. 🗡️ A S S A S S I N O                   ║\n" +
                        "║      (⌐■_■)  ─╼                            ║\n" +
                        "║      Silencioso e letal com a lâmina       ║\n" +
                        "╠════════════════════════════════════════════╣\n" +
                        "║  3. 🛡️ G U E R R E I R O                   ║\n" +
                        "║      o==[::::::::::::>                     ║\n" +
                        "║      Defensor da honra                     ║\n" +
                        "╠════════════════════════════════════════════╣\n" +
                        "║  4. 👀 Personagens do jogo                 ║\n" +
                        "║  0. 🚪 Sair do menu de criação             ║\n" +
                        "╚════════════════════════════════════════════╝\n" +
                        "\nEscolha sua classe (0-4): "
        );
    }

    public void escolherPersonagem() {

        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            opcaoPersonagem();
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {

                case 1:

                case 2:

                case 3:
                    adicionarPersonagem(opcao);
                case 4:
                    listarPersonagens();
                    break;
                case 0:
                    System.out.println("Saindo do menu de criação");
                default:
                    System.out.println("Opcão inválida tente novamente!");
            }
        } while (opcao != 0);

    }
}