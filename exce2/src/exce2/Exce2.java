package exce2;

public class Exce2 {

    public static void main(String[] args) {
        
        try{
            conta c1 = new conta(14023);
            
            c1.dep(200);
            c1.sac(100);
            c1.sac(300);
        }
        catch (saldoins e){
            System.out.println("Sem saldo");
        }
            
    }
    
}
