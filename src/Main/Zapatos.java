
package Main;

import java.awt.Color;


public class Zapatos extends Objetos{

    private int talla;
    private String suela;
    private int comodidad;

    public Zapatos() {
        super();
    }

    public Zapatos(int talla, String suela, int comodidad, Color color, String descripcion, String marca, int tamano, String calidad, Persona persona) {
        super(color, descripcion, marca, tamano, calidad, persona);
        this.talla = talla;
        this.suela = suela;
        this.comodidad = comodidad;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getSuela() {
        return suela;
    }

    public void setSuela(String suela) {
        this.suela = suela;
    }

    public int getComodidad() {
        return comodidad;
    }

    public void setComodidad(int comodidad) {
        this.comodidad = comodidad;
    }
    
    
}
