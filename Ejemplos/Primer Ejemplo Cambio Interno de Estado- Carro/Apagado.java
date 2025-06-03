public class Apagado implements Estado
{   
    Carro carro; //En este caso cambio el estado dentro de las acciones, por lo tanto necesito una referencia al contexto (carro)

    public Apagado(Carro carro)
    {
        this.carro = carro;
    }
    
    public void encender(){
        System.out.println("El carro se está encendiendo"); //Acción correspondiente a este estado
        //Cambiando al siguiente estado. Ahora el carro va a estar encendido
        Estado nuevoEstado = new Encendido(carro); 
        carro.setEstado(nuevoEstado);
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
