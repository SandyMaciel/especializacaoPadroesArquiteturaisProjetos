package padroes.exercicios.facade;

public class PlayTemperatura {

	public static void main(String[] args) {
		TemperaturaFacade temp = new TemperaturaFacade();
		
		temp.temperatura(200);		
		temp.moda(temp.clima());
		
	}
}
