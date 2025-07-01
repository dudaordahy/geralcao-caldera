package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(1970, "O poderoso chefão");
        meuFilme.avalia(9);
        Filme outroFilme = new Filme(2023, "Avatar");
        outroFilme.avalia(6);
        var filmeDaDuda = new Filme(2012, "Vingadores");
        filmeDaDuda.avalia(10);
        Serie minhaSerie = new Serie(2000, "Lost");

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDaDuda);
        lista.add(minhaSerie);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        List<String> artistas = new LinkedList<>();
        artistas.add("Maria");
        artistas.add("João");
        artistas.add("rafael");
        System.out.println(artistas);
        Collections.sort(artistas);
        System.out.println(artistas);

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoLacamento));
    }
}
