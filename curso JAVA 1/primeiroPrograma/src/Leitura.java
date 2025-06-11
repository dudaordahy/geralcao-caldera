import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("Digite a data de lançamento desse filme: ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Diga a sua avaliação para o filme: ");
        double notaDoFilme = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(notaDoFilme);
    }
}
