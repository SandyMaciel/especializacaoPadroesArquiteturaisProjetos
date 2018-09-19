package padroes.exercicios.strategy;

public class PlayStrategy {

	public static void main(String[] args) {

		EmpresaContext contexto = new EmpresaContext();
		contexto.setor = EmpresaContext.FINANCEIRO;
		contexto.alocarImpressora();
		contexto.imprimir(" texto que quero imprimir");
	}

}
