import java.util.ArrayList;
/**
 * Write a description of interface Flota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flota
{
    private ArrayList<Vehiculos> vehiculos;
    private int contadorFORD;
    private int contadorFIAT;
    private int contadorOPEL;
    private int contadorCITROEN;
    public Flota(){
        vehiculos = new ArrayList<>();
        contadorFORD = 0;
        contadorFIAT = 0;
        contadorOPEL = 0;
        contadorCITROEN = 0;
    }
    
    public void addVehiculo(Vehiculos vehiculo){
        vehiculos.add(vehiculo);
        if(vehiculo.getMarca() == Marca.FORD){
            contadorFORD++;
        }
        else if(vehiculo.getMarca() == Marca.FIAT){
            contadorFIAT++;
        }
        else if(vehiculo.getMarca() == Marca.OPEL){
            contadorOPEL++;
        }
        else if(vehiculo.getMarca() == Marca.CITROEN){
            contadorCITROEN++;
        }
    }
    
    public void removeVehiculo(int id){
        for(Vehiculos veh : vehiculos){
            if(veh.getId() == id){
                vehiculos.remove(veh);
            }
        }
    }
    
    public Marca marcaMayoritaria(){
        Marca marcaMayoritaria = null;
        if(contadorOPEL > contadorFIAT){
            if(contadorOPEL > contadorFORD){
                if(contadorOPEL > contadorCITROEN){
                    marcaMayoritaria = Marca.OPEL;
                }
            }
        }
        else if(contadorFIAT > contadorFORD){
            if(contadorFIAT > contadorCITROEN){
                marcaMayoritaria = Marca.FIAT;
            }
        }
        else if(contadorFORD > contadorCITROEN){
            marcaMayoritaria = Marca.FORD;
        }
        else{
            marcaMayoritaria = Marca.CITROEN;
        }
        
        return marcaMayoritaria;
    }
    
    public boolean cumplenMedidas(){
        boolean cumpleMedidas = true;
        for(Vehiculos vehi : vehiculos){
            if(!vehi.cumpleMedidas()){
                cumpleMedidas = false;
            }
        }
        return cumpleMedidas;
    }
    
    public int[] getDatos(int id){
        int[] datos;
        if(getClass().getName().equals("VehiculosPequeños")){
            if(getClass().getName().equals("Coche")){
                datos = new int[5];
                datos[0] = id;
                datos[1] = vehiculos.get(id).getAntiguedad();
                datos[2] = vehiculos.get(id).getKilometraje();
                datos[3] =((Coche)vehiculos.get(id)).getNumeroDePlazas();
                datos[4] = ((Coche)vehiculos.get(id)).pasaRevision();
            }
            datos = new int[4];
            datos[0] = id;
            datos[1] = vehiculos.get(id).getAntiguedad();
            datos[2] = vehiculos.get(id).getKilometraje();
            datos[3] = ((Coche)vehiculos.get(id)).getNumeroDePlazas();
        }
        else{
            datos = new int[4];
            datos[0] = id;
            datos[1] = vehiculos.get(id).getAntiguedad();
            datos[2] = vehiculos.get(id).getKilometraje();
            datos[3] = ((Camion)vehiculos.get(id)).getPeso();
        }
        return datos;
    }
}
