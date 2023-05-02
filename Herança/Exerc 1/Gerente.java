public class Gerente extends Funcionario {
    private String nomeUser;
    private int senha;

    public Gerente(String nome, double salario, String nomeUser, int senha) {
        super(nome, salario);
        this.nomeUser = nomeUser;
        this.senha = senha;

    }
    public double CalcBonificacao ()
    {
        double bonificacao;
        bonificacao = (super.CalcBonificacao()*1.2);
        return bonificacao;
    }

    public void MostraDados()
    {
        super.MostraDados();
        System.out.println("Nome de usuario: "+getNomeUser());
        System.out.println("Senha: "+getSenha());
        System.out.println();

    }
    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}