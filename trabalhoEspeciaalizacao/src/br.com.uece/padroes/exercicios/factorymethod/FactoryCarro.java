package padroes.exercicios.factorymethod;

public class FactoryCarro {
	public static MontadoraDeCarroFactory constroiCarro(String montadora) {
		if (montadora == null) {
			return null;
		} else if (montadora == "Fiat") {
			return new MontadoraFiat();
		} else if (montadora == "Chevrolet") {
			return new MontadoraChevrolet();
		} else {
			return new MontadoraVolks();
		}

	}

}
