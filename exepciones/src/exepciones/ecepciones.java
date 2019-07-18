package exepciones;

import java.util.Scanner;

public class ecepciones {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("ingrese su numero");
        int numero = 0;
        try /*protege*/ {
            numero = entrada.nextInt();

        } catch /*presenta el mensaje que el usuario va a ver */ (Exception e /* e es una variable*/) {
            System.out.println("se ha generado la excepcion " + e);

//        }finally /*emite el error 
//        el finally siempre ocurre cuando hay una excepcion*/{
//            System.out.println("el numero es incorrecto ");
//              numero= entrada1.nextInt();
        }
        System.out.println("el numero ingresado es:" + numero);
        try {
            int resultado = numero / 0;
            System.out.println("el resultado" + resultado);
        } catch (Exception b) {
            System.out.println("no se puede dividor para el numero 0");
        }
    }
}
