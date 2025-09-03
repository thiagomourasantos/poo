package veiculo;

public class Carro extends Veiculo { 
 private int quantidadePortas;

 public Carro(String marca, String modelo, int ano, double valorDiaria, String placa, int quantidadePortas) {
     super(marca, modelo, ano, valorDiaria, placa);
     this.quantidadePortas = quantidadePortas;
 }

 public int getQuantidadePortas() {
     return quantidadePortas;
 }

 public void setQuantidadePortas(int quantidadePortas) {
     this.quantidadePortas = quantidadePortas;
 }

 
 public double calcularAluguel(int dias) {   
     double aluguelBase = getValorDiaria() * dias;
     return aluguelBase + 50.00;
 }
}
