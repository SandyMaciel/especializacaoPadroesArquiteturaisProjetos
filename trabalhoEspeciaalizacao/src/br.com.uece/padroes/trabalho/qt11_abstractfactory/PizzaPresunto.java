package qt11_abstractfactory;

public class PizzaPresunto implements Pizza {

	@Override
	public String montaPizza() {
		String ingredientes = "queijo + presunto + tomate";
		return ingredientes;
	}

}
