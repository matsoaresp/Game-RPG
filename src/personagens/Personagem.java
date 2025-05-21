package personagens;

public abstract class Personagem {
    private String nome;
    private int vida;
    private int vidaExtra;
    private String especialidade;
    private String descricao;
    private String altura;
    private String sexo;

    public Personagem(String nome, int vida, int vidaExtra, String especialidade, String descricao, String altura,String sexo) {
        this.nome = nome;
        this.vida = vida;
        this.vidaExtra = vidaExtra;
        this.especialidade = especialidade;
        this.descricao = descricao;
        this.altura = altura;
        this.sexo = sexo;
    }


    public int getVidaExtra() {
        return vidaExtra;
    }

    public void setVidaExtra(int vidaExtra) {
        this.vidaExtra = vidaExtra;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getAltura() {
        return altura;
    }

    public String getSexo() {
        return sexo;
    }


    public void setVida(int vida) {
        this.vida = vida;
    }


    public void imprimePersonagem() {
        System.out.println("Nome: " + getNome());
        System.out.println("Altura: " + getAltura());
        System.out.println("Vida: " + getVida());
        System.out.println("Especialidade: " + getEspecialidade());
        System.out.println("Descrição: " + getDescricao());
    }
}


