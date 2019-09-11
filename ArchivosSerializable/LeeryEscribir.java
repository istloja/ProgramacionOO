package ArchivosSerializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LeeryEscribir {

    public void escribirArchivo(String rutaArchivo, Persona persona) {

        try {
            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream(rutaArchivo));
            escribir.writeObject(persona);
            escribir.close();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

    }

    public void leerArchivo(String rutaArchivo) {
        try {
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(rutaArchivo));
            Object aux = leer.readObject();
//            System.out.println(aux);
            Persona persona=(Persona) aux;
            System.out.println(persona.getNombre());
            System.out.println(persona.getMascota().getNombre());

        } catch (Exception e) {
            System.out.println("error" + e);
        }
    }

    public static void main(String[] args) {
        
        LeeryEscribir objet = new LeeryEscribir();
        Persona objeto = new Persona("Santiago", "Alvarado", 20, new Mascota("Kashi", 4));
        objet.escribirArchivo("C:\\Users\\Usuario\\Desktop\\rutaarchivo.txt", objeto);
        objet.leerArchivo("C:\\Users\\Usuario\\Desktop\\rutaarchivo.txt");
    }

}
