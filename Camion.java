
/**
 * Write a description of class Camion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camion extends VehiculosGrandes
{

    /**
     * Constructor for objects of class Camion
     */
    public Camion(Marca marca, int antiguedad, int kilometraje, int peso)
    {
        super(marca, antiguedad, kilometraje, peso);
    }

    public boolean sonArticulados(){
        boolean articulado = false;
        if(super.getMarca().getString().equals("Ford") || super.getMarca().getString().equals("Fiat")){
            articulado = true;
        }
        return articulado;
    }

    @Override
    public boolean cumpleMedidas(){
        boolean cumpleMedidas = false;
        if(sonArticulados() && peso < 3000){
            cumpleMedidas = true;
        }
        else if(!sonArticulados() && peso < 2000){
            cumpleMedidas = true;
        }
        return cumpleMedidas;
    }
}
