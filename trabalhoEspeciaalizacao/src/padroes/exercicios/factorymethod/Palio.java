package padroes.exercicios.factorymethod;

public class Palio implements Carro {

	@Override
	public void mostrarDescricao() {
		System.out.println("Sou um carro Palio");
		
	}

	@Override
	public void mostrarPreco() {
		System.out.println("Custo R$ 30000");
		
	}

}
