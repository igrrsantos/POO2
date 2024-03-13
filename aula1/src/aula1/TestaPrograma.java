package aula1;

public class TestaPrograma {

	public static void main(String[] args) {
		Livro l1 = new Livro("POO II", "Igor Santos", "97654");
		Livro l2 = new Livro("Java em 21 dias", "Pablo Muriçoca", "456");
		Bibliotecario b1 = new Bibliotecario("Igor", 25, "igor@gmail.com", 8);
		Usuario u1 = new Usuario("João", 98, "joao@gmail.com", 7);
		
		b1.addLivroAcervo(l1);
		b1.addLivroAcervo(l2);
		
		b1.emprestaLivro(l1, u1);
		
	}

}
