package qt10_bridge;

import java.util.List;

public class ListaLetras extends Implementador{

	@Override
	public void imprimir(List<Compras> lista) {
		for (Compras compras : lista) {
			System.out.println("A: " + compras.toString());
		}
	}

}
