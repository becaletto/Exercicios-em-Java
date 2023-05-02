public class Secretaria extends Funcionario {
    private int ramal;

    public Secretaria(String nome, double salario, int ramal)
    {
        super(nome, salario);
        this.ramal = ramal;

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
        System.out.println("Ramal: "+getRamal());
        System.out.println();
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
}