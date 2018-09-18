package padroes.exercicios.templatmethod;

public class GerarRelatorioDesktop extends GerarRelatorioTemplate{

	@Override
	public void inserirCabecalho() {
		System.out.println("html cab");
		
	}

	@Override
	public void inserirConteudo() {
		System.out.println("html cab");
		
	}

	@Override
	public void inserirRodape() {
		System.out.println("html cab");
		
	}

}
