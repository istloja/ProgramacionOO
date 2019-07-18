package exepciones;

import java.io.File;

public class Archivos {

    public static void main(String[] args) {
        File archivo = new File("C:\\Users\\anthony\\Desktop\\ejemplo.txt");
        System.out.println(archivo.exists());
        /*metodo sirve para ver si el archivo esxiste o no*/
        System.out.println(archivo.isDirectory());/*para saber si existe una carpeta*/
        // para saber la fecha de modificacion del archivo
        System.out.println(archivo.lastModified());
        //para obtener el nombre
        System.out.println(archivo.getName());
        //para borrar el archivo
        //no usar porque se borra 
        //System.out.println(archivo.delete());
        File carpeta = new File("C:\\Users\\anthony\\Desktop");
        String[] archivos = carpeta.list();
        for (int i = 0; i < archivos.length; i++) {
            System.out.println(archivos[i]);
        }
    }
}
