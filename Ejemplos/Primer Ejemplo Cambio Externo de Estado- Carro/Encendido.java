//Clase que implementa el comportamiento cuando está encendido
public class Encendido implements Estado
{
    //Aquí no guardo el objeto del contexto debido a que el cambio de estado se da externo

    public Encendido()
    {

    }

    public void encender(){
        System.out.println("El carro ya está encendido");
    }
    
    public void apagar(){
        System.out.println("El carro se está apagando"); //Comportamiento de este estado
        //El cambio de estado se da de forma externa
    }
    
    public void acelerar(){
        System.out.println("El carro está acelerando");
    }
    
    
    public void frenar(){
        System.out.println("El carro está frenando");
    }
}

