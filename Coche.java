
/**
 * Write a description of class Coche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coche extends VehiculosPequeños
{

    /**
     * Constructor for objects of class Coche
     */
    public Coche(Marca marca, int antiguedad, int kilometraje, int numeroDePlazas)
    {
        super(marca, antiguedad, kilometraje, numeroDePlazas);
    }

    public int getNumeroDePlazas(){
        return super.getNumeroDePlazas();
    }
    
    public int pasaRevision(){
        int pasaRev = 1;
        if(super.getMarca().getString().equals("Ford")){
            pasaRev = 2;
        }
        return pasaRev;
    }
}
