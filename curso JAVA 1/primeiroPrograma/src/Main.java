//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Imprimindo informações
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Vingadores Ultimato");
        // Usando variáveis e imprimindo as variáveis
        int anoDeLançamento = 2021;
        System.out.println("Ano de lamçamento: " + anoDeLançamento);
        boolean incluidoNoPlano = false;
        System.out.println(incluidoNoPlano);
        double notaDoFilme = 9.5;
        System.out.println("Nota do Filme: " + notaDoFilme);
        double media = (9.3 + 8.7 + 9.0) / 3;
        System.out.println(media);
        //Usando String
        String sinopse;
        sinopse = "Filme de ação com super-heróis, que precisam salvar o mudno após metade da população do planeta sumir";
        System.out.println(sinopse);
        //Aprendendo casting
        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}