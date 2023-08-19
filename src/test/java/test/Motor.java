package test;

public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;
    
    public Motor() {
        
    }
    
    public Motor(int numeroCilindros, int registro) {
        this.numeroCilindros = numeroCilindros;
        this.registro = registro;
    }
    
    public Motor(int numeroCilindros, int registro, String tipo) {
        this.numeroCilindros = numeroCilindros;
        this.registro = registro;
        this.asignarTipo(tipo);
    }
    
    public void cambiarRegistro(int registro) {
        this.registro = registro;
    }
    
    public void asignarTipo(String tipo) {
        String[] tiposValidos = {"electrico","gasolina"};
        for(String tipoValido : tiposValidos) {
            if(tipoValido.equalsIgnoreCase(tipo)) {
                this.tipo = tipo;
                break;
            }
        }
    }
}