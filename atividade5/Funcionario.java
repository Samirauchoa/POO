public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nome, int idade, String cargo, double salario) {
        super(nome, idade);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public double calcularBonusAnual() {

        return salario * 0.1;
    }
}
