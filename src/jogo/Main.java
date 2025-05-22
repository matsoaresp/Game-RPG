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

        System.out.println("🎮 Bem-vindo ao RPG de Eldria!");
        criacao.escolherPersonagens();

        if (!listaPersonagens.isEmpty()) {
            Personagem heroi = listaPersonagens.get(0);
            Historia.introducao();

            System.out.println("\n🔍 Informações do personagem escolhido:");
            heroi.imprimePersonagem();
            esperarEnter(scanner);

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
                System.out.println("\n🎁 Parabéns! Você ganhou vida extra: +" + heroi.getVidaExtra());
                Historia.resetarVida();
                esperarEnter(scanner);
                Historia.quintaMissao(heroi);
            }
        } else {
            System.out.println("Nenhum personagem selecionado. O jogo será encerrado.");
        }

        scanner.close();
    }

    private static void esperarEnter(Scanner scanner) {
        System.out.println("\nPressione ENTER para continuar...");
        scanner.nextLine();
    }
}
