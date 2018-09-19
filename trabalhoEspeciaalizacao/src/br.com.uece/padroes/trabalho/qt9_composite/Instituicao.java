package padroes.trabalho.QT_09_composite;

import java.util.List;

public class Instituicao extends Congresso{
	
	private String nome;
	
	public Instituicao(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void add(Congresso c) {

	}

	@Override
	public void remove(Congresso c) {
		
	}

	@Override
	public List<Congresso> getChild() {
		return null;
	}

	@Override
	public void inscritos() {
		System.out.println("Institui��o Inscrita: " + this.nome);
	}
	
}
