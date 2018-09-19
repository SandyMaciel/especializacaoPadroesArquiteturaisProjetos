package trabalho;

public class main {
	public static void main(String[] args) {
		
		SomadorTarget somador = new SomadorAdapter();
		Cliente c = new Cliente(somador);
		c.executar();
	}
}
