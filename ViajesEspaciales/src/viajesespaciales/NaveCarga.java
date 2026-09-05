package viajesespaciales;

public class NaveCarga extends NaveEspacial {

    private String tipoMercancia;
    private int compartimientosLlenos;
    private double pesoTotalToneladas;
    private char sectorDescarga; //SECTOR 'A', 'B' o 'C' .... SIENDO 'A' EL MÁS ADINERADO Y 'C' EL MÁS EMPOBRECIDO ... 'X' hace referencia a no definido

    //CONSTRUCTORES - el primero se plantea como una nave personalizada nueva o cruzando la galaxia, el segundo como una nave recien cargada   y lista para despegar, 
    //y el tercero como una nave sin nada, lista para ser cargada.
    
    public NaveCarga(String tipoMercancia, int compartimientosLlenos, double pesoTotalToneladas, char sectorDescarga, String nombreNave, int tripulacion, double velocidadLuzMaxima, boolean motorActivo) {
        super(nombreNave, tripulacion, velocidadLuzMaxima, motorActivo);

        this.tipoMercancia = tipoMercancia;
        this.compartimientosLlenos = compartimientosLlenos;
        this.pesoTotalToneladas = pesoTotalToneladas;
        this.sectorDescarga = sectorDescarga;
    }

    public NaveCarga(char sectorDescarga, int tripulacion, String nombreNave) {
        super(nombreNave, tripulacion, 1.1, false);

        this.tipoMercancia = "Varios";
        this.compartimientosLlenos = 2;
        this.pesoTotalToneladas = 10;
        this.sectorDescarga = sectorDescarga;
    }

    public NaveCarga(String nombreNave) {
        super(nombreNave, 2, 0.8, false);
        
        this.tipoMercancia = "Por Definir";
        this.compartimientosLlenos = 0;
        this.pesoTotalToneladas = 0;
        this.sectorDescarga = 'X';
    }

    public String getTipoMercancia() {

        return tipoMercancia;
    }
    public void setTipoMercancia(String tipoMercancia) {

        this.tipoMercancia = tipoMercancia;
    }

    public int getCompartimientosLlenos() {

        return compartimientosLlenos;
    }
    public void setCompartimientosLlenos(int compartimientosLlenos) {

        this.compartimientosLlenos = compartimientosLlenos;
    }

    public double getPesoTotalToneladas() {

        return pesoTotalToneladas;
    }
    public void setPesoTotalToneladas(double pesoTotalToneladas) {

        this.pesoTotalToneladas = pesoTotalToneladas;
    }

    public char getSectorDescarga() {

        return sectorDescarga;
    }
    public void setSectorDescarga(char sectorDescarga) {

        this.sectorDescarga = sectorDescarga;
    }

    @Override
    public String toString() {
        return super.toString() + "\nClase (NaveCarga) : " + "\n Tipo Mercancia = " + tipoMercancia + "\n Compartimientos Llenos = " + compartimientosLlenos
                + "\n Peso Total Toneladas = " + pesoTotalToneladas + "\n Sector Descarga = " + sectorDescarga;
    }

}
