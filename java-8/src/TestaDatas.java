import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class TestaDatas {
	public static void main(String[] args) {
		
		// Data atual
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		// Futuro
		LocalDate futuro = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(futuro);
		
		// Periodo
		Period periodo = Period.between(hoje, futuro);
		System.out.println(periodo);
		
		// Formatador
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoje.format(formatador));
	}
}
