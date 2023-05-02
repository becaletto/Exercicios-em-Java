public class Telefonista extends Funcionario {
    private int cod;

    public Telefonista(String nome, double salario, int cod) {
        super(nome, salario);
        this.cod = cod;
    }

    public double CalcBonificacao ()
    {
        double bonificacao;
        bonificacao = (salario+(salario*0.1));
        return bonificacao;
    }

    public void MostraDados()
    {
        super.MostraDados();
        System.out.println("Codigo: "+getCod());
        System.out.println();
    }
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}