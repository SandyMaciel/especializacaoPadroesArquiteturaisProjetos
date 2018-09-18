package padroes.exemplos.facade;

public class playAudioFacade {

	public static void main(String[] args) {
		System.out.println("#Configurando Sistema#");
		SistemaAudioFacade audio = new SistemaAudioFacade();
		audio.configuraCanais();
		audio.configurarFrequencia();
		audio.configuraVolume();		
		
		System.out.println("# Utilizando Subsistemas #");		
		audio.reproduzirAudio("teste.mp3");
	}

}
