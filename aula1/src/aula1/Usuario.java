package aula1;
import java.util.ArrayList;

class Usuario extends Pessoa {
    private int numeroDeUsuario;
    private ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome, int idade, String email, int numeroDeUsuario) {
        super(nome, idade, email);
        this.numeroDeUsuario = numeroDeUsuario;
        this.livrosEmprestados = new ArrayList<Livro>();
    }

    public int getNumeroDeUsuario() {
        return numeroDeUsuario;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setNumeroDeUsuario(int numeroDeUsuario) {
        this.numeroDeUsuario = numeroDeUsuario;
    }

    public void emprestarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void devolverLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }
}