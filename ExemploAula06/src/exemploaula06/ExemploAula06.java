package exemploaula06;

public class ExemploAula06 {

    public static void main(String[] args) {
        
        Empregado e1 = new Empregado("Jose");
        e1.setDepartamento("TI");
        e1.setSalario(7000);
        
        Empregado e2 = new Empregado("Maria");
        e2.setDepartamento("Vendas");
        e2.setSalario(9000);
    
        e1.mostraEmpregado();
        e2.mostraEmpregado();
        
        Empregado.mostraTotal();
        
        Empregado.mostraPorClasse(e1);
        Empregado.mostraPorClasse(e2);
        
    }
    
}
