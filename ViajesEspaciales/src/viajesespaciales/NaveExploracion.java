
package viajesespaciales;



public class NaveExploracion extends NaveEspacial {
   
    private String galaxiaDestino;
    private long anosLuzRecorridos;
    private double nivelBateria;
    private char clasificacionPlaneta; // S: masivo - A: grande - B: normal - C: pequeño - X: indefinido,

    //CONSTRUCTORES
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
        super(nombreNave);
        
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
        return super.toString() + "NaveExploracion{" + "Galaxia Destino=" + galaxiaDestino + ", Anos Luz Recorridos=" + anosLuzRecorridos + ", Nivel Bateria=" + nivelBateria + ", Clasificacion Planeta=" + clasificacionPlaneta + '}';
    }

   
    
    
    
    
    
    
    
    
    
}
