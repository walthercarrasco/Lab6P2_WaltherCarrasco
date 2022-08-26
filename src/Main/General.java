
package Main;


public class General extends Persona{
    private String ocupacion;
    private String horario;
    private int semanas;
    private double sueldo;

    public General() {
        super();
    }

    public General(String ocupacion, String horario, int semanas, double sueldo, String identificacion, String nombre, int edad, String sexo, String estado, int altura, int peso) {
        super(identificacion, nombre, edad, sexo, estado, altura, peso);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.semanas = semanas;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getSemanas() {
        return semanas;
    }

    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}
