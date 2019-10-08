package f_general1;

import java.util.Scanner;

public class F_General1 {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        double a;
        double b;
        double c;
        double x1;
        double x2;
        System.out.println("ingrese el valor de a");
        a = valor.nextDouble();
        System.out.println("ingrese el valor de b");
        b = valor.nextDouble();
        System.out.println("ingrese el valor de c");
        c = valor.nextDouble();
        double numero = (b * b) - (4 * a * c);
        if (numero > 0) {
            x1 = (-b + Math.sqrt(numero)) / 2 * a;
            x2 = (-b - Math.sqrt(numero)) / 2 * a;
            System.out.println("x1" + x1);
            System.out.println("x2" + x2);
        } else {
            if (numero == 0) {
                x1 = (-b) / 2 * a;
                System.out.println(" la ecuacion tiene solucion");
                System.out.println("x1" + x1);
            } else {
                System.out.println("no tiene solucion");
            }
        }

    }
}
