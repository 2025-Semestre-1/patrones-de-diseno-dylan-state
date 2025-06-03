public class Apagado implements Estado
{   
    //Aquí no guardo el objeto del contexto debido a que el cambio de estado se da externo

    public Apagado()
    {

    }
    
    public void encender(){
        System.out.println("El carro se está encendiendo"); //Acción correspondiente a este estado
        //El cambio de estado se da de forma externa
    }
    
    public void apagar(){
        System.out.println("El carro está apagado, no se puede volver a apagar");
    }
    
    public void acelerar(){
        System.out.println("El carro está apagado, no se puede acelerar");
    }
    
    public void frenar(){
        System.out.println("El carro apagado, no puede frenar");
    }
}
