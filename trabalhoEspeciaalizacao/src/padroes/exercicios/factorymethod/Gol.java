package padroes.exercicios.factorymethod;

public class Gol implements Carro {

	@Override
	public void mostrarDescricao() {
		System.out.println("Sou um carro GOL");		
	}

	@Override
	public void mostrarPreco() {
		System.out.println("Custo R$ 35.000");
		
	}

}
