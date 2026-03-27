package javaapplication1;

public class VetEx6 {
    
    int tamanho, posicao, contador;
    String[] simula;
    String[] hold;
    
    public VetEx6(int tamanho){
        this.tamanho = tamanho;
        this.posicao = 0;
        this.simula = new String[tamanho];
    }
    
    public void insert(String nome){
        if (posicao < tamanho){
            for (contador = posicao; contador >= 0 ; contador--){
                if (nome.charAt(0) < this.simula[contador].charAt(0))
                    this.simula[contador+1] = this.simula[contador];
                else if (nome.charAt(0) < this.simula[contador].charAt(0))
                    this.simula[contador] = nome;
            }
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
            for (contador = posicao; contador >= 0 ; contador--){
                if (nome.charAt(0) < this.simula[contador].charAt(0))
                    this.simula[contador+1] = this.simula[contador];
                else if (nome.charAt(0) < this.simula[contador].charAt(0))
                    this.simula[contador] = nome;
            }
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
    
    public VetEx6 merge (VetEx6 outroVet){
        int posV1 = 0, posV2 = 0, posV3 = 0;
        int tamFinal = this.tamanho+outroVet.tamanho;
        VetEx6 novoVet = new VetEx6(tamFinal);
        
        while (posV1 < this.tamanho && posV2 < outroVet.tamanho){
            if (this.simula[posV1].charAt(0) < outroVet.simula[posV2].charAt(0)){
                novoVet.simula[posV3] = this.simula[posV1];
                posV1++;
            }
            else if (this.simula[posV1].charAt(0) > outroVet.simula[posV2].charAt(0)){
                novoVet.simula[posV3] = this.simula[posV2];
                posV2++;
            }
            posV3++;
        }
        
        if (posV1 < this.tamanho)
            for (contador = posV1; contador < tamFinal; contador++){
                novoVet.simula[posV3] = this.simula[contador];
                posV3++;
            }
        if (posV2 < this.tamanho)
            for (contador = posV2; contador < tamFinal; contador++){
                novoVet.simula[posV3] = outroVet.simula[contador];
                posV3++;
            }
        return novoVet;
    }
}
