import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nome = "Clarice Boaventura";
        String tipoConta = "Conta corrente";
        double saldo = 2500;
        int opcao = 0;

        System.out.println("Dados Inciais do cliente: ");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo da conta: " + saldo);

        String menu = """
                    \nDigite uma dessas opções:
                \n1 - Consultar saldo
                2 - Fazer transferencia
                3 - Receber transferencia
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo da conta é: " + saldo);
            }
            else if (opcao == 2) {
                System.out.println("Informe o valor que você quer transaferir: ");
                double transferencia = leitura.nextInt();
                if (transferencia > saldo) {
                    System.out.println("Não há saldo o suficiente!");
                }
                else {
                    saldo -= transferencia;
                    System.out.println("Saldo atualizado: " + saldo);
                }
            }
            else if (opcao == 3) {
                System.out.println("Informe o valor que você recebeu: ");
                double valorRecebido = leitura.nextInt();
                saldo += valorRecebido;
                System.out.println("Saldo atualizado: " + saldo);
            }
            else if (opcao != 4) {
                System.out.println("Número inválido.");
            }
        }
    }
    }