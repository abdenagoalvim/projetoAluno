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
		String lstAluno = "\n[Mat, Nome, Ano Nasc., e-mail, Ativo]\n";
		for (Aluno a : listaAlunos) {
			lstAluno += a + "\n"; 
		}
		return "Turma [codigo = " + codigo + ", serie = " + serie + ", turno = " + turno + "]"
				+ "\nLista de Alunos:" + lstAluno;
	}
	
	public void adicionarAluno(Aluno aluno) {
		listaAlunos.add(aluno);
	}
	
	public void excluirAluno(int matricula) {
		int id = -1;
		for(int i=0; i < this.listaAlunos.size(); i++ ) {
			if(this.listaAlunos.get(i).getMatricula() == matricula) {
				id = i;
				break;
			}
		}
		if (id == -1) {
			System.out.println("Aluno não encontrado!!!");
		} else {
			this.listaAlunos.remove(id);
			System.out.println("Aluno excluído da turma");
		}
	}
	
	public Aluno consultarAluno(int matricula) {
		Aluno aln = null;
		for(int i=0; i < this.listaAlunos.size(); i++ ) {
			if(this.listaAlunos.get(i).getMatricula() == matricula) {
				aln = this.listaAlunos.get(i);
				break;
			}
		}
		return aln;
	}
	
	public Aluno consultarAluno(String nome) {
		Aluno aln = null;
		for(int i=0; i < this.listaAlunos.size(); i++ ) {
			if(this.listaAlunos.get(i).getNome().equals(nome)) { //localiza o aluno se o seu nome for exatamente igual ao passado por parâmetro
//			if(this.listaAlunos.get(i).getNome().contains(nome)) { //localiza o aluno se o seu nome contém o nome passado por parâmetro
				aln = this.listaAlunos.get(i);
				break;
			}
		}
		return aln;
	}
}
