package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(1970, "O poderoso chefão");
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecinica();
        meuFilme.avalia(9);
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacao());
        System.out.println("Média total das avaliações: " + meuFilme.pegaMedia());

        Serie minhaSerie = new Serie(2000, "Lost");
        minhaSerie.exibeFichaTecinica();
        minhaSerie.setTemporadas(10);
        minhaSerie.setMinutosPorEpisodio(40);
        minhaSerie.setEpisodiosPorTemporada(10);

        System.out.println("Duração da série Lost: " +  minhaSerie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme(2023, "Avatar");
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(minhaSerie);
        System.out.println("Tempo total para assitir os filmes: " + calculadora.getTempoTotal() + " minutos");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDaDuda = new Filme(2012, "Vingadores");
        filmeDaDuda.setDuracaoEmMinutos(200);
        filmeDaDuda.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(filmeDaDuda);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println(listaDeFilmes);
        System.out.println(listaDeFilmes.get(0).toString());;
    }
}
