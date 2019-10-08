
package e_fechas;
//
// * @author anthony
 
public class E_fechas {
 clase  pública Clase_Date {

    public  static  void  main ( String [] args ) {
//         Fecha fecha = nueva Fecha ();
//        System.out.println (fecha);
//        System.out.println ("Año:" + (fecha.getYear () + 1900));
//        System.out.println ("Mes:" + fecha.getMonth ());
//        System.out.println ("Día:" + fecha.getDay ());
//        System.out.println ("Hora:" + fecha.getHours ()); 

        Fecha fecha =  nueva  Fecha ( 101 , 6 , 18 );
        Fecha fechaActual =  nueva  Fecha ();
        Sistema . a cabo . println (fecha . after (fechaActual));
        Sistema . a cabo . println (fecha . before (fechaActual));
    }

}
    }
    
}
