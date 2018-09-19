package qt14_mediator;

public class AlunosColleague extends Colleague {

	public AlunosColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receberMensagem(String mensagem) {
		System.out.println("Alunos recebeu: " + mensagem);
	}

}
