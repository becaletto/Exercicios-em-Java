public class Cirurgião extends Medico {
    String fazerIncisão;


    public void paciente(String tratarPaciente)
    {
        System.out.println("Cirurgião trata do paciente" + tratarPaciente);
    }


    public Cirurgião(boolean trabalhaNoHospotial, String tratarPaciente, String fazerIncisão) {
        super(trabalhaNoHospotial, tratarPaciente);
        this.fazerIncisão = fazerIncisão;
    }

    public void mostraCirurgião(boolean trabalhaNoHospotial, String tratarPaciente, String fazerIncisão)
    {
        System.out.println("trabalha no hospital" + trabalhaNoHospotial + " " + "Trata do passiente" + tratarPaciente + " " + "faz incisão aonde" + fazerIncisão);
    }

    public String getFazerIncisão() {
        return fazerIncisão;
    }

    public void setFazerIncisão(String fazerIncisão) {
        this.fazerIncisão = fazerIncisão;
    }
}
