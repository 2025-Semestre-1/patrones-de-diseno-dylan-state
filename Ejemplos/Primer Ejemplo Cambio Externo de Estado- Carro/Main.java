public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(); 
        
        carro.acelerar();  // No debería acelerar estando apagado

        carro.encender();  // Cambia a estado encendido. Hay que hacerlo de forma externa
        carro.setEstado(new Encendido());

        carro.acelerar();  // Ahora sí acelera
        carro.frenar();    // Frena
        
        carro.apagar();    // Se apaga
        carro.setEstado(new Apagado()); //Cambio el estado
    }
}
