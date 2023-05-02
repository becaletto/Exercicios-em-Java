public class Medico {
    boolean trabalhaNoHospotial;
    String tratarPaciente;

    public Medico(boolean trabalhaNoHospotial, String tratarPaciente) {
        this.trabalhaNoHospotial = trabalhaNoHospotial;
        this.tratarPaciente = tratarPaciente;
    }


    public void mostraMedico(boolean trabalhaNoHospotial, String tratarPaciente)
    {
        System.out.println("Medico trabalha no hospital" + trabalhaNoHospotial + "" + "Medio trata do paciente" + tratarPaciente);
    }

    public void paciente(String tratarPaciente)
    {
        System.out.println("Medio trata do paciente" + tratarPaciente);
    }




    public boolean isTrabalhaNoHospotial() {
        return trabalhaNoHospotial;
    }

    public void setTrabalhaNoHospotial(boolean trabalhaNoHospotial) {
        this.trabalhaNoHospotial = trabalhaNoHospotial;
    }

    public String getTratarPaciente() {
        return tratarPaciente;
    }

    public void setTratarPaciente(String tratarPaciente) {
        this.tratarPaciente = tratarPaciente;
    }
}
