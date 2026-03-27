package javaapplication1;

public class VetEx5 {
    
    int tamanho, posicao, contador;
    String[] simula;
    String[] hold;
    
    public VetEx5(int tamanho){
        this.tamanho = tamanho;
        this.posicao = 0;
        this.simula = new String[tamanho];
    }
    
    public void insert(String msg){
        if (posicao < tamanho){
            this.simula[posicao] = msg;
            this.posicao++;
        }
        else{
            this.hold = new String[tamanho+1];
            for (contador = 0; contador < tamanho; contador++){
                hold[contador] = simula[contador];
            }
            this.tamanho++;
            this.simula = new String[tamanho];
            for (contador = 0; contador < tamanho; contador++){
                simula[contador] = hold[contador];
            }
            this.simula[posicao] = msg;
            this.posicao++;
        }
    }
    
    public String get(int posicao){
        if (posicao < 0 || posicao >= this.tamanho) {
            return null;
        }
        if (this.simula[posicao] == null || this.simula[posicao].isEmpty()) {
            return null;
        }
        return this.simula[posicao];
    }
    
    public int size(){
        return this.posicao;
    }
}
