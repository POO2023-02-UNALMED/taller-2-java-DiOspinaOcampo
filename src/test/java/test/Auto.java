package test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados = 0;
    
    public Auto(String modelo, int precio, Asiento[] asientos, String marca, Motor motor, int registro) {
        this.modelo = modelo;
        this.precio = precio;
        this.asientos = asientos;
        this.marca = marca;
        this.motor = motor;
        this.registro = registro;
        Auto.cantidadCreados++;
    }
    
    public int cantidadAsientos(){
        int numeroAsientos = 0;
        for(Asiento asiento: this.asientos) {
            if(asiento != null) {
                numeroAsientos++;
            }
        }
        
        return numeroAsientos;
    }
    
    public String verificarIntegridad() {
        String mensajeErroneo = "Las piezas no son originales";
        if(this.registro != this.motor.registro) {
            return mensajeErroneo;
        }
        
        for(Asiento asiento: this.asientos) {
            if(this.registro != asiento.registro) {
                return mensajeErroneo;
            }
        }
        
        return "Auto original";
    }
}