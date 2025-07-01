import java.time.*;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiraParcela = LocalDate.of(2025, 5, 05);
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);

        if (dataSegundaParcela.isBefore(LocalDate.now())) {
            System.out.println("Anterior ao dia do vencimento");
        }
        else {
            System.out.println("Superior ao dia do vencimento");
        }

        System.out.println("Data de compra: " + dataCompra);
        System.out.println("Data da primeira parcela: " + dataPrimeiraParcela);
        System.out.println("Data da segunda parcela: " + dataSegundaParcela);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data de compra formatada: " + dataCompra.format(formato));

        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
        System.out.println("Data de conclusao compra : " + dataConclusaoCompra);

        ZonedDateTime dataCompraNy = dataConclusaoCompra.withZoneSameInstant
                (ZoneId.of("America/New_York"));
        System.out.println("Data de conclusao compra formatada: " + dataCompraNy);

        LocalTime inicio = LocalTime.of(9, 0);
        LocalTime fim = LocalTime.of(17, 30);

        Duration duracao = Duration.between(inicio, fim);
        System.out.println("Duração do expediente: " + duracao.toHours() +
                " horas e " + duracao.toMinutesPart() + " minutos");

        LocalDate dataPagamento = LocalDate.parse("2025-10-30");
        Period periodo = Period.between(dataCompra, dataPagamento);
        System.out.println("Diferença de: " + periodo.getDays() + " dias " +  periodo.getMonths() + " meses "
        + periodo.getYears() + " anos");
    }
}
