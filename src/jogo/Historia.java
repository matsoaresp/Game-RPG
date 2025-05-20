package jogo;

import personagens.Personagem;
import java.util.List;

public class Historia {
    List<Personagem> personagens;

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

    public static void primeiraMissao(Personagem jogador) {
        System.out.println("\n[VILAREJO DE AURION]");
        System.out.println("Aldeão: \"Salve-nos, " + jogador.getNome() + "! Lobos das Trevas atacam nossa vila!\"");
        System.out.println("-> Derrote 3 lobos para provar seu valor\n");
    }
}
