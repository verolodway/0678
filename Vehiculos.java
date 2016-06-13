
/**
 * Write a description of class Vehículos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Vehiculos 
{
    private Marca marca;
    private int antiguedad;
    private int kilometraje;
    private int numeroId;
    protected boolean medidasDeSeguridad;
    /**
     * Constructor for objects of class Vehículos
     */
    public Vehiculos(Marca marca, int antiguedad, int kilometraje)
    {
        this.marca = marca;
        this.antiguedad = antiguedad;
        this.kilometraje = kilometraje;
        numeroId = 0;
        numeroId++;
    }
    
    public int getAntiguedad(){
        return antiguedad;
    }
    
    public int getKilometraje(){
        return kilometraje;
    }
    
    public int getId(){
       return numeroId;
    }
    
    public Marca getMarca(){
        return marca;
    }
    
    public abstract boolean cumpleMedidas();
        
    
    
}
