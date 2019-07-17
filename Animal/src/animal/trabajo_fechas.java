/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import java.util.Date;

public class trabajo_fechas {
   /* public static void main(String[] args) {
        Date fecha = new Date(118,9,16);
        System.out.println(fecha);*/
        /*Date fecha = new Date();
          System.out.println("Year"+(fecha.getYear()+1900));
          System.out.println("Month"+(fecha.getMonth()));
          System.out.println("");*/
    public static void main(String[] args) {
      Date fecha =new Date (101,6,18);
      Date fechaActual = new Date();
        System.out.println(fecha.after(fechaActual));
        System.out.println(fecha.before(fechaActual));
    }   
}
