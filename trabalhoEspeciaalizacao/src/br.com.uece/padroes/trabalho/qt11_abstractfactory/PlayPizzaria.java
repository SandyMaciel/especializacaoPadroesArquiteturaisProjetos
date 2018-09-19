package qt11_abstractfactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class PlayPizzaria {

	public static void main(String[] args) throws ParseException {
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com uma data: ");
		String dtRecebida = ler.next();

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date dt = df.parse(dtRecebida);
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(dt);
		int diaDaSemana = gc.get(GregorianCalendar.DAY_OF_WEEK);

		PizzaioloFactory pizzaiolo = null;

		if (diaDaSemana == 1) {
			pizzaiolo = new PizzaioloDom();
		} else if (diaDaSemana == 2 || diaDaSemana == 4 || diaDaSemana == 6) {
			pizzaiolo = new PizzaioloSegQuaSex();
		} else {
			pizzaiolo = new PizzaioloTerQuiSab();
		}
		
		System.out.println(pizzaiolo.criarPizza().montaPizza());

	}
}
