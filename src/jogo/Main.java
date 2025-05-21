package jogo;

import personagens.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Personagem> listaPersonagens = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        CriacaoPersonagem criacao = new CriacaoPersonagem(listaPersonagens);
        Historia historia = new Historia(listaPersonagens);

        criacao.escolherPersonagem();

        if (!listaPersonagens.isEmpty()) {
            Personagem heroi = listaPersonagens.get(0);
            Historia.introducao();

            Historia.primeiraMissao(heroi);
            esperarEnter(scanner);

            if (heroi.getVida() > 0) {
                Historia.segundaMissao(heroi);
                esperarEnter(scanner);


            }

            if (heroi.getVida() > 0) {
                Historia.terceiraMissao(heroi);
                esperarEnter(scanner);


            }

            if (heroi.getVida() > 0) {
                Historia.quartaMissao(heroi);
                esperarEnter(scanner);


            }

            if (heroi.getVida() > 0) {
                Historia.resetarVida();
                Historia.quintaMissao(heroi);

            }

        } else {
            System.out.println("Nenhum personagem criado.");
        }

        scanner.close();
    }

    private static void esperarEnter(Scanner scanner) {
        System.out.println("\nPressione ENTER para continuar para a próxima missão");
        scanner.nextLine();
    }
}
