/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

public class mamiferos extends Animal {
    private double tiempo_de_gestacion;
    private String tipo_de_alimentacion;

    public double getTiempo_de_gestacion() {
        return tiempo_de_gestacion;
    }

    public void setTiempo_de_gestacion(double tiempo_de_gestacion) {
        this.tiempo_de_gestacion = tiempo_de_gestacion;
    }

    public String getTipo_de_alimentacion() {
        return tipo_de_alimentacion;
    }

    public void setTipo_de_alimentacion(String tipo_de_alimentacion) {
        this.tipo_de_alimentacion = tipo_de_alimentacion;
    }

     
    public mamiferos(String especie, String color, double peso, double altura, int edad) {
        super(especie, color, peso, altura, edad);
    }

    public mamiferos(double tiempo_de_gestacion, String tipo_de_alimentacion, String especie, String color, double peso, double altura, int edad) {
        super(especie, color, peso, altura, edad);
        this.tiempo_de_gestacion = tiempo_de_gestacion;
        this.tipo_de_alimentacion = tipo_de_alimentacion;
    }
  
    
}
