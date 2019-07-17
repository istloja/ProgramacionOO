
package java_unidades_peso;
import java.util.Scanner;
public class Java_unidades_peso {
    private double gr;
    private double kg;
    private double lb;
    private double mlgr;
    private double tl;

    public double getGr() {
        return gr;
    }

    public void setGr(double gr) {
        this.gr = gr;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public double getLb() {
        return lb;
    }

    public void setLb(double lb) {
        this.lb = lb;
    }

    public double getMlgr() {
        return mlgr;
    }

    public void setMlgr(double mlgr) {
        this.mlgr = mlgr;
    }

    public double getTl() {
        return tl;
    }

    public void setTl(double tl) {
        this.tl = tl;
    }
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        System.out.println("ingrese un valor deacuerdo a la conversion que necesita");
        System.out.println("1 - gramos a kilogramos");
        System.out.println("2 - kilogramos a libras");
        System.out.println("3 - kilogramos a miligramos");
        int tipo =entrada.nextInt();
        switch (tipo){
            case 1:
                Java_unidades_peso dato = new Java_unidades_peso();
                System.out.println("Ingrese el valor total de gramos a convertir");
                System.out.println(dato.gramosakilogramos(entrada.nextDouble(), tipo));
            case 2:
                Java_unidades_peso dato1 = new Java_unidades_peso();
                System.out.println("ingrese el valor total de kilogramos a convertir");
                System.out.println(dato1.kilogramoslibras(entrada.nextDouble(), tipo));
            case 3:
                Java_unidades_peso dato2 = new Java_unidades_peso();
                System.out.println("Ingrese el valor de kilogramos a convertir");
                System.out.println(dato2.kilogramosagramos(entrada.nextDouble(), tipo));
                
            break;
            
    }
}

    private boolean gramosakilogramos(double nextDouble, int tipo) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private boolean kilogramoslibras(double nextDouble, int tipo) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private boolean kilogramosagramos(double nextDouble, int tipo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
    

