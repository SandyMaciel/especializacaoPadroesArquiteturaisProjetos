package padroes.trabalho.QT_09_composite;

import java.util.ArrayList;
import java.util.List;

public class Participantes extends Congresso{

	private List<Congresso> lista = new ArrayList<Congresso>();

	@Override
	public void add(Congresso c) {
		lista.add(c);
	}

	@Override
	public void remove(Congresso c) {
		lista.remove(c);
	}

	@Override
	public List<Congresso> getChild() {
		return lista;
	}

	@Override
	public void inscritos() {
		for (Congresso congresso : lista) {
			congresso.inscritos();
		}
	}
	
	
}
