/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_mapa;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author anthony
 */
public class E_Mapa {


    public  static  void  main ( String [] args ) {
//         HashMap <String, String> mapa = new HashMap <> ();
//        
//         Scanner entrada = new Scanner (System.in);
//         String Ciudad = "";
//         String codigo = "";
//         para (int i = 0; i <5; i ++) {
//             System.out.println ("Ingrese su codigo" + codigo);
//             codigo = entrada.next ();
//             System.out.println ("Ingrese su ciudad" + Ciudad);
//             Ciudad = entrada.next ();
//             mapa.put (codigo, Ciudad);
//         }
//         System.out.println (mapa);

        HashMap < String , Integer > mapa1 =  new  HashMap <> ();
        Scanner entrada1 =  nuevo  escáner ( System . In );
        Cadena  Cedula  =  " " ;
        int edad =  0 ;
        para ( int i =  0 ; i <  3 ; i ++ ) {
            Sistema . a cabo . println ( " Ingrese su Cedula "  +  Cedula );
            Cedula  = entrada1 . próximo();
            Sistema . a cabo . println ( " Ingrese su edad "  + edad);
            edad = entrada1 . nextInt ();
            mapa1 . poner ( Cedula , edad);
        }

        Sistema . a cabo . println ( " Ingrese su cedula "  +  Cedula );
        Cedula  = entrada1 . próximo();
        mapa1 . quitar ( Cedula );
        Sistema . a cabo . println (mapa1);

    }
}
    
   
