
package Main;

import java.awt.Color;


public class Ropa extends Objetos{
    
    private String talla;
    private String tela;
    private String pais;

    public Ropa() {
        super();
    }

    public Ropa(String talla, String tela, String pais, Color color, String descripcion, String marca, int tamano, String calidad, Persona persona) {
        super(color, descripcion, marca, tamano, calidad, persona);
        this.talla = talla;
        this.tela = tela;
        this.pais = pais;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
}
