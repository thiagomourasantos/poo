package exercicio;

public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.10;
    }
}
