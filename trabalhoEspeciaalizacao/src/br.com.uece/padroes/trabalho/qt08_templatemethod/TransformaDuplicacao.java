package qt08_templatemethod;
public class TransformaDuplicacao extends TransformaStringTemplate {

	@Override
	public String transformaString(String palavra) {

		return palavra + palavra;
	}

}