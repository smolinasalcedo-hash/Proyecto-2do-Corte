
package viajesespaciales;

public class NaveBelica extends NaveEspacial
{
    private String tipoArmamento;
    private int numeroMisiles;
    private float potenciaEscudos;
    private char rangoBelico; // // S: Superior - A: Destacado - B: Promedio - C: Deficiente - X: Indefinido - P: Desertor;

    //CONSTRUCTORES - EL PRIMERO SE PLANTEA COMO UNA NAVE PERSONALIZADA NUEVA O A MITAD DE CONFLICTO, EL SEGUNDO COMO UNA NAVE NUEVA  Y LISTA PARA DESPEGAR, 
    //Y EL TERCERO COMO UNA NAVE DE VIGILANCIA DE POCOS RECURSOS.
    
    public NaveBelica(String tipoArmamento, int numeroMisiles, float potenciaEscudos, char rangoBelico, String nombreNave, int tripulacion, double velocidadLuzMaxima, boolean motorActivo) {
        super(nombreNave, tripulacion, velocidadLuzMaxima, motorActivo);
       
        this.tipoArmamento = tipoArmamento;
        this.numeroMisiles = numeroMisiles;
        this.potenciaEscudos = potenciaEscudos;
        this.rangoBelico = rangoBelico;
    }

    public NaveBelica(String tipoArmamento, String nombreNave, int tripulacion) {
        super(nombreNave, tripulacion, 1.8, false);
        
        this.tipoArmamento = tipoArmamento;
        this.numeroMisiles = 50;
        this.potenciaEscudos = 100.0f;
        this.rangoBelico = 'B';
    }

    public NaveBelica(char rangoBelico, String nombreNave) {
        super(nombreNave, 1, 1.2, false);
        
        this.tipoArmamento = "Laser Estandar";
        this.numeroMisiles = 10;
        this.potenciaEscudos = 25.0f;
        this.rangoBelico = rangoBelico;
    }
    
    //GETTERS Y SETTERS

    public String getTipoArmamento() {
        
        return tipoArmamento;
    }
    public void setTipoArmamento(String tipoArmamento) {
        
        this.tipoArmamento = tipoArmamento;
    }

    public int getNumeroMisiles() {
        
        return numeroMisiles;
    }
    public void setNumeroMisiles(int numeroMisiles) {
        
        this.numeroMisiles = numeroMisiles;
    }

    public float getPotenciaEscudos() {
        
        return potenciaEscudos;
    }
    public void setPotenciaEscudos(float potenciaEscudos) {
        
        this.potenciaEscudos = potenciaEscudos;
    }

    public char getRangoBelico() {
       
        return rangoBelico;
    }
    public void setRangoBelico(char rangoBelico) {
        
        this.rangoBelico = rangoBelico;
    }

    @Override
    public String toString() {
        return super.toString() + "\nClase (NaveBelica) : " + "\n Tipo Armamento = " + tipoArmamento + "\n Numero Misiles = " + numeroMisiles + 
                "\n Potencia Escudos = " + potenciaEscudos + "\n Rango Belico = " + rangoBelico;
    }
    
    
    
    
    






}
