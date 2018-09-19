package qt08_templatemethod;
public class TransformaMaiuscula extends TransformaStringTemplate {

	@Override
	public String transformaString(String palavra) {

		return palavra.toUpperCase();

	}

}