import Personagens.Personagem;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {


    public Personagem criaPersonagem(int caso) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do personagem: ");
        String nome = sc.nextLine();
        System.out.println("Digite o sexo do personagem: ");
        String sexo = sc.nextLine();

        switch (caso) {
            case 1:
                return new Mago(nome, sexo);
            case 2:
                return new Assassino(nome, sexo);
            case 3:
                return new Guerreiro(nome, sexo);
        }
        return null;
    }

    public static void listaPersonagens(List<Personagem> personagens) {
        for (Personagem p : personagens) {
            p.imprimePersonagem();
            System.out.println("------------");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Personagem> personagens = new ArrayList<>();


        listaPersonagens(personagens);

        sc.close();
    }
}