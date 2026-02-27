package aula0224;

public class TV {
    //atributos
    private final String marca;
    private boolean ligada;
    private int canal;
    int volume;
    
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

    public String getMarca() {
        return marca;
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
    
      public void mudarVolume(char mudavol){
        if (ligada && volume < 100 && mudavol == '+'){
            volume += 1;
            System.out.println("Volume: " + volume);
        }
        else if (ligada && volume > 0 && mudavol == '-'){
            volume -= 1;
            System.out.println("Volume: " + volume);
        }
        else{
            System.out.println("Não foi possível alterar o volume.");
        }
    }
      
      public int getCanal(){
          return canal;
      }
      public int getVolume(){
          return volume;
      }
      }