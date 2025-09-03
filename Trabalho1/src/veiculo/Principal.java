package veiculo;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("Fiat", "Mobi", 2022, 120.0, "ABC-1234", 4));
        veiculos.add(new Moto("Honda", "CB 500", 2023, 100.0, "DEF-5678", 500));
        veiculos.add(new Caminhao("Volvo", "FH-540", 2021, 450.0, "GHI-9012", 25.5));

        int diasAluguel = 7;

        System.out.println("--- CÁLCULO DE ALUGUEL PARA " + diasAluguel + " DIAS ---");
        System.out.println("==========================================");

        for (Veiculo veiculo : veiculos) {
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Placa: " + veiculo.getPlaca());

            double valorTotal = veiculo.calcularAluguel(diasAluguel);
            System.out.printf("Valor do Aluguel: R$ %.2f\n", valorTotal);
            System.out.println("------------------------------------------");
        }
    }
}
