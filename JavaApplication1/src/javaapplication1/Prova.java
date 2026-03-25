package javaapplication1;

public class Prova {
    
    char[] gabarito = new char[15];
    char[] alternativas = new char[15];
    int controle = 0, acertos = 0;
    float nota = 0;
    char ajuste;
    
    public Prova(Gabarito gabarito){
        this.gabarito = gabarito.corretas;
    }

    public void respostaAluno(char alternativa){
        ajuste = Character.toUpperCase(alternativa);
        alternativas[controle] = ajuste;
        controle++;
        if (alternativas[controle] == gabarito[controle]){
            acertos++;
            if (controle < 10)
                nota += 0.5;
            else
                nota++;
        }
    }
    
    public int acertos(){
        return this.acertos;
    }
    
    public float nota(){
        return this.nota;
    }


}
