public class Main {
    public static void main(String[] args) {
        Persona p = new Persona(new Feliz());

        System.out.println("Estado: Feliz");
        p.comer();
        p.trabajar();
        p.dormir();

        System.out.println("\nEstado: Ansioso");
        p.setEstado(new Ansioso());
        p.comer();
        p.trabajar();
        p.dormir();
    }
}
