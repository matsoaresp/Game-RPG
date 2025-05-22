package personagens;

public class Mago extends Personagem {
    public Mago(String nome, String sexo) {
        super(nome, 100, 50, "Mago", "Nascido com aptidão ao conhecimento, aos estudos das práticas arcanas e ao descobrimento do desconhecido.", "1,75", sexo);
    }

    public Mago(String nome, int vida, int vidaExtra, String tipo, String descricao, String altura, String sexo) {
        super(nome, vida, vidaExtra, tipo, descricao, altura, sexo);
    }
}
