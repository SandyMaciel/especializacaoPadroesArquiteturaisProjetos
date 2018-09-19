package padroes.trabalho.QT_10_bridge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista extends Abstracao{

	private List<Compras> lista = new ArrayList<>();
	private Implementador imp;

	
	public void add(Compras c) {
		lista.add(c);
	}
	
	public void imprimir() {
		System.out.println(lista);
	}

	@Override
	public void listaOrdenada() {
		Collections.reverse(lista);
		imp.imprimir(lista);
	}

	@Override
	public void listaNOrdenada() {
		Collections.sort(lista);
		imp.imprimir(lista);
	}

	public Implementador getImp() {
		return imp;
	}

	public void setImp(Implementador imp) {
		this.imp = imp;
	}
	
	
	
}
