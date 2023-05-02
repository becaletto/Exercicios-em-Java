public class Main {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Rafael", 5000, "Rafa", 1234);
        g1.MostraDados();
        System.out.println("Aumento de %10: R$" +g1.CalcBonificacao());

        Secretaria s1 = new Secretaria("Marcia", 1200, 4653);
        s1.MostraDados();

        Telefonista t1 = new Telefonista("Joao", 600, 9876);
        t1.MostraDados();
        System.out.println("Aumento de %10: R$" +t1.CalcBonificacao());
    }
}