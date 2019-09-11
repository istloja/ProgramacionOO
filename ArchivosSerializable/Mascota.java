
package ArchivosSerializable;

import java.io.Serializable;


public class Mascota implements Serializable {
    private String nombre;
    private int numPatas;

    public Mascota(String nombre, int numPatas) {
        this.nombre = nombre;
        this.numPatas = numPatas;
    }

    public Mascota() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

}
