public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(); //Con el estado apagado por defecto
        
        carro.acelerar();  // No debería acelerar estando apagado
        carro.encender();  // Cambia a estado encendido
        carro.acelerar();  // Ahora sí acelera
        carro.frenar();    // Frena
        carro.apagar();    // Se apaga
    }
}
