package padroes.trabalho.factorymethod;

public class VisualizadorFactory {
	public static Visualizador criarVisualizador(String tipoImagem) {
		if (tipoImagem == null) {
			return null;
		} else if (tipoImagem == "JPG") {
			return new VisualizadorJPG();
		} else {
			return new VisualizadorBMP();
		}
	}
}