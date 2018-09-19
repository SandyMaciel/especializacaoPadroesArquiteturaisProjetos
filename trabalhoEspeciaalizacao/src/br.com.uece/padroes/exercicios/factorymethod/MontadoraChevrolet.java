package padroes.exercicios.factorymethod;

public class MontadoraChevrolet implements MontadoraDeCarroFactory{

	@Override
	public Carro criarCarro() {
		Carro carro = new Celta();
		return carro;
	}

}
