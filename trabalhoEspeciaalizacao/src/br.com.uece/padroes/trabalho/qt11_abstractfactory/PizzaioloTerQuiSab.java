package qt11_abstractfactory;

public class PizzaioloTerQuiSab implements PizzaioloFactory {

	@Override
	public Pizza criarPizza() {

		return new PizzaPresunto();
	}

}