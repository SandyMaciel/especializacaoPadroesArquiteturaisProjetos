package padroes.exercicios.templatmethod;

public abstract class GerarRelatorioTemplate {
	public abstract void inserirCabecalho();

	public abstract void inserirConteudo();

	public abstract void inserirRodape();
	
	public void gerarRelatorio() {
		inserirCabecalho();
		inserirConteudo();
		inserirRodape();
	}
	
}
