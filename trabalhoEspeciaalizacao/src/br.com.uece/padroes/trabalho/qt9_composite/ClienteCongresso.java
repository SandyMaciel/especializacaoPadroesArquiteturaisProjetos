package padroes.trabalho.QT_09_composite;

public class ClienteCongresso {
	public static void main(String[] args) {
		
		Congresso c = new Participantes();
		Participantes p = new Participantes();
		
		
		Instituicao inst1 = new Instituicao("Fiec");
		Instituicao inst2 = new Instituicao("Senai");
		Instituicao inst3 = new Instituicao("Sesi");
		
		Individuo ind1 = new Individuo("Ivan Junior");
		Individuo ind2 = new Individuo("Joana Mello");

		
		p.add(inst1);
		p.add(inst2);
		p.add(inst3);
		
		p.add(ind1);
		p.add(ind2);
		
		
		c.add(p);
		
		c.inscritos();
		
		
		
	}
}
