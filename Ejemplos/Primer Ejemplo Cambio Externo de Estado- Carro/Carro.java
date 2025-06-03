public class Carro
{
    // Variables de instancia
    private Estado estado;

    /**
     * Constructor. Se inicia el carro apagado 
     */
    public Carro()
    {
        // Se inicializa
        estado = new Apagado();
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

    public void setEstado(Estado estado){
        this.estado = estado;
    }
}
