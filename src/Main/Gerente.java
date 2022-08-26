
package Main;


public class Gerente extends Persona{
    private String usuario;
    private String contra;
    private String cargo;

    public Gerente() {
        super();
    }

    public Gerente(String usuario, String contra, String cargo, String identificacion, String nombre, int edad, String sexo, String estado, int altura, int peso) {
        super(identificacion, nombre, edad, sexo, estado, altura, peso);
        this.usuario = usuario;
        this.contra = contra;
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
