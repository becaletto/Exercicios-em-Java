public class Main {
    public static void main(String[] args) {
        Cirurgião cir = new Cirurgião (true, "JG", "Na barriga");
        ClinicoGeral clg = new ClinicoGeral(false, "JC", "Dipiroca", true);
        Medico md = new Medico(true, "JP");

        cir.mostraCirurgião();
        md.mostraMedico();
        clg.mostraClinico();






    }
}