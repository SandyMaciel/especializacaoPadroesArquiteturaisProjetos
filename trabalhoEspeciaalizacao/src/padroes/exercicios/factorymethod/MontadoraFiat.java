package padroes.exercicios.factorymethod;

public class MontadoraFiat implements MontadoraDeCarroFactory{

	@Override
	public Carro criarCarro() {
		Carro carro = new Palio();
		return carro;
	}
}