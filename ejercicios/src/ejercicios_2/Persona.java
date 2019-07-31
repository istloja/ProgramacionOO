package ejercicios_2;

import java.util.Scanner;

class Persona {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el Nombre");
        String Nombre = entrada.nextLine();
        System.out.println("Ingrese la edad");
        String Edad = entrada.nextLine();
        System.out.println("Ingrese el sexo");
        String Sexo = entrada.nextLine();
        System.out.println("Ingrese el peso");
        String peso = entrada.nextLine();
        System.out.println("Ingrese la Altura");
        String altura = entrada.nextLine();
        Persona objeto = new Persona();

    }

}
