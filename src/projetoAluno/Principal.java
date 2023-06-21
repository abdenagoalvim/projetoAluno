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
		Aluno a4 = new Aluno(8, "Orozimbo");
		a4.setAnoNasc(1975);
		a4.ativar();
		
		Turma t2 = new Turma(725, 3, "Manhã");
		t2.adicionarAluno(a2);
		t2.adicionarAluno(a3);
		t2.adicionarAluno(a4);
		
		System.out.println(t1);
		System.out.println(t2);

		t1.excluirAluno(0);
		System.out.println(t1);
		
		Aluno a5 = t2.consultarAluno(7);
		if (a5 != null) {
			System.out.println("Aluno localizado:");
			System.out.println(a5);
		}
		Aluno a6 = t2.consultarAluno("Orozimbo");
		if (a6 != null) {
			System.out.println("Aluno localizado:");
			System.out.println(a6);
		}
		// teste para o segundo if da consulta na classe Turma (comente o primeiro if e descomente o segundo)
		Aluno a7 = t2.consultarAluno("Jose"); 
		if (a7 != null) {
			System.out.println("Aluno localizado:");
			System.out.println(a7);
		}
	}
}
