package aula5;

public class Moto extends Automovel {
	
	private String tipoCarenagem;
	
	public void ligar() {
		System.out.println("moto ligada!");
	}

	public String getTipoCarenagem() {
		return tipoCarenagem;
	}

	public void setTipoCarenagem(String tipoCarenagem) {
		this.tipoCarenagem = tipoCarenagem;
	}

}
