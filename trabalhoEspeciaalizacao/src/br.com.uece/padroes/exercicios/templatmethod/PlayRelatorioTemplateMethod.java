package padroes.exercicios.templatmethod;

public class PlayRelatorioTemplateMethod {
	public static void main(String[] args) {
		GerarRelatorioTemplate gerar = new GerarRelatorioAndroid();
		gerar.gerarRelatorio();
		
		GerarRelatorioTemplate gerar1 = new GerarRelatorioDesktop();
		gerar1.gerarRelatorio();
	}

}
