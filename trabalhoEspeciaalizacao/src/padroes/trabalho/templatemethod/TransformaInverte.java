package padroes.trabalho.templatemethod;

public class TransformaInverte extends TransformaStringTemplate{

	@Override
	public String transformaString(String palavra) {
		
		String  invertida = new StringBuffer(palavra).reverse().toString();
		return invertida;
	}

}