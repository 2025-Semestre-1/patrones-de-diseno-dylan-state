//Clase que implementa el comportamiento cuando está encendido
public class Encendido implements Estado
{
    // Atributo para almacenar el objeto del contexto
    private Carro carro;

    public Encendido(Carro carro)
    {
        //Guarda el objeto
        this.carro = carro;
    }

    public void encender(){
        System.out.println("El carro ya está encendido");
    }
    
    public void apagar(){
        System.out.println("El carro se está apagando"); //Comportamiento de este estado
        //Cambiando al estado. Ahora el carro va a estar apagado
        Estado nuevoEstado = new Apagado(carro);
        carro.setEstado(nuevoEstado);
    }
    
    public void acelerar(){
        System.out.println("El carro está acelerando");
    }
    
    
    public void frenar(){
        System.out.println("El carro está frenando");
    }
}

