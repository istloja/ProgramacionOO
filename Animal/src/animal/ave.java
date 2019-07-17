/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

public class ave extends Animal{
    private boolean volador;
  private int nemoro_huevos;


    public boolean isVolador() {
        return volador;
    }

    public void setVolador(boolean volador) {
        this.volador = volador;
    }

    public int getNemoro_huevos() {
        return nemoro_huevos;
    }

    public void setNemoro_huevos(int nemoro_huevos) {
        this.nemoro_huevos = nemoro_huevos;
    }
  
    public ave(String especie, String color, double peso, double altura, int edad) {
        super(especie, color, peso, altura, edad);
    }

    public ave(boolean volador, int nemoro_huevos, String especie, String color, double peso, double altura, int edad) {
        super(especie, color, peso, altura, edad);
        this.volador = volador;
        this.nemoro_huevos = nemoro_huevos;
    }
    
  
     
}
