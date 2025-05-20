package personagens;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CriacaoPersonagem {
    private List<Personagem> personagens;

    public CriacaoPersonagem() {
        this.personagens = new ArrayList<>();
    }

    public CriacaoPersonagem(List<Personagem> listaPersonagens) {
        this.personagens = listaPersonagens;
    }



    public void adicionarPersonagem(int tipo) {
        Personagem novoPersonagem = criarPersonagem(tipo);
        if (novoPersonagem != null) {
            personagens.add(novoPersonagem);
            System.out.println("Personagem criado com sucesso!");
        }
    }
    private String sexoPersonagem (String sexo) {
        if (sexo.equalsIgnoreCase("Masculino")) {
            return "Homem";
        }else if (sexo.equalsIgnoreCase("Feminino")) {
            return "Mulher";
        } else {
            return "Outro/Não informado";
        }
    }

    public Personagem criarPersonagem(int tipo) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do personagem: ");
        String nome = sc.nextLine().trim();

        if (nome.isEmpty()) {
            System.out.println("Erro: nome não pode estar em branco!");
            return null;
        }

        System.out.println("Digite o sexo do personagem (Masculino/Feminino): ");
        String sexo = sc.nextLine().trim();

        if (sexo.isEmpty()) {
            System.out.println("Erro: sexo não pode estar em branco!");
            return null;
        }

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
            System.out.println("Gênero: " + sexoPersonagem(p.getSexo()));
            System.out.println("------------");

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
                        "╠════════════════════════════════════════════╣\n" +
                        "║  4. 👀 Personagens do jogo                 ║\n" +
                        "║  0. 🚪 Iniciar o jogo                      ║\n" +
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