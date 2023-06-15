package projetoAluno;

public class Aluno {
	private int matricula;
	private String nome;
	private int anoNasc;
	private String email;
	private boolean ativo;
	
	public Aluno() {
	}
	public Aluno(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNasc() {
		return anoNasc;
	}
	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "Aluno ["
				+ "\n\tmatricula = " + matricula 
				+ ",\n\tnome = " + nome 
				+ ",\n\tanoNasc = " + anoNasc 
				+ ",\n\temail = " + email
				+ ",\n\tativo = " + (ativo?"Sim":"Não")
				+ "\n]";
	}
	
}
