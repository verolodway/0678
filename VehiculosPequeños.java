
/**
 * Write a description of class VehiculosPequeños here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VehiculosPequeños extends Vehiculos
{
    private int numeroDePlazas;
    private int revision; 

    /**
     * Constructor for objects of class VehiculosPequeños
     */
    public VehiculosPequeños(Marca marca, int antiguedad, int kilometraje, int numeroDePlazas)
    {
       super(marca, antiguedad, kilometraje);
       this.numeroDePlazas = numeroDePlazas;
    }
    
    public int getNumeroDePlazas(){
        return numeroDePlazas;
    }
    
    public Marca getMarca(){
        return super.getMarca();
    }
    
    @Override
    public boolean cumpleMedidas(){
        if(getClass().getName().equals("Coche")){
            if(numeroDePlazas < 5){
                medidasDeSeguridad = true;
            }
        }
        else if(getClass().getName().equals("FurgonetaPequeña")){
            if(numeroDePlazas < 7){
                medidasDeSeguridad = true;
            }
        }
        else{
            medidasDeSeguridad = false;
        }
        return medidasDeSeguridad;
    }
}
