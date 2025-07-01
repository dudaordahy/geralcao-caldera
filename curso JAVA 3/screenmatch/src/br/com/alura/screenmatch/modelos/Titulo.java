package br.com.alura.screenmatch.modelos;

public class Titulo implements  Comparable<Titulo>{
    @Override
    public int compareTo(Titulo o) {
        return this.getNome().compareTo(o.getNome());
    }

    private String nome;
    private int anoLacamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalAvaliacao;
    private int duracaoEmMinutos;

    public Titulo(int anoLacamento, String nome) {
        this.anoLacamento = anoLacamento;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLacamento() {
        return anoLacamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalAvaliacao(){
        return totalAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLacamento(int anoLacamento) {
        this.anoLacamento = anoLacamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecinica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de laçamento do filme: " + anoLacamento);
    }
    public void avalia(double nota){
        somaAvaliacao += nota;
        totalAvaliacao++;
    }
    public double pegaMedia(){
        return(somaAvaliacao/totalAvaliacao);
    }
}
