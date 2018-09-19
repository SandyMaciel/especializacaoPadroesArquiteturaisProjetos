package qt9_composite;

import java.util.List;

public class Individuo extends Congresso{
	
	private String nome;
	
	public Individuo(String nome) {
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
		System.out.println("Indiv�duo Inscrito: " + this.nome);
	}
	
}
