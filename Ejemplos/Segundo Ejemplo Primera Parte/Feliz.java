//Implementa la interfaz y da un comportamiento personalizado a los métodos-
public class Feliz implements Accion{
    public Feliz(){
        
    }

    public void comer() {
        System.out.println("¡Qué rico comer!");
    }

    public void trabajar() {
        System.out.println("Me encanta trabajar.");
    }

    public void dormir() {
        System.out.println("Dormiré plácidamente.");
    }
}
