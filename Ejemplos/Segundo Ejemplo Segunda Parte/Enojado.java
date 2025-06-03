
public class Enojado implements Accion {
    public Enojado(){
        
    }

    //Comportamientos de acuerdo a este estado de ánimo
    public void comer() {
        System.out.println("Comiendo de mala gana.");
    }

    public void trabajar() {
        System.out.println("¡Odio este trabajo!");
    }

    public void dormir() {
        System.out.println("No puedo dormir del enojo.");
    }
}
