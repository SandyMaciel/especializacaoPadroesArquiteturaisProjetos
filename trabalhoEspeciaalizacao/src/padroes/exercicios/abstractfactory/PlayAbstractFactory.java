package padroes.exercicios.abstractfactory;

public class PlayAbstractFactory {
	public static void main(String[] args) {
		EmpresaEletronicos novoLGP = new EmpresaLG();
		novoLGP.criaComputador("DesktoPLG").desligar();
	}
}