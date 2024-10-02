package br.edu.ifgoias.academico.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Disciplina implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iddisciplina;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "carga_horaria", nullable = false)
    private int cargaHoraria;

    public Disciplina() {
    }

    public Disciplina(Integer iddisciplina, String nome, int cargaHoraria) {
        this.iddisciplina = iddisciplina;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public Integer getIddisciplina() {
        return iddisciplina;
    }

    public void setIddisciplina(Integer iddisciplina) {
        this.iddisciplina = iddisciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(iddisciplina, nome, cargaHoraria);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Disciplina other = (Disciplina) obj;
        return Objects.equals(iddisciplina, other.iddisciplina) &&
               Objects.equals(nome, other.nome) &&
               cargaHoraria == other.cargaHoraria;
    }

    @Override
    public String toString() {
        return "Disciplina [iddisciplina=" + iddisciplina + ", nome=" + nome + ", cargaHoraria=" + cargaHoraria + "]";
    }
}
