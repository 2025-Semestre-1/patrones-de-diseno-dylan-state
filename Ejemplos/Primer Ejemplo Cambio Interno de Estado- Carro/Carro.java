public class Carro
{
    // Atributos
    private Estado estado;

    /**
     * Constructor. Se inicia el carro apagado 
     */
    public Carro()
    {
        // Se inicializa
        estado = new Apagado(this);
    }
    
    public void encender(){
        estado.encender(); //Como se puede ver, llama a la función del objeto que contiene
    }
    
    public void apagar(){
        estado.apagar();
    }
    
    public void acelerar(){
        estado.acelerar();
    }
    
    public void frenar(){
        estado.frenar();
    }

    //Cambia el estado entre los que haya disponibles que utilicen la interfaz
    public void setEstado(Estado estado){
        this.estado = estado;
    }
}
