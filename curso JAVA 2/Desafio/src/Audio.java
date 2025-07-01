public class Audio {
    private String nome;
    private double duracao;
    private int totalReproducao;
    private int curtidas;
    private int classificacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void informacoesAudio(){
        System.out.println("Nome do áudio: " + nome);
        System.out.println("Duração do áudio: " + duracao);
    }

    public void curte(){
        this.curtidas++;
    }

    public void reproduz(){
        this.totalReproducao++;
    }
}
