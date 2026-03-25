package listaspoo;

import java.util.Scanner;

public class AlunosMatriculas {

    Scanner scanner = new Scanner(System.in);

    private String nome, matricula;
    private double notaP1 = -1;
    private double notaP2 = -1;
    private double notaTrab = -1;
    private double media = -1;
    private double paraFinal;
    
    public AlunosMatriculas(String nome, String matricula){
    this.nome = nome;
    this.matricula = matricula;
    }

    public double setNotaP1(){
        System.out.println("Insira a nota da P1:");
        notaP1 = scanner.nextFloat();        
        return notaP1;
    }

    public double setNotaP2(){
        System.out.println("Insira a nota da P2:");
        notaP2 = scanner.nextFloat();        
        return notaP2;
    }

    public double setNotaTrab(){
        System.out.println("Insira a nota do trabalho:");
        notaTrab = scanner.nextFloat();        
        return notaTrab;
    }
    
    public double setMedia(){
        if ((notaP1 < 0 || notaP2 < 0) || notaTrab < 0) {
            System.out.println("Há notas não informadas no sistema. Por favor, complete os dados antes de calcular a média");
            return -1;
        }
        else{

            media = (((notaP1*2.5)+(notaP2*2.5)+(notaTrab*2))/7);
            return media;
        }
    }
    
    public double setParaFinal(){
        if (media >= 6){
            System.out.println("O aluno foi aprovado e não precisará fazer a prova final.");
            return 0;
        }
        else if (media >= 0){
            paraFinal = 6+(6-media);
            return paraFinal;
        }
        else{
            System.out.println("Há notas ainda não inseridas no sistema. Por favor, complete as informações");
            return -1;
        }
    }
    
    public String getNome(){
        return this.nome;
    }

    public String getMatricula(){
        return this.matricula;
    }
}