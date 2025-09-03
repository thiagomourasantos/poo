package veiculo;

public class Moto extends Veiculo{
	private int cilindrada;

	public Moto(String marca, String modelo, int ano, double valorDiaria, String placa, int cilindrada) {
		super(marca, modelo, ano, valorDiaria, placa);
		this.setCilindrada(cilindrada);
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public double calcularAluguel(int dias) {
		double aluguelBase = getValorDiaria() * dias;
		return aluguelBase * 0.95;
	}
		
}
