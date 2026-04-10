package exce;

public class Exce {

   public static void main(String[] args) {
       
       
        try{
            calc caso1 = new calc(1, 0);
            System.out.println(caso1.soma());
            System.out.println(caso1.divide());
        }
        catch(NumberFormatException e){
            System.out.println("Erro");
        }
    }
    
}
