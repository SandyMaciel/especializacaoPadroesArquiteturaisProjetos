package qt08_templatemethod;

public class PlayTemplateMethod {
 public static void main(String[] args) {
	TransformaStringTemplate mai = new TransformaMaiuscula();
	mai.imprimeString();
	
	TransformaStringTemplate min = new TransformaMinuscula();
	min.imprimeString();
	
	
	TransformaStringTemplate inverte = new TrnasformaInverte();
	inverte.imprimeString();
	
	TransformaStringTemplate duplica = new TransformaDuplicacao();
	duplica.imprimeString();
	
}
}
