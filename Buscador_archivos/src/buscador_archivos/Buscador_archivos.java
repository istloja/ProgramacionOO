package Buscador_archivos;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Buscador_archivos {

    public static void main(String[] args) {
        int op = 0;
        Scanner dato = new Scanner(System.in);
        try {
            System.out.println("Elija la opcion:");
            System.out.println("1 buscador de archivos del escritorio");
            System.out.println("2 buscador de archivos de documentos");
            System.out.println("3 buscador de archivos de imagenes");
            System.out.println("4 buscador de archivos de videos");
            System.out.println("5 buscador de archivos de musica");
            op = dato.nextInt();
            if (op > 0) {
                switch (op) {
                    case 1:
                        File carpeta = new File("C:\\Users\\anthony\\Desktop");
                        String[] archivos = carpeta.list();
                        for (int i = 0; i < archivos.length; i++) {
                            System.out.println(archivos[i]);
                        }
                        break;
                    case 2:
                        File carpeta1 = new File("");
                        archivos = carpeta1.list();
                        for (int i = 0; i < archivos.length; i++) {
                            System.out.println(archivos[i]);
                        }
                        break;
                    case 3:
                        File carpeta2 = new File("C:\\Users\\anthony\\Documents");
                        archivos = carpeta2.list();
                        for (int i = 0; i < archivos.length; i++) {
                            System.out.println(archivos[i]);
                        }
                        break;
                    case 4:
                        File carpeta3 = new File("C:\\Users\\anthony\\Videos");
                        archivos = carpeta3.list();
                        for (int i = 0; i < archivos.length; i++) {
                            System.out.println(archivos[i]);
                        }
                        break;
                    case 5:
                        File carpeta4 = new File("C:\\Users\\anthony\\Music");
                        archivos = carpeta4.list();
                        for (int i = 0; i < archivos.length; i++) {
                            System.out.println(archivos[i]);
                        }
                        break;
                    default:
                        System.out.println("ingresar un numero del 1 al 5 ");
                        break;
                }
            } else {
                System.out.println("ingrese un numero mayor a 0");
            }
        } catch (Exception e) {
            System.out.println("Se ha generado la excepcion" + e);
        }
        System.out.println("El numero ingresado es" + op);
    }
}
