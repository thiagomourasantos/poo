package exercicio;

public class FuncionarioComissionado extends Funcionario {
    private double comissao;

    public FuncionarioComissionado(String nome, String cpf, double salarioBase, double comissao) {
        super(nome, cpf, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + this.comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}