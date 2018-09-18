package padroes.trabalho.templatemethod;

public class TransformaMinuscula extends TransformaStringTemplate {

	@Override
	public String transformaString(String palavra) {
		
		return palavra.toLowerCase();
	}

}
