
package Main;

import java.awt.Color;


public class Hogar extends Objetos{
    private String descripcionlugar;
    private String instrucciones;
    private int garantia;

    public Hogar() {
        super();
    }

    public Hogar(String descripcionlugar, String instrucciones, int garantia, Color color, String descripcion, String marca, int tamano, String calidad, Persona persona) {
        super(color, descripcion, marca, tamano, calidad, persona);
        this.descripcionlugar = descripcionlugar;
        this.instrucciones = instrucciones;
        this.garantia = garantia;
    }

    public String getDescripcionlugar() {
        return descripcionlugar;
    }

    public void setDescripcionlugar(String descripcionlugar) {
        this.descripcionlugar = descripcionlugar;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

}
