import java.text.Format;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Desafios {
    public static void main(String[] args) {
        String tarefa = "Enviar relatório semanal";

        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();

        System.out.println(tarefa);
        System.out.println("Data atual: " + dataAtual);
        System.out.println("Hora atual: " + horaAtual);

        DateTimeFormatter formato =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Data formatada: " + formato.format(dataAtual));
        System.out.println("Hora formatada: " + formatoHora.format(horaAtual));

        LocalTime inicio = LocalTime.of(14, 40);
        LocalTime fim = LocalTime.of(22, 18);

        Duration duracao = Duration.between(inicio, fim);
        System.out.println("Diferença de tempo: " + duracao.toHoursPart() + "  horas "
                + duracao.toMinutesPart() + " minutos");

        LocalDate dataInicio = LocalDate.of(2020, 10, 12);
        LocalDate dataFinal = dataInicio.plusDays(60);
        DateTimeFormatter formatoDataFinal = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data da entrega final: " +  formatoDataFinal.format(dataFinal));

        LocalDate dataVencimentoOriginal =  LocalDate.of(2025, 3, 12);
        LocalDate dataVencimentoFinal = dataVencimentoOriginal.plusMonths(2);
        DateTimeFormatter formatoDataVencimento = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Nova data de vencimento: " +  formatoDataVencimento.format(dataVencimentoFinal));

        LocalDate dataEvento =  LocalDate.of(2025, 6, 20);
        DateTimeFormatter formatoDataEvento = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data da evento: " +  formatoDataEvento.format(dataEvento));
        LocalDate dataDeHoje =  LocalDate.now();
        DateTimeFormatter formatoDataDeHoje = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data de hoje: " + formatoDataDeHoje.format(dataDeHoje));

        if(dataDeHoje.isBefore(dataEvento)){
            System.out.println("O envento ainda não aconteceu!");
        }
        else if(dataDeHoje.isAfter(dataEvento)){
            System.out.println("O evento já aconteceu!");
        }
        else{
            System.out.println("O evento está acontecendo!");
        }

        LocalDate dataVencimento = LocalDate.of(2025, 6, 15);
        int antecedenciaDias = 10;
        LocalDate lembreteVencimento =  dataVencimento.minusDays(antecedenciaDias);

        DateTimeFormatter formatoVencimento =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = lembreteVencimento.format(formatoVencimento);

        System.out.println("Data de vencimento: " + dataFormatada);
    }
}
