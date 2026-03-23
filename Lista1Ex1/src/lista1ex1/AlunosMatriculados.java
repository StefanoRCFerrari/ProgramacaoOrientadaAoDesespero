package lista1ex1;

public class AlunosMatriculados {
    
    private String matricula;
    private String nome;
    private double notaP1 = 0, notaP2 = 0, notaTrab = 0, media = 0;
    
    public AlunosMatriculados(String matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }
    
    public void setNotaP1(double nota){
        this.notaP1 = nota;
    }
    
    public void setNotaP2(double nota){
        this.notaP2 = nota;
    }
    public void setNotaTrab(double nota){
        this.notaTrab = nota;
    }
    
    public double calcularMedia(){
        media =((this.notaP1*2.5) + (this.notaP2*2.5) + (this.notaTrab*2))/7;
        return media;
    }
    
    public double precisaFinal(){
        if (media > 0 && media < 6){
            return 6 + (6 - media);
        }
        return 0;
    }
}
