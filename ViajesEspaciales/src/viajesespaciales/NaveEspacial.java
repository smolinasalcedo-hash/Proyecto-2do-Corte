
package viajesespaciales;

public class NaveEspacial 
{
    private String nombreNave;
    private int tripulacion;
    private double velocidadLuzMaxima;
    private boolean motorActivo;
    
    //CONSTRUCTORES
    public NaveEspacial(String nombreNave, int tripulacion, double velocidadLuzMaxima, boolean motorActivo) {
        
        this.nombreNave = nombreNave;
        this.tripulacion = tripulacion;
        this.velocidadLuzMaxima = velocidadLuzMaxima;
        this.motorActivo = motorActivo;
    }

    public NaveEspacial(String nombreNave, int tripulacion) {
        
        this(nombreNave, tripulacion, 1.5, false);
    }

    public NaveEspacial(String nombreNave) {
        
        this(nombreNave, 1);
    }
    //GETTERS Y SETTERS
    
    public String getNombreNave() {
        
        return nombreNave;
    }
    public void setNombreNave(String nombreNave) {
        
        this.nombreNave = nombreNave;
    }

    public int getTripulacion() {
        
        return tripulacion;
    }
    public void setTripulacion(int tripulacion) {
        
        this.tripulacion = tripulacion;
    }

    public double getVelocidadLuzMaxima() {
        
        return velocidadLuzMaxima;
    }
    public void setVelocidadLuzMaxima(double velocidadLuzMaxima) {
        
        this.velocidadLuzMaxima = velocidadLuzMaxima;
    }

    public boolean isMotorActivo() {
        
        return motorActivo;
    }
    public void setMotorActivo(boolean motorActivo) {
        
        this.motorActivo = motorActivo;
    }

    ///METODO TOSTRING
    @Override
    public String toString() {
        return "NaveEspacial{" + "Nombre de la nave=" + nombreNave + ", Tripulacion=" + tripulacion + ", Velocidad Luz Maxima=" + velocidadLuzMaxima + ", Motor Activo=" + motorActivo + '}';
    }
    
    
    
    
    
    
    
    

    
}
