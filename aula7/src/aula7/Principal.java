package aula7;

public class Principal {
	public static void main(String[] args) {
		
		String nome  = "Jose da Silva";
		String ra = "12345678";
	
		
		Endereco end = new Endereco();
		end.setCep("71909000");
		end.setLogradouro("Quadra 103 lote 03");
		end.setNumero(13);
		
		Aluno a1 = new Aluno(nome,ra,end);
		
		a1.setEndereco(end);
		
		System.out.println(a1.getNome() + " - " + a1.getRa() + " - " + a1.getEndereco()  );
		
		
	}

}
