package padroes.trabalho.factorymethod;

public class ProgramaVisualizador {

	public static void main(String[] args) {
		Visualizador v = VisualizadorFactory.criarVisualizador("J"
				+ "PG");
		v.carregar();
		v.exibir();
		v.fechar();
	}
}