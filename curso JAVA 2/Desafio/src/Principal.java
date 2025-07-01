public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setNome("Die with a Smile");
        minhaMusica.setCantor("Bruno Mars e Lady Gaga");
        minhaMusica.setDuracao(4.11);
        minhaMusica.informacoesAudio();

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            minhaMusica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setNome("BolhaDev");
        podcast.setApresentador("Marcus Mendes");
        podcast.setDuracao(180);
        podcast.informacoesAudio();

        for (int i = 0; i < 5000; i++) {
            podcast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }

        MInhasPreferidas preferida = new MInhasPreferidas();
        preferida.inclui(podcast);
        preferida.inclui(minhaMusica);
    }
}
