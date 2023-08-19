package test;
public class Asiento {
	String color;
    int precio;
    int registro;
    
    public Asiento(String color, int precio, int registro) {
        this.color = color;
        this.precio = precio;
        this.registro = registro;
    }
    
    public void cambiarColor(String color) {
        String[] coloresValidos = {"rojo", "verde", "amarillo", "negro", "blanco"};
        for(String colorValido : coloresValidos) {
            if(colorValido.equalsIgnoreCase(color)) {
                this.color = color;
                break;
            }
        }
    }
}
