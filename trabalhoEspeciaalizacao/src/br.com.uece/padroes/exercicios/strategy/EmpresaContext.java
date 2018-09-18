package padroes.exercicios.strategy;

public class EmpresaContext {
	
	public String setor;
	public static final String FINANCEIRO = "Financeiro";
	public static final String RH = "RH";
	private ImpressoraStrategy impressora;
	
	public void alocarImpressora() {
		switch (setor) {
		case FINANCEIRO:
			impressora = new ImpressoraFinanceiro();
			break;

		case RH:
			impressora = new ImpressoraRH();
			break;
		}
	}

	public void imprimir(String documento) {
		impressora.imprimir(documento);
		
	}
	
	
	
}