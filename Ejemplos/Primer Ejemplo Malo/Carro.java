public class Carro {
    private boolean estado; //True para encendido, false para apagado
    
    public Carro(){
        this.estado = false; //El valor es apagado al principio
    }

    public void encender(){
        //Dependiendo del estado es un comportamiento u otro
        if(this.estado){
            //El estado es true, el estado ya está encendido
            System.out.println("El carro ya está encendido");
        }else{
            System.out.println("El carro se está encendiendo");
            this.estado = true;
        }
    }

    public void apagar(){
        if(this.estado){
            //Está encendido, tengo que apagar el carro
            System.out.println("El carro se está apagando");
            this.estado = false;
        }else{
            //El carro está apagado
            System.out.println("El carro ya está apagado");
        }
    }

    public void acelerar(){
        if(this.estado){
            //El carro está encendido
            System.out.println("El carro está acelerando");
        }else{
            //El carro está apagado, no puede acelerar
            System.out.println("El carro está apagado, no puede acelerar");
        }
    }

    public void frenar(){
        if(this.estado){
            //El carro está encendido, puede frenar
            System.out.println("El carro está frenando");
        }else{
            System.out.println("El carro está apagado, no puede frenar");
        }
    }
}
