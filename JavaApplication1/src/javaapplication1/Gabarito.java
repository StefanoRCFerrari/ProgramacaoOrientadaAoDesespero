
package javaapplication1;

import java.util.Scanner;

public class Gabarito {
    
    char[] corretas = new char[15];
    Scanner scanner = new Scanner(System.in);
    int cont = 0;
    Gabarito(char[] corretas){
        this.corretas = corretas;
    }
    
    public void setCorretas(){
        for (cont = 0; cont < 15; cont++){
            System.out.println("Insira a resposta correta da questao " + (cont+1) + ": ");
            this.corretas[cont] = scanner.next().toUpperCase().charAt(0);
        }
    }
    
    public char respostaQuestao(int numeroQuestao){
        if (numeroQuestao > 0 && numeroQuestao < 16)
            return this.corretas[numeroQuestao-1];
        else{
            System.out.println("Numero de questao invalido.");
            return ' ';
        }
    }
}
