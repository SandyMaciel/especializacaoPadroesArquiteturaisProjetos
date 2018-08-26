package padroes.exercicios.strategy;

public class ImpressoraFinanceiro implements ImpressoraStrategy{
	
	@Override
	public void imprimir(String documento) {
		System.out.println(documento + "Impressora Financeiro");
	}	
}