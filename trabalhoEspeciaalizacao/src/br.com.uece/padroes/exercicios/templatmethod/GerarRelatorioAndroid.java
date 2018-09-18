package padroes.exercicios.templatmethod;

public class 
GerarRelatorioAndroid extends GerarRelatorioTemplate{

	@Override
	public void inserirCabecalho() {
		System.out.println("xml cab");
		
	}

	@Override
	public void inserirConteudo() {
		System.out.println("xml conteudo");
		
	}

	@Override
	public void inserirRodape() {
		System.out.println("xml conteudo");
		
	}

}
