package base_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexion {

    public void Conexeion(String usuario, String clave) {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection poo = DriverManager.getConnection("jdbc:mysql://localhost/futbol_db", usuario, clave);
            System.out.println(poo.getCatalog());
            Statement s= poo.createStatement();
            //inicializamos la consulta
            ResultSet resultado = s.executeQuery("select * from persona");
            while(resultado.next()){
                System.out.println(resultado.getInt("idpersona"));
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

    }

    public static void main(String[] args) {
        Conexion poo = new Conexion();
        poo.Conexeion("root", "root");
    }
}
