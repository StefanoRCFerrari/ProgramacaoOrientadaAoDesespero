package exemploaula06;

public class Empregado {
    
    //Atributos de Classe
    private static int proxCod = 100;
    private static final String EMPRESA = "Fatec Campinas";
    private static int totalEmpr = 0;
    
    //Atributos de Instância
    private int codigo;
    private String nome;
    private String departamento;
    private float salario;
    
    
    public static void mostraTotal(){
        System.out.println("Total de empregados: " + totalEmpr);
    }
    
    public static void mostraPorClasse(Empregado ex){
        System.out.println(ex.codigo + " - " + ex.nome + " - " + ex.departamento + " - " + EMPRESA +  "\nSalário: R$" + String.format("%.2f", ex.salario));
    }
    
    public Empregado(String nome){
        this.codigo = proxCod++;
        this.nome = nome;
        totalEmpr++;
    }
    
    public void setSalario(float salario){
        this.salario = salario;
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getDepartamento(){
        return this.departamento;
    }
    
    public float getSalario(){
        return this.salario;
    }

    public void mostraEmpregado(){
        System.out.println(this.codigo + " - " + this.nome + " - " + this.departamento + " - " + EMPRESA +  "\nSalário: R$" + String.format("%.2f", this.salario));
    }
    
}
