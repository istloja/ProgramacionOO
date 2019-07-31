package ejercicios_2;

public class ejercicio_2 {

    public class Persona {

        private String Nombre;
        private int Edad;
        private int DNI;
        private String Sexo;
        private double Peso;
        private double Altura;
        private final static char SEXO = 'H';

        public Persona() {

        }

        public Persona(String Nombre, int Edad, String Sexo) {
            this.Nombre = Nombre;
            this.Edad = Edad;
            this.Sexo = Sexo;
        }

        public Persona(String Nombre, int Edad, int DNI, String Sexo, double Peso, double Altura) {
            this.Nombre = Nombre;
            this.Edad = Edad;
            this.DNI = DNI;
            this.Sexo = Sexo;
            this.Peso = Peso;
            this.Altura = Altura;
        }

        void Calcular(double peso, double altura) {
            double a = (peso / (Math.pow(altura, 2)));
            if (a < 20) {
                System.out.println(-1);
                if (a >= 20 && a <= 25) {
                    System.out.println(0 + "esta en bajo su peso ideal");
                    if (a > 25) {
                        System.out.println(1 + "tiene sobre peso");
                    }
                }
            }
        }

        boolean Mayordeedad(int edad) {

            if (edad >= 18) {
                return true;
            } else {
                return false;
            }
        }

    }

}
