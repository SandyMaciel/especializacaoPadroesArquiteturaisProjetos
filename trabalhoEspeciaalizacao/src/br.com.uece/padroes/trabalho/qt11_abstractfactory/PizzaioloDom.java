package qt11_abstractfactory;

public class PizzaioloDom implements PizzaioloFactory{

	@Override
	public Pizza criarPizza() {
		return new PizzaDomingo();
	}

}