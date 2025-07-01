public class Principal {
    public static void main(String[] args) {
        double valorDouble = 19.5;
        int valorInt = (int) valorDouble;

        System.out.println(valorInt);

        double nota1 = 10;
        double nota2 = 9.5;
        double nota3 = 7.8;

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média das notas é : " + media);

        int celcius = 20;
        double fahrenheit = (celcius * 9/5) + 32;

        System.out.println("Fahrenheit: " + fahrenheit);

        int numero = 9;

        if (numero % 2 == 0){
            System.out.println("O número é par");
        }
        else {
            System.out.println("O numero é impar");
        }
    }
}
