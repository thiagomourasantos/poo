package exercicioagregacao;

public class Biblioteca {
	
	private String nome;
	private Livro livro;
	
	public Biblioteca(String nome) {
		this.nome = nome;
		this.livro = null;
	}
	
	public void adicionarLivro(Livro livroParaAdicionar) {
		this.livro = livroParaAdicionar;
		
	}
	
	public void mostrarInfo() {
		System.out.println("Informações da Biblioteca:"+ this.nome);
		
		 if (this.livro != null) {
	            System.out.println("Livro no acervo:");
	            this.livro.mostrarInfo();
	        } else {
	            System.out.println("Esta biblioteca não possui livros no momento.");
	        }
	}

}
