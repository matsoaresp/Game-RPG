package Personagens;

public class Assassino extends Personagem {


    public Assassino(String nome, String sexo) {
        super(
                nome, 150,
                "uma classe de personagem especializada em combate furtivo e dano letal, com foco em eliminar inimigos com precisão e rapidez. Eles são conhecidos por sua habilidade em ataques furtivos, venenos e esquivas, tornando-os um oponente difícil para qualquer grupo.\n",
                "Ágil, furtivo e mortal, o assassino é um mestre das sombras e da precisão. " +
                        "Treinado para eliminar alvos com rapidez e discrição, ele domina técnicas de infiltração, venenos e ataques críticos, " +
                        "muitas vezes finalizando o inimigo antes que este perceba sua presença. " +
                        "Vestindo armaduras leves para manter a mobilidade, o assassino prefere agir sozinho, mas pode ser uma peça-chave em missões que exigem sigilo e precisão. " +
                        "Embora não seja tão resistente quanto outros combatentes, compensa com velocidade, inteligência tática e letalidade extrema."
                ,
                "1,20",
                sexo
        );
    }

    }

