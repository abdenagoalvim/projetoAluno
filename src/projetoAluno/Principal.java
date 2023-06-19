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
		Turma t2 = new Turma(725, 3, "Manhã");
		
		System.out.println(t1);
		System.out.println(t2);
	}
}
