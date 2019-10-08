 package escritura_archivos;
 
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Escritura_archivos {

    public static void main(String[] args) throws IOException {
        FileWriter archivo = null;//escribimos variables de tipo FileWriter 
        PrintWriter escritor = null;//la escritura nos permite dar texto al bog de notas

        try {
            archivo = new FileWriter("C:\\Users\\anthony\\Desktop\\notas.txt");
            escritor = new PrintWriter(archivo);//enviar archivo
            escritor.println("meta #1 culmitar los proyectos de vida ");
            escritor.println("meta#2 llegar a conocer varios lugares del mundo");
            escritor.println("meta#3 culminar mi libro");
        } catch (Exception e) {
            System.out.println("error i" + e.getMessage());
            archivo.close();
        }
        archivo.close();
    }
   
}

