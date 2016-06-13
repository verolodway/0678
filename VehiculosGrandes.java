
/**
 * Write a description of class VehiculosGrandes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class VehiculosGrandes extends Vehiculos
{
    protected int peso;
    /**
     * Constructor for objects of class VehiculosGrandes
     */
    public VehiculosGrandes(Marca marca, int antiguedad, int kilometraje, int peso)
    {
        super(marca, antiguedad, kilometraje);
        this.peso = peso;
    }

    public Marca getMarca(){
        return super.getMarca();
    }
    
    public int getPeso(){
        return peso;
    }
}
