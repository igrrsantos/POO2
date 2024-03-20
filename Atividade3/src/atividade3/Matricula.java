package atividade3;

import java.time.LocalDate;
import java.time.Period;

public class Matricula {
    private Aluno aluno;
    private Curso curso;
    private LocalDate dataMatricula;
    
    public Matricula(Aluno aluno, Curso curso, LocalDate dataMatricula) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataMatricula = dataMatricula;
    }

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public LocalDate getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(LocalDate dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	
	public boolean verificaElegibilidadeMatricula() {
		Period periodo = Period.between(aluno.getDataNascimento(), dataMatricula);
        int idade = periodo.getYears();
 
	    return idade >= 18;
	}


	public String toString() {
		return "Matricula [aluno=" + aluno + ", curso=" + curso + ", dataMatricula=" + dataMatricula + "]";
	}
    
    
}