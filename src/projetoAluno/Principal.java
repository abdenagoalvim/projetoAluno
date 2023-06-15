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
	}

}
