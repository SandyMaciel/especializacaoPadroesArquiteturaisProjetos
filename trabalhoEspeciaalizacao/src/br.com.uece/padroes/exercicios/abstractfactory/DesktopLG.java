package padroes.exercicios.abstractfactory;

public class DesktopLG implements ProdutoComputador {

	@Override
	public void ligar() {
		System.out.println("Ligado");

	}

	@Override
	public void desligar() {
		System.out.println("desligado");

	}

}