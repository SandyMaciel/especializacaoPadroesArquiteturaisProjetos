package padroes.exercicios.decorator;

public class Rum implements Coquetel {

	@Override
	public String getNome() {
		
		return "Rum";
	}

	@Override
	public Double getPreco() {
		
		return 10.00;
	}
	

}