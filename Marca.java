
/**
 * Enumeration class Marca - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Marca
{
    FIAT("Fiat"), FORD("Ford"), OPEL("Opel"), CITROEN("Citroen");
    private String marcaString;
    
    Marca(String cadena){
        marcaString = cadena;
    }
    
    public String getString(){
        return marcaString;
    }
}
