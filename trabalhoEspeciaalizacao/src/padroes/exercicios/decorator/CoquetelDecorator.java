package padroes.exercicios.decorator;

public abstract class CoquetelDecorator implements Coquetel{
	protected final Coquetel umCoquetel;
	
	public CoquetelDecorator (Coquetel decorado) {
		umCoquetel = decorado;
	}
	
}