public class Persona{
    private String estado; //Atributo donde se almacena el estado

    public Persona(String estado){
        this.estado = estado; //Estado inicial
    }

    public void comer(){
        //De esta manera se tienen que utilizar multiples para controlar todos los posibles estados. Habría que modificar el código para agregar
        //un nuevo estado
        //Lo mismo sucedería si se utilizara un switch

        if(this.estado.equals("Feliz")){
            System.out.println("¡Qué rico comer!");
        }else if(this.estado.equals("Ansioso")){
            System.out.println("Como rápido sin disfrutarlo...");
        }else{
            System.out.println("Estado no definido");
        }
    }

    public void trabajar(){
        if(this.estado.equals("Feliz")){
            System.out.println("Me encanta trabajar.");
        }else if(this.estado.equals("Ansioso")){
            System.out.println("Me cuesta concentrarme, demasiadas ideas.");
        }else{
            System.out.println("Estado no definido");
        }
    }

    public void dormir(){
        if(this.estado.equals("Feliz")){
            System.out.println("Dormiré plácidamente.");
        }else if(this.estado.equals("Ansioso")){
            System.out.println("No puedo dormir, mi mente no se apaga.");
        }else{
            System.out.println("Estado no definido");
        }
    }

    //Cambia el estado
    public void setEstado(String estado){
        this.estado = estado;
    }
}