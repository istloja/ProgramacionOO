
public class figurasbidimencionales {
     /* EJEMPLO DE la HERENCIA*/
    
   /* String estilo;
    double area(){
        return base*altura/2;
    }
    void mostrarEstilo(){
        System.out.println("Triangulo es: "+estilo);
    }
}
class Lados3{
    public static void main(String[] args) {
        triangulo t1=new triangulo();
        triangulo t2=new triangulo();
        t1.base=4.0;
        t1.altura=4.0;
        t1.estilo="Estilo 1";
        t2.base=8.0;
        t2.altura=12.0;
        t2.estilo="Estilo 2";
        System.out.println("Información para T1: ");
        t1.mostrarEstilo();
        //t1.mostrarFigura();
        System.out.println("Su área es: "+t1.area());
        System.out.println();
        System.out.println("Información para T2: ");
        t2.mostrarEstilo();
        //t2.mostrarFigura();
        System.out.println("Su área es: "+t2.area());
    }*/
         //CONTROL DE ACCESO A MIEMBROS  DE HERENCIA 
     
    /*String estilo;
    double area(){
        return getBase()*getAltura()/2;
    }
    void mostrarEstilo(){
        System.out.println("Triangulo es: "+estilo);
    }
}
class Lados3{
    public static void main(String[] args) {
        triangulo t1=new triangulo();
         triangulo t2=new triangulo();
          t1.setBase(4.0);
           t1.setAltura(4.0);
            t1.estilo="Estilo 1";
             t2.setBase(8.0);
              t2.setAltura(12.0);
               t2.estilo="Estilo 2";
        System.out.println("Información para T1: ");
        t1.mostrarEstilo();
         t1.mostrarDimension();
        System.out.println("Su área es: "+t1.area());
         System.out.println();
        System.out.println("Información para T2: ");
          t2.mostrarEstilo();
           t2.mostrarDimension();
        System.out.println("Su área es: "+t2.area());
    }*/
    
    //CONSTRUCTORES Y HERENCIA
     
    /* private String estilo;
      //Constructor
    triangulo(String s, double b, double h){
        setBase(b);
        setAltura(h);
        estilo=s;
    }
    double area(){
        return getBase()*getAltura()/2;
    }
    void mostrarEstilo(){
        System.out.println("Triangulo es: "+estilo);
    }
}

class Lados3{
    public static void main(String[] args) {
        triangulo t1=new triangulo("Estilo 1",4.0,4.0);
         triangulo t2=new triangulo("Estilo 2",8.0,12.0);
        System.out.println("Información para T1: ");
         t1.mostrarEstilo();
        //t1.mostrartriangulo();
        System.out.println("Su área es: "+t1.area());
         System.out.println();
        System.out.println("Información para T2: ");
          t2.mostrarEstilo();
            //t2.mostrartriangulo();
        System.out.println("Su área es: "+t2.area());
    }
}*/
}


