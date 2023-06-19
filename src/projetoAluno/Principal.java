package projetoAluno;

public class Principal {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno(5, "Josefino");
		a2.setAnoNasc(2003);
		a2.setEmail("josefino@email.com");
		a2.setAtivo(true);
		
		System.out.println(a1);
		System.out.println(a2);
		
		Turma t1 = new Turma();
		t1.setCodigo(713);
		t1.setSerie(3);
		t1.setTurno("Tarde");
		t1.adicionarAluno(a1);
		t1.adicionarAluno(a2);
		
		Aluno a3 = new Aluno(7, "Marieta");
		a3.setAnoNasc(2010);
		a3.ativar();
		Aluno a4 = new Aluno(7, "Orozimbo");
		a4.setAnoNasc(1975);
		a4.ativar();
		
		Turma t2 = new Turma(725, 3, "Manhã");
		t2.adicionarAluno(a3);
		t2.adicionarAluno(a4);
		
		
		System.out.println(t1);
		System.out.println(t2);
	}
}
