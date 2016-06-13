
/**
 * Write a description of class VehiculosGrandes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VehiculosGrandes extends Vehiculos
{
    protected float peso;
    /**
     * Constructor for objects of class VehiculosGrandes
     */
    public VehiculosGrandes(Marca marca, int antiguedad, int kilometraje, float peso)
    {
        super(marca, antiguedad, kilometraje);
        this.peso = peso;
    }

    public Marca getMarca(){
        return super.getMarca();
    }
    
    @Override
    public abstract boolean cumpleMedidas();
}
