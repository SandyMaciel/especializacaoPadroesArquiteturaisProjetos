package padroes.trabalho.templatemethod;

public class TransformaMaiuscula extends TransformaStringTemplate {

	@Override
	public String transformaString(String palavra) {

		return palavra.toUpperCase();

	}

}