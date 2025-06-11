public class Condcional {
    public static void main(String[] args) {
        int anoDeLancamento = 2021;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 9.5;

        String tipoPlano = "plus";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        }
        else{
            System.out.println("Filme retro que vale apena assistir!");
        }

        if(incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Incluido no plano!");
        }
        else{
            System.out.println("Você deve fazer a assinatura desse plano para assistir esse filme!");
        }
    }
}
