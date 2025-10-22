package exercicioagregacao;

public class Principal {
	public static void main(String[] args) {
		Livro meuLivro = new Livro("O Hobbit", "J.R.R Tolken", 1937);
		
		Biblioteca minhaBiblioteca = new Biblioteca("Biblioteca do Condado");
		
		minhaBiblioteca.adicionarLivro(meuLivro);
		
		minhaBiblioteca.mostrarInfo();
		
		
	}
	

}
