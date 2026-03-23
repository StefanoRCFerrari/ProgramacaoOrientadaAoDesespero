package lista1ex1;
//Construtor não tem tipo de retorno, usar double pra coisas que forem participar de cálculos
//
public class Lista1Ex1 {

    public static void main(String[] args) {
        
       AlunosMatriculados aluno1;
       aluno1 = new AlunosMatriculados("ADS-M-001", "André Silva Sauro");
    
       aluno1.setNotaP1(8);
       aluno1.setNotaP2(8);
       aluno1.setNotaTrab(8);
       aluno1.calcularMedia();
       System.out.println(aluno1.precisaFinal());
    }
    
}
