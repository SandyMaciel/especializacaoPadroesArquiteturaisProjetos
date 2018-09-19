package QT_14_mediator;

import java.util.ArrayList;

public class MensagemMediator implements Mediator {

	protected ArrayList<Colleague> contatos;

	public MensagemMediator() {
		contatos = new ArrayList<Colleague>();
	}

	public void adicionarColleague(Colleague colleague) {
		contatos.add(colleague);
	}

	@Override
	public void enviar(String mensagem, Colleague colleague) {
		for (Colleague contato : contatos) {
			if (contato != colleague) {
				definirProtocolo(contato);
				contato.receberMensagem(mensagem);
			}
		}
	}

	private void definirProtocolo(Colleague contato) {
		if (contato instanceof ProfessorColleague) {
			System.out.println("Protocolo PROFESSOR");
		} else if (contato instanceof AlunosColleague) {
			System.out.println("Protocolo ALUNO");
		} 
	}

}
