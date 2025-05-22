package personagens;

public class Assassino extends Personagem {
    public Assassino(String nome, String sexo) {
        super(nome, 150, 150, "Assassino", "Treinado para eliminar alvos com precisão e agir nas sombras.", "1,80", sexo);
    }


    public Assassino(String nome, int vida, int vidaExtra, String tipo, String descricao, String altura, String sexo) {
        super(nome, vida, vidaExtra, tipo, descricao, altura, sexo);
    }
}
