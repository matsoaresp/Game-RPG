import personagens.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Personagem> personagens = new ArrayList<>();
        CriacaoPersonagem criacao = new CriacaoPersonagem();

        criacao.escolherPersonagem();







        sc.close();
    }
}