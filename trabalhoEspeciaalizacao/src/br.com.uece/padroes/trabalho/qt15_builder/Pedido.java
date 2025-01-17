package qt15_builder;
import java.util.ArrayList;

public class Pedido {

	private ArrayList<String> dentroDaCaixa = new ArrayList<>();
	private ArrayList<String> foraDaCaixa = new ArrayList<>();
	private String sanduiche;
	private String batata;
	private String refrigerante;
	private String brinquedo;

	public String getSanduiche() {
		return sanduiche;
	}

	public void setSanduiche(String sanduiche) {
		this.sanduiche = sanduiche;
	}

	public String getBatata() {
		return batata;
	}

	public void setBatata(String batata) {
		this.batata = batata;
	}

	public String getRefrigerante() {
		return refrigerante;
	}

	public void setRefrigerante(String refrigerante) {
		this.refrigerante = refrigerante;
	}

	public String getBrinquedo() {
		return brinquedo;
	}

	public void setBrinquedo(String brinquedo) {
		this.brinquedo = brinquedo;
	}

	public void adicionarDentroDaCaixa(String item) {
		dentroDaCaixa.add(item);
	}

	public void adicionarForaDaCaixa(String item) {
		foraDaCaixa.add(item);
	}

	@Override
	public String toString() {

		StringBuffer buffer = new StringBuffer();

		buffer.append("Seu pedido:\n");
		

		for (String item : dentroDaCaixa) {
			buffer.append("Dentro da caixa:\n");
			buffer.append("\t" + item + "\n");
		}

		for (String item : foraDaCaixa) {
			buffer.append("Fora da caixa:\n");
			buffer.append("\t" + item + "\n");
			buffer.append("Pedido concluido\n\n");
		}

		return buffer.toString();
	}

}
