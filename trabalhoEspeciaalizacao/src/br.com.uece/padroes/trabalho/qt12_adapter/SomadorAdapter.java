package trabalho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SomadorAdapter extends SomadorList implements SomadorTarget{

	@Override
	public int somaVetor(int[] vetor) {
	List<Integer> lista = new ArrayList<Integer>();
		for (int i : vetor)
		{
			lista.add(i);
		}
		return somaLista(lista);
	}

}
