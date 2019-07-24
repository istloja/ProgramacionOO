package polimorfismo_tarea;

public class conversiones {

    public static void main(String[] args) {
        double anguloEnGrados = 45;

        double anguloEnRadianes = Math.toRadians(anguloEnGrados);
        System.out.println("grados a radianes" + anguloEnGrados + "° = " + anguloEnRadianes + "radianes");

        anguloEnGrados = Math.toRadians(anguloEnRadianes);
        System.out.println(" radianes a grados" + anguloEnRadianes + "radiaciones = " + anguloEnGrados + "°");

    }

}
