package aula5;

public class Carro extends Automovel{
	
	private boolean arCondicionado;
	
	public void ligar() {
		super.ligar();
		System.out.println("Carro ligado!");
	}

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

}
