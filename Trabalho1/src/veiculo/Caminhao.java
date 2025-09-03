package veiculo;

public class Caminhao extends Veiculo{
	private double capacidadeCarga;
	public Caminhao(String marca, String modelo, int ano, double valorDiaria, String placa, double capacidadeCarga) {
		super(marca, modelo, ano, valorDiaria, placa);
		this.setCapacidadeCarga(capacidadeCarga);
	}
	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}
	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	public double calcularAluguel(int dias) {
		double aluguelBase = getValorDiaria() * dias;
		return aluguelBase + 200.00;
	}

}
