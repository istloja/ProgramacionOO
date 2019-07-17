
package java_unidades_peso;

class java_unidades_peso {
    
    public double gramo_miligramo(double gr, double mlgr){
        mlgr=gr*1000;
        return mlgr;
    }
    public double miligramo_gramo(double mlgr, double gr){
        gr= mlgr/1000;
        return gr;
    }
    public double gramo_kilogramo(double gr, double kg){
        kg = gr/1000;
        return  kg;
    }
    public double kilogramo_gramo(double kg, double gr){
        gr= kg*1000;
        return gr;
    }
    public double kilogramo_tonelada(double kg, double tl){
        tl= kg/1000;
        return tl;
    }
    public double tonelada_kilogramo(double tl, double kg){
        kg= tl*1000;
        return kg;
    }
    public double kilogramo_libra (double kg, double lb){
        lb= kg*2.20;
        return lb;
    }
    public double libra_kilogramo(double lb, double kg){
        kg= lb/2.20;
        return kg;
    }
    }
