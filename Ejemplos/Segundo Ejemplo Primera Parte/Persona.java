//Clase del contexto
public class Persona {
    private Accion estado;

    public Persona() {
        // Estado inicial
        this.estado = new Feliz();
    }

    //Cambia a uno de los estados que utilicen la interfaz Accion
    public void setEstado(Accion nuevoEstado) {
        this.estado = nuevoEstado;
    }

    //Acciones definidas
    public void comer() {
        this.estado.comer(); //Utiliza la función que provee el objeto del estado
    }

    public void trabajar() {
        this.estado.trabajar();
    }

    public void dormir() {
        this.estado.dormir();
    }
}
