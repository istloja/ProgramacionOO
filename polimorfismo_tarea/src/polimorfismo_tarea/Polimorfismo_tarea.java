package Polimorfismo_tarea;

public class Polimorfismo_tarea {

    public static void main(String[] args) {

        double resultado = 0;
        double anguloenGrados = 45;
        double angulosenRadianes = Math.toRadians(anguloenGrados);

        //Coseno
        resultado = Math.cos(angulosenRadianes);
        System.out.println("Coseno de " + anguloenGrados + "° = " + resultado);

        //Seno
        resultado = Math.sin(angulosenRadianes);
        System.out.println("Seno de " + anguloenGrados + "° = " + resultado);

        //Tangente
        resultado = Math.tan(angulosenRadianes);
        System.out.println("Tangente de " + anguloenGrados + "° = " + resultado);

    }

}
