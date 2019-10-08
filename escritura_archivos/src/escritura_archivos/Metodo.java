package escritura_archivos;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Metodo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresar la direccion del archivo");
        String direccion = entrada.nextLine();
        System.out.println("ingrese el texto a escribir el archivo");
        String texto = entrada.nextLine();
        Metodo objeto = new Metodo();
        objeto.escribir_archivo(texto, direccion);

    }

    public void escribir_archivo(String mensaje, String direccion_archivo) {
        try {
            FileWriter archivo = new FileWriter(direccion_archivo);
            PrintWriter escribir = new PrintWriter(archivo);
            escribir.println(mensaje);
            archivo.close();
        } catch (Exception e) {
        }
    }
}
