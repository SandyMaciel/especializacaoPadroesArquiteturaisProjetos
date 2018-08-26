package padroes.trabalho.templatemethod;

import java.util.Scanner;

public abstract class TransformaStringTemplate {
	public abstract String transformaString(String palavra);
	
	private String leString() {
		Scanner ler = new Scanner(System.in);
		String l;
		System.out.println("Entre com uma palavra: ");
		return l = ler.next();	
		
	}
	
	public void imprimeString() {
		
		String lida = leString();
		String transformada = transformaString(lida);
		System.out.println(transformada); 
	} 
}