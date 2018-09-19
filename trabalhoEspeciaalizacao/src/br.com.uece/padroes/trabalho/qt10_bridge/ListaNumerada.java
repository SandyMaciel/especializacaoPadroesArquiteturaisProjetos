package qt10_bridge;

import java.util.List;

public class ListaNumerada extends Implementador{

	private int cont;
	
	@Override
	public void imprimir(List<Compras> lista) {
		for (Compras compras : lista) {
			cont++;
			System.out.println(cont + " - "+ compras.toString());
		}
	}

	
	
}
