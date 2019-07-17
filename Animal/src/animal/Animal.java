
package animal;

public class Animal {
    
    private String nombre ;
    private String color;
    private double peso;
    private double altura;
    private int edad;

    public Animal(String especie, String color, double peso, double altura, int edad) {
        this.nombre = especie;
        this.color = color;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }
        public void alimentarse (){
            System.out.println("soy un"+nombre+"y me alimento");
        }
        public String informacionAnimal(){
         String cadena = "soy un"+"y mi peso es"+peso+color;
         return cadena;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
        
}
      