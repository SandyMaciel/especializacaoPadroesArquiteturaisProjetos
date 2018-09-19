package qt11_abstractfactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class PizzaioloSegQuaSex implements PizzaioloFactory {

	@Override
	public Pizza criarPizza() {
		
		return new PizzaCalabresa();
	}


}