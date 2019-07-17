/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

public class ejecutar {
    public static void main(String[] args) {
        Animal objetoanimal= new Animal("perro","negro",6.75, 1.34, 3);
        mamiferos objeto2= new mamiferos (8.5 ,"carne", "zorro", "negro", 1.23, 23, 225);
        ave objeto3= new ave("aguila","negro", 23, 43,17);
        
      objetoanimal.alimentarse();
      objeto2.alimentarse();
      objeto3.alimentarse();
       objetoanimal.informacionAnimal();
        System.out.println(objetoanimal.informacionAnimal());
      
        
        
    }
  
}
