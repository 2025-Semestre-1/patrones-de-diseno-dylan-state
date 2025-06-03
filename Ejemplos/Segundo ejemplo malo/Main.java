public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Feliz");

        //Ejemplo con estado Feliz
        System.out.println("Estado: Feliz");
        p.comer();
        p.trabajar();
        p.dormir();

        //Ejemplo con estado ansioso
        System.out.println("\nEstado: Ansioso");
        p.setEstado("Ansioso");
        p.comer();
        p.trabajar();
        p.dormir();
    }
}
