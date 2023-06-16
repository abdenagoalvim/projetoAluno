package projetoAluno;

import java.util.ArrayList;

public class Turma {
	private int codigo;
	private int serie;
	private String turno;
	private ArrayList<Aluno> listaAlunos = new ArrayList<>();

	public Turma() {
	}

	public Turma(int codigo, int serie, String turno) {
		this.codigo = codigo;
		this.serie = serie;
		this.turno = turno;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Turma [codigo = " + codigo + ", serie = " + serie + ", turno = " + turno + "]"
				+ "\nLista de Alunos:\n" + listaAlunos;
	}

}
