package tareapoo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class equipo implements Serializable {

    private String categoria;
    private int juegodor;
    private int añosdevida;
    private int numeroCopas;
    private String nombreequipo;

    public equipo(String categoria, int juegodores, int añosdevida, int numeroCopas, String nombreequipo) {
        this.categoria = categoria;
        this.juegodor = juegodor;
        this.añosdevida = añosdevida;
        this.numeroCopas = numeroCopas;
        this.nombreequipo = nombreequipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getJuegodores() {
        return juegodor;
    }

    public void setJuegodores(int juegodor) {
        this.juegodor = juegodor;
    }

    public int getAñosdevida() {
        return añosdevida;
    }

    public void setAñosdevida(int añosdevida) {
        this.añosdevida = añosdevida;
    }

    public int getNumeroCopas() {
        return numeroCopas;
    }

    public void setNumeroCopas(int numeroCopas) {
        this.numeroCopas = numeroCopas;
    }

    public String getNombreequipo() {
        return nombreequipo;
    }

    public void setNombreequipo(String nombreequipo) {
        this.nombreequipo = nombreequipo;
    }
}
