import java.util.Random;
import java.util.Scanner;

public class Desafios {
    public static void main(String[] args) {

        double celcius = 20;
        double fahrenheit;
        fahrenheit = ((celcius * 9) / 5) + 32;
        System.out.println(fahrenheit);
        double precoProduto = 182.90;
        int quantidade = 4;
        double precoTotal = precoProduto * quantidade;
        System.out.println(precoTotal);

        Random random = new Random();
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = random.nextInt(10);
        int numeroDigitado = 0;

        while (numeroDigitado != numeroAleatorio) {

            System.out.println("Tente adivinhar o número aleatório de 1 a 10: ");
            numeroDigitado = leitura.nextInt();

            if (numeroDigitado == numeroAleatorio) {
                System.out.println("Você acertou o número aleátório!");
            } else {
                System.out.println("Tente de novo: ");
            }
            numeroDigitado = leitura.nextInt();
            if (numeroDigitado == numeroAleatorio) {
                System.out.println("Você acertou o número aleatório");
            }
        }
    }
}
