package tareapoo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ejecutar {

    public static void main(String[] args) {
        String ruta = "C:\\Users\\anthony\\Desktop\\Equipo.txt";
        Ejecutar objeto = new Ejecutar();
        Futbolista objeto1 = new Futbolista(8, "Cinco", 23, "Diestro", "Andres", new equipo("la liga", 63, 100, 5, "FCBarcelona"));
        Futbolista objeto2 = new Futbolista(8, "Media punta", 30, "Zurdo", "Philipe", new equipo("la liga", 32, 122, 0, "FCBarcelona"));
        Futbolista objeto3 = new Futbolista(8, "Delantero", 29, "Diestro", "Luis", new equipo("la liga", 57, 30, 18, "FCbarcelona"));
        Futbolista objeto4 = new Futbolista(8, "Defensa", 25, "Zurdo", "Gerard", new equipo("la liga", 67, 150, 12, "FCbarcelona"));
        Futbolista objeto5 = new Futbolista(8, "Portero", 45, "Diestro", "Marc", new equipo("la liga", 50, 100, 10, "FCbarcelona"));

        objeto.escrbirarchivo(ruta, objeto1);
        objeto.escrbirarchivo(ruta, objeto2);
        objeto.escrbirarchivo(ruta, objeto3);
        objeto.escrbirarchivo(ruta, objeto4);
        objeto.escrbirarchivo(ruta, objeto5);
    }

    public void escrbirarchivo(String ruta, Futbolista futbolista) {
        try {
            ObjectOutputStream objeto = new ObjectOutputStream(new FileOutputStream(ruta));
            objeto.writeObject(futbolista);
            objeto.close();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

    public void leerarchivo(String ruta) {
        try {
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(ruta));
            Object auxiliar = leer.readObject();
            while (auxiliar != null) {
                Futbolista futbolista = (Futbolista) auxiliar;
                System.out.println(futbolista.getEquipo().getNumeroCopas());
                auxiliar = leer.readObject();
            }
        } catch (Exception p) {
            System.out.println("Error" + p);
        }
    }
}
