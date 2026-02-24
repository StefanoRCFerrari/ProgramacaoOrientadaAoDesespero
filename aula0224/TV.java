package aula0224;

public class TV {
    //atributos
    private String marca;
    private boolean ligada;
    private int canal;
    private int volume;
    
    //métodos
    public TV(String fabricante){
    marca = fabricante;
    ligada = false;
    canal = -1;
    volume = -1;
    }
    
    public void ligar(){
        ligada = true;
        canal = 500;
        volume = 10;
    }
    
    public void desligar(){
        ligada = false;
        canal = -1;
        volume = -1;
    }
    
    @Override
    public String toString(){
        if(ligada){
            return "TV " + marca + ": Ligada no canal " + canal + " no volume " + volume;
        }
        else{
            return "TV " + marca + ": Desligada";
        }
    }
    
    public void setCanal(int novoCanal){
        if (ligada && novoCanal <= 500 && novoCanal > 0){
            canal = novoCanal;
            System.out.println("Mudando para o canal: " + canal);
        }
        else if (ligada){
            System.out.println("Canal Inválido");
        }
        else{
            System.out.println("TV Desligada. Mudança de canal não realizada.");
        }
    }
}



