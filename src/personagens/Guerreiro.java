package personagens;

public class Guerreiro extends Personagem {
    public Guerreiro(String nome, String sexo) {
        super(nome, 200, 30, "Guerreiro", "Combatente resistente e habilidoso em lutas corpo a corpo, mestre em armas e armaduras.", "2,10", sexo);
    }

    public Guerreiro(String nome, int vida, int vidaExtra, String tipo, String descricao, String altura, String sexo) {
        super(nome, vida, vidaExtra, tipo, descricao, altura, sexo);
    }
}
