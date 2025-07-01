package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificado;

public class Filme extends Titulo implements Classificado {
    private String diretor;

    public Filme(int anoLacamento, String nome) {
        super(anoLacamento, nome);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2 ;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoLacamento() + ")";
    }
}