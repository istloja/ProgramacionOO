package tareapoo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class LEER_Y_ESCRIBIR {

    public void escribir_srchivo(String ruta, Futbolista futbolista) {
        try {
            //Out: Escribir en el archivo 
            ObjectOutputStream ejemplo = new ObjectOutputStream(new FileOutputStream(ruta));
            ejemplo.writeObject(futbolista);
            ejemplo.close();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

    public static void main(String[] args) {
        LEER_Y_ESCRIBIR objeto = new LEER_Y_ESCRIBIR();
        Futbolista objeto1 = new Futbolista(8, "Cinco", 23, "Diestro", "Andres", new equipo("la liga", 63, 100, 5, "FCBarcelona"));
        Futbolista objeto2 = new Futbolista(8, "Media punta", 30, "Zurdo", "Philipe", new equipo("la liga", 32, 122, 0, "FCBarcelona"));
        Futbolista objeto3 = new Futbolista(8, "Delantero", 29, "Diestro", "Luis", new equipo("la liga", 57, 30, 18, "FCbarcelona"));
        Futbolista objeto4 = new Futbolista(8, "Defensa", 25, "Zurdo", "Gerard", new equipo("la liga", 67, 150, 12, "FCbarcelona"));
        Futbolista objeto5 = new Futbolista(8, "Portero", 45, "Diestro", "Marc", new equipo("la liga", 50, 100, 10, "FCbarcelona"));

        List<Futbolista> lista = new ArrayList<>();
        lista.add(objeto1);
        lista.add(objeto2);
        lista.add(objeto3);
        lista.add(objeto4);
        lista.add(objeto5);
        objeto.escribir_lista("C:\\Users\\anthony\\Desktop\\Equipo.txt", lista);
        objeto.Leer_archivo("C:\\Users\\anthony\\Desktop\\Equipo.txt");
        List<Futbolista> lista1 = objeto.lista("C:\\Users\\anthony\\Desktop\\Equipo.txt");
        for (Futbolista futbolista : lista1) {
            System.out.println(futbolista.getAños());

        }
    }

    public void Leer_archivo(String ruta) {
        try {
            //In: Leer en el archivo
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(ruta));
            Object auxiliar = leer.readObject();
//            System.out.println(persona.getNombre());
//            System.out.println(persona.getMascota());
//            System.out.println(auxiliar);
            while (auxiliar != null) {
                Futbolista futbolista = (Futbolista) auxiliar;
                System.out.println(futbolista.getEquipo().getJuegodores());
                auxiliar = leer.readObject();
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

    public void escribir_lista(String direccion_archivo, List<Futbolista> listaFutbolista) {
        try {
            ObjectOutputStream leer = new ObjectOutputStream(new FileOutputStream(direccion_archivo));
            for (Futbolista futbolista : listaFutbolista) {
                leer.writeObject(futbolista);
            }
        } catch (Exception e) {
        }
    }

    public List<Futbolista> lista(String direccion) {
        List<Futbolista> lista = new ArrayList<Futbolista>();
        try {
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = leer.readObject();
            while (auxiliar != null) {
                Futbolista futbolista = (Futbolista) auxiliar;
                lista.add(futbolista);
                auxiliar = leer.readObject();
            }
        } catch (Exception e) {
        }
        return lista;
    }
}
