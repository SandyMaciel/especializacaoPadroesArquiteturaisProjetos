package trabalho;

import java.util.List;

public class SomadorList {
	public int somaLista(List<Integer> lista) {
		int resultado = 0;
		for (Integer i : lista)
			resultado += i;
		return resultado;
	}
}
