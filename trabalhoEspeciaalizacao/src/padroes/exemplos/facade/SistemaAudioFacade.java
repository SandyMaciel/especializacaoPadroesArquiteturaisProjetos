package padroes.exemplos.facade;

public class SistemaAudioFacade {
	public void configurarFrequencia() {
		System.out.println("Frequencia Configurada");
	}
	
	public void configuraVolume() {
		System.out.println("Volume Configurado");
	}
	
	public void configuraCanais() {
		System.out.println("Canais Configurados");
	}
	
	public void reproduzirAudio(String arquivo) {
		System.out.println("Reproduzindo: "+ arquivo);
	}
}
