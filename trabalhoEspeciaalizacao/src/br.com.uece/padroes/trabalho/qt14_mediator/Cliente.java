package QT_14_mediator;

public class Cliente {
	public static void main(String[] args) {
		MensagemMediator mediador = new MensagemMediator();
	
		AlunosColleague aluno = new AlunosColleague(mediador);
                AlunosColleague aluno2 = new AlunosColleague(mediador);
		ProfessorColleague professor = new ProfessorColleague(mediador);

	
		mediador.adicionarColleague(aluno);
		mediador.adicionarColleague(professor);
		
		aluno.enviarMensagem("olá professor quando vai ser a prova de recuperação!");
		System.out.println("=========");
		aluno2.enviarMensagem("Tenha pena! de nós professor!");
		System.out.println("=========");
		professor.enviarMensagem("Olá todos, vão estudar se não vcs se lascam");
	}
}
