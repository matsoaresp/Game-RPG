package Personagens;

public abstract class Personagem {
    private String nome;
    private int vida;
    private String especialidade;
    private String descricao;
    private String altura;
    private String sexo;


    public Personagem(String nome, int vida, String especialidade, String descricao, String altura, String sexo) {
        this.nome = nome;
        this.vida = vida;
        this.especialidade = especialidade;
        this.descricao = descricao;
        this.altura = altura;
        this.sexo = sexo;

    }

    public String getNome() {
        return nome;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void imprimePersonagem() {
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Altura: " + getAltura());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Vida: " + getVida());
        System.out.println("Especialidade: " + getEspecialidade());
    }


}
