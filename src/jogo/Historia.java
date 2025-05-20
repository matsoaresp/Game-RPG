package jogo;

import personagens.Personagem;

import java.util.List;
import java.util.Random;

public class Historia {
    private static Personagem jogador;
    List<Personagem> personagens;
    private static final Random random = new Random();

    public Historia(List<Personagem> personagens) {
        this.personagens = personagens;
    }

    public static void introducao() {
        System.out.println("\n================================================");
        System.out.println("ERA UMA VEZ NO REINO DE ELDRIA...");
        System.out.println("================================================\n");

        System.out.println("Há séculos, as Três Relíquias mantinham o equilíbrio do mundo:");
        System.out.println("- O Cristal Arcano (Magia)");
        System.out.println("- A Lâmina das Sombras (Morte)");
        System.out.println("- O Escudo da Luz (Proteção)\n");

        System.out.println("Mas no eclipse sangrento, o Lorde das Trevas Korvath roubou as relíquias,");
        System.out.println("espalhando caos por Eldria. Como último herdeiro da linhagem dos Guardiões,");
        System.out.println("você deve recuperá-las antes que o mundo seja consumido pelas trevas.\n");

        System.out.println("================================================");
        System.out.println("Sua jornada começa agora...");
        System.out.println("================================================\n");
    }

    public static void mensagemDeSucesso() {
        System.out.println("\n🏆 Missão Concluída!");
        System.out.println("Você superou todos os desafios com coragem e sabedoria!");
        System.out.println("Recompensas adquiridas e experiência aumentada!\n");
    }

    public static void mensagemDeFracasso() {
        System.out.println("\n💀 Missão Fracassada...");
        System.out.println("Seu personagem não conseguiu completar a missão.");
        System.out.println("Mas não desanime! Grandes heróis também aprendem com as quedas.\n");
    }

    private static int gerarDanoAleatorio(int danoBase) {
        int variacao = random.nextInt(21) - 10;
        return Math.max(0, danoBase + variacao);
    }

    public static void executarMissao(String descricaoMissao, Personagem jogador, int danoBase) {
        System.out.println("\n📜 MISSÃO: " + descricaoMissao);
        System.out.println("Você enfrenta perigos e desafios...");

        int danoReal = gerarDanoAleatorio(danoBase);
        jogador.setVida(jogador.getVida() - danoReal);
        System.out.println("Você recebeu " + danoReal + " de dano.");
        System.out.println("Vida restante: " + jogador.getVida());

        if (jogador.getVida() > 0) {
            mensagemDeSucesso();
        } else {
            mensagemDeFracasso();
        }
    }

    public static void primeiraMissao(Personagem jogador) {
        Historia.jogador = jogador;
        System.out.println("\n[VILAREJO DE AURION]");
        System.out.println("Aldeão: \"Salve-nos, " + jogador.getNome() + "! Lobos das Trevas atacam nossa vila!\"");
        executarMissao("Defender o vilarejo de Aurion", jogador, 60);
    }

    public static void segundaMissao(Personagem jogador) {
        executarMissao("Explorar as ruínas antigas em busca da Relíquia Perdida", jogador, 20);
    }

    public static void terceiraMissao(Personagem jogador) {
        executarMissao("Enfrentar os bandidos nas montanhas de Gorgoth", jogador, 30);
    }

    public static void quartaMissao(Personagem jogador) {
        executarMissao("Desvendar o Labirinto do Caos", jogador, 40);
    }

    public static void quintaMissao(Personagem jogador) {
        executarMissao("Combater Korvath, o Lorde das Trevas", jogador, 50);
    }
}
