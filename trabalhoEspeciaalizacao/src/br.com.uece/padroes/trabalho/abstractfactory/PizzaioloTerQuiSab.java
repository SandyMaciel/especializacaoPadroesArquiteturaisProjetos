package padroes.trabalho.abstractfactory;

public class PizzaioloTerQuiSab implements PizzaioloFactory {

	@Override
	public Pizza criarPizza() {

		return new PizzaPresunto();
	}

}