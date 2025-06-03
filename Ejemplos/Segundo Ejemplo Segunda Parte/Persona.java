public class Persona {
    private Accion estado;

    public Persona(Accion estado) {
        this.estado = estado;
    }

    public void setEstado(Accion nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public void comer() {
        this.estado.comer();
    }

    public void trabajar() {
        this.estado.trabajar();
    }

    public void dormir() {
        this.estado.dormir();
    }
}
