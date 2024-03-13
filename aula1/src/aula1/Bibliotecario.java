package aula1;
import java.util.ArrayList;

public class Bibliotecario extends Pessoa {
	private int numeroDeIdentificacao;
	private ArrayList<Livro> acervo;

	public Bibliotecario(String nome, int idade, String email, int numeroDeIdentificacao) {
		super(nome, idade, email);
		this.numeroDeIdentificacao = numeroDeIdentificacao;
		this.acervo = [];
	}

	public int getNumeroDeIdentificacao() {
		return numeroDeIdentificacao;
	}

	public void setNumeroDeIdentificacao(int numeroDeIdentificacao) {
		this.numeroDeIdentificacao = numeroDeIdentificacao;
	}
	
	public void addLivroAcervo(Livro l) {
		if(acervo.add(l)) {
			System.out.println("O livro:" + l.getTitulo() + "foi adicionado com sucesso!");
		} else {
			System.out.println("O livro:" + l.getTitulo() + "não pode ser adicionado!");
		}
	}
	
	public void removeLivroAcervo(Livro l) {
		if(acervo.remove(l)) {
			System.out.println("O livro:" + l.getTitulo() + "foi removido com sucesso!");
		} else {
			System.out.println("O livro:" + l.getTitulo() + "não pode ser removido!");
		}
	}
	
	public void emprestaLivro(Livro l, Usuario u) {
		if(acervo.contains(l)) {
			if(acervo.remove(l) && u.getLivrosEmprestados().add(l)) {
				System.out.println("Livro " + l.getTitulo() + "emprestado com sucesso!");
			} else {
				System.out.println("Livro " + l.getTitulo() + " não pode ser emprestado!");
			}
		} else {
			System.out.println("Livro não existe!");
		}
	}
	
	public void devolveLivro(Livro l, Usuario u) {
		if(acervo.add(l) && u.getLivrosEmprestados().remove(l)) {
			System.out.println("Livro " + l.getTitulo() + "devolvido com sucesso!");
		} else {
			System.out.println("Livro " + l.getTitulo() + " não pode ser devolvido!");
		}
	}
}
