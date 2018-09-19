package padroes.trabalho.templatemethod;

public class TrnasformaInverte extends TransformaStringTemplate{

	@Override
	public String transformaString(String palavra) {
		
		String  invertida = new StringBuffer(palavra).reverse().toString();
		return invertida;
	}

}