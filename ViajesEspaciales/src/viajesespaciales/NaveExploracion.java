
package viajesespaciales;



public class NaveExploracion extends NaveEspacial {
   
    private String galaxiaDestino;
    private long anosLuzRecorridos;
    private double nivelBateria;
    private char clasificacionPlaneta; // S: Masivo - A: Grande - B: Normal - C: Pequeño - X: Indefinido - P: Peligroso;

    //CONSTRUCTORES - EL PRIMERO SE PLANTEA COMO UNA NAVE PERSONALIZADA NUEVA O A MITAD DE UN VIAJE, EL SEGUNDO COMO UNA NAVE RECIEN CONSTRUIDA,
    //Y EL TERCERO COMO UNA SONDA INACTIVA O EN RESERVA
    
    public NaveExploracion(String galaxiaDestino, long anosLuzRecorridos, double nivelBateria, char clasificacionPlaneta, String nombreNave, int tripulacion, double velocidadLuzMaxima, boolean motorActivo) {
        super(nombreNave, tripulacion, velocidadLuzMaxima, motorActivo);
        
        this.galaxiaDestino = galaxiaDestino;
        this.anosLuzRecorridos = anosLuzRecorridos;
        this.nivelBateria = nivelBateria;
        this.clasificacionPlaneta = clasificacionPlaneta;
    }

    public NaveExploracion(String nombreNave, int tripulacion, String galaxiaDestino) {
        super(nombreNave, tripulacion, 2.0, false);
        
        this.galaxiaDestino = galaxiaDestino;
        this.anosLuzRecorridos = 0L;
        this.nivelBateria = 100.0f;
        this.clasificacionPlaneta = 'X';
    
    }

    public NaveExploracion(String nombreNave) {
        super(nombreNave, 0, 1.0, false);
        
        this.galaxiaDestino = "Desconocida";
        this.anosLuzRecorridos = 0L;
        this.nivelBateria = 100.0f;
        this.clasificacionPlaneta = 'X';
    }

    //GETTERS Y SETTER
    public String getGalaxiaDestino() {
        
        return galaxiaDestino;
    }
    public void setGalaxiaDestino(String galaxiaDestino) {
        
        this.galaxiaDestino = galaxiaDestino;
    }

    public long getAnosLuzRecorridos() {
        
        return anosLuzRecorridos;
    }
    public void setAnosLuzRecorridos(long anosLuzRecorridos) {
        
        this.anosLuzRecorridos = anosLuzRecorridos;
    }

    public double getNivelBateria() {
        
        return nivelBateria;
    }
    public void setNivelBateria(double nivelBateria) {
        
        this.nivelBateria = nivelBateria;
    }

    public char getClasificacionPlaneta() {
        
        return clasificacionPlaneta;
    }
    public void setClasificacionPlaneta(char clasificacionPlaneta) {
        
        this.clasificacionPlaneta = clasificacionPlaneta;
    }
    
    
    //TOSTRING
    @Override
    public String toString() {
        return super.toString() + "\nClase (NaveExploracion) : " + "\n Galaxia Destino = " + galaxiaDestino + "\n Anos Luz Recorridos = " + anosLuzRecorridos + 
                "\n Nivel Bateria = " + nivelBateria + "\n Clasificacion Planeta = " + clasificacionPlaneta;
    }

   
    
    
    
    
    
    
    
    
    
}
