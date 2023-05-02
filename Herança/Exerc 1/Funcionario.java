public class Funcionario {
    protected String nome;
    protected double salario;


    public double CalcBonificacao ()
    {
        double bonificacao;
        bonificacao = (salario+(salario*0.1));
        return bonificacao;
    }

    protected Funcionario(String nome, double salario)
    {
        this.nome = nome;
        this.salario = salario;
    }

    public void MostraDados()
    {
        System.out.println("Nome: " +getNome());
        System.out.println("Salario: R$"+getSalario());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}