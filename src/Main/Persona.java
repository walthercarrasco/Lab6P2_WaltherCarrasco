
package Main;


public class Persona {
    
    private String identificacion;
    private String nombre;
    private int edad;
    private String sexo;
    private String estado;
    private int altura;
    private int peso;

    public Persona() {
    }
    
    public Persona(String identificacion, String nombre, int edad, String sexo, String estado, int altura, int peso) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.estado = estado;
        this.altura = altura;
        this.peso = peso;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona{" + "identificacion=" + identificacion + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", estado=" + estado + ", altura=" + altura + ", peso=" + peso + '}';
    }


    
}
