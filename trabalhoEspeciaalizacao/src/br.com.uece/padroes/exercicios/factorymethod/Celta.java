package padroes.exercicios.factorymethod;

public class Celta implements Carro{

	@Override
	public void mostrarDescricao() {
		System.out.println("CELTA");
		
	}

	@Override
	public void mostrarPreco() {
		System.out.println("Pre�o: R$ 70.000");
		
	}

}
