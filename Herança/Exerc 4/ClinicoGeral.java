public class ClinicoGeral extends Medico {
    String receitar;
    boolean atendeEmCasa;


    public ClinicoGeral(boolean trabalhaNoHospotial, String tratarPaciente, String receitar, boolean atendeEmCasa) {
        super(trabalhaNoHospotial, tratarPaciente);
        this.receitar = receitar;
        this.atendeEmCasa = atendeEmCasa;
    }

    public void mostraClinico(boolean trabalhaNoHospotial, String tratarPaciente, String receitar, boolean atendeEmCasa)
    {
        System.out.println("trabalha no hospital" + trabalhaNoHospotial + " " + "Trata do passiente" + tratarPaciente + " " + "receita" + receitar + "" + "ele a tende em casa?" + atendeEmCasa );
    }

    public String getReceitar() {
        return receitar;
    }

    public void setReceitar(String receitar) {
        this.receitar = receitar;
    }

    public boolean isAtendeEmCasa() {
        return atendeEmCasa;
    }

    public void setAtendeEmCasa(boolean atendeEmCasa) {
        this.atendeEmCasa = atendeEmCasa;
    }
}
