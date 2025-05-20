package jogo;

import personagens.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Personagem> listaPersonagens = new ArrayList<>();

        CriacaoPersonagem criacao = new CriacaoPersonagem(listaPersonagens);
        Historia historia = new Historia(listaPersonagens);

        criacao.escolherPersonagem();

        if (!listaPersonagens.isEmpty()) {
            Historia.introducao();
            Historia.primeiraMissao(listaPersonagens.get(0));
        } else {
            System.out.println("Nenhum personagem criado.");
        }
    }
}
