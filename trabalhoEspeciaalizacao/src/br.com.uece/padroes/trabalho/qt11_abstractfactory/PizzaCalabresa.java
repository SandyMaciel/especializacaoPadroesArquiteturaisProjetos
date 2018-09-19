package qt11_abstractfactory;

public class PizzaCalabresa implements Pizza {

	@Override
	public String montaPizza() {
		String ingredientes = "Queijo + Calabresa + Tomate";
		return ingredientes;
	}

}
