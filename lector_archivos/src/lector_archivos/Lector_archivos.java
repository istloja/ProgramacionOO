
package lector_archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Lector_archivos {

    public static void main(String[] args) {
      
        File archivo = new File("C:\\Users\\anthony\\Desktop\\metas.txt");
         try {
            FileReader lector = new FileReader(archivo);//pasar el archivo a un objeto
            BufferedReader re = new BufferedReader(lector);//me va ha servir para recorrer un archivo
            String linea = "";

            while ((linea= re.readLine()) != null) {//leer liena por linea el archivo 
                System.out.println(linea);
            }
            re.close();// cerrar el archivo 
        } catch (Exception e) {
            System.out.println("ocurrio un error" + e);
        }
    }
}
    
    
