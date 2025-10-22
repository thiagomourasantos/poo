package biblioteca;

public class Principal {

	public static void main(String[] args) {
		
		Tese t1 = new Tese();
		t1.ano = "1989"
		t1.autor = "Molina";
		t1.emprestado("Tese");
		
		Livro l1 = new Livro();
		l1.emprestado("Livro");

	}

}
