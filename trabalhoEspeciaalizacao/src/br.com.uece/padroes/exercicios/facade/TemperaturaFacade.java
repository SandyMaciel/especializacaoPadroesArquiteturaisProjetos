package padroes.exercicios.facade;

public class TemperaturaFacade {
	private double temp;

	public void temperatura(double fahrenheit) {
		temp = (fahrenheit - 32)/1.8;
		System.out.println("Temperatura: "+ temp);
	}
	
	public String clima() {
		if(temp<10 ) {
			System.out.println("Clima: Frio");
			return "Clima: Frio"; 
		}else if (temp>10 && temp<=25) {
			System.out.println("Clima: Ameno");
			return "Clima: Ameno";
		}else {
			System.out.println("Clima: Quente");
			return "Clima: Quente";
		}
	}
	
	public void moda(String clima) {
		if(clima == "Clima: Frio") {
			System.out.println("roupa de frio");
		}else if(clima == "Clima: Ameno"){
			System.out.println("roupa de ameno");
		}else {
			System.out.println("roupa de calor");
		}
	}	
}
