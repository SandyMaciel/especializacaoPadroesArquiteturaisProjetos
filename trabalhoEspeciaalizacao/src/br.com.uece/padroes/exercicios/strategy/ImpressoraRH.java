package padroes.exercicios.strategy;

public class ImpressoraRH implements ImpressoraStrategy{

	@Override
	public void imprimir(String documento) {
		System.out.println(documento + "Impressora RH");
	
	}
	
}
