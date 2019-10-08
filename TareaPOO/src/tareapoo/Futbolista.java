package tareapoo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Futbolista implements Serializable {

    private int numero;
    private String posicion;
    private int años;
    private String pierna_buena;
    private String nombre;
    private equipo equipo;

    public Futbolista(int numero, String posicion, int años, String pierna_buena, String nombre, equipo equipo) {
        this.numero = numero;
        this.posicion = posicion;
        this.años = años;
        this.pierna_buena = pierna_buena;
        this.nombre = nombre;
        this.equipo = equipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getPierna_buena() {
        return pierna_buena;
    }

    public void setPierna_buena(String pierna_buena) {
        this.pierna_buena = pierna_buena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(equipo equipo) {
        this.equipo = equipo;
    }

    public Futbolista verificarmayor(List<Futbolista> xd) {
        Futbolista mayor = xd.get(0);
        for (Futbolista futbolista : xd) {
            if (mayor.getAños() > futbolista.getAños()) {
                mayor = futbolista;
            }

        }
        return mayor;
    }

    public static void main(String[] args) {
        Futbolista objeto1 = new Futbolista(8, "Cinco", 23, "diestro", "Leonel", new equipo("La liga", 63, 100, 5, "Barcelona"));
        System.out.println("El equipo de " + objeto1.getNombre() + " se llama " + objeto1.getEquipo().getNombreequipo() + "posicion en que esta  " + objeto1.posicion);
        Futbolista objeto2 = new Futbolista(8, "Media punta", 30, "zurda", "Philipp", new equipo("La liga", 32, 122, 0, "Barcelona"));
        System.out.println("El equipo de " + objeto2.getNombre() + " se llama " + objeto2.getEquipo().getNombreequipo() + "posicion en que esta " + objeto2.posicion);
        Futbolista objeto3 = new Futbolista(8, "delantero", 29, "diestro", "Luis", new equipo("La liga", 57, 30, 18, "Barcelona"));
        System.out.println("El equipo de " + objeto3.getNombre() + " se llama " + objeto3.getEquipo().getNombreequipo() + " posicion en que esta " + objeto3.posicion);
        Futbolista objeto4 = new Futbolista(8, "defensa", 25, "zurdo", "Gerard", new equipo("La liga", 67, 150, 12, "Barcelona"));
        System.out.println("El equipo de " + objeto4.getNombre() + " se llama " + objeto4.getEquipo().getNombreequipo() + " posicion en que esta  " + objeto4.posicion);
        Futbolista objeto5 = new Futbolista(8, "portero", 45, "Diestro", "Marc", new equipo("La liga", 50, 100, 10, "Barcelona"));
        System.out.println("El equipo de " + objeto5.getNombre() + " se llama " + objeto5.getEquipo().getNombreequipo() + " posicion en que esta " + objeto5.posicion);
        List<Futbolista> lista = new ArrayList<>();
        lista.add(objeto1);
        lista.add(objeto2);
        lista.add(objeto3);
        lista.add(objeto4);
        lista.add(objeto5);
    }
}
