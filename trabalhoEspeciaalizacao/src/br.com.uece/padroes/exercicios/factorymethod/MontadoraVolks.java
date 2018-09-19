package padroes.exercicios.factorymethod;

public class MontadoraVolks implements MontadoraDeCarroFactory {

	@Override
	public Carro criarCarro() {
		Carro carro = new Celta();
		return carro;
	}

}
