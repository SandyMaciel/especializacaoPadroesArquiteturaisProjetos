package padroes.exercicios.factorymethod;

public class PlayFactory {
	public static void main(String args[]){
		
	//	FactoryCarro carro = new FactoryCarro();
		
		Carro carro = FactoryCarro.constroiCarro("Fiat").criarCarro();
		carro.mostrarDescricao();
		carro.mostrarPreco();
	}
}