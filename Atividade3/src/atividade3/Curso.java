package atividade3;

import java.time.LocalDate;

public class Curso {
	private int codigoCurso;
    private String nomeCurso;
    private LocalDate dataInicio;
    
	public Curso(int codigoCurso, String nomeCurso, LocalDate dataInicio) {
		super();
		this.codigoCurso = codigoCurso;
		this.nomeCurso = nomeCurso;
		this.dataInicio = dataInicio;
	}

	public String toString() {
		return "Curso [codigoCurso=" + codigoCurso + ", nomeCurso=" + nomeCurso + ", dataInicio=" + dataInicio + "]";
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
    
    
}
