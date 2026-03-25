package listaspoo;

public class Data{
    
    String formatada;
    boolean bissexto;
    int dia, mes, ano, diaMax;
    String[] nomeMeses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    public Data (int dia, int mes, int ano){
        
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
        
    this.bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);  

    if (this.mes < 1 || this.mes > 12)
        this.mes = 1;
    
    if ((this.mes <= 7 && this.mes % 2 == 1) || (this.mes >= 8 && this.mes % 2 == 0))
        this.diaMax = 31;
    else if (this.mes == 2 && this.bissexto)
        this.diaMax = 29;
    else if (this.mes == 2)
        this.diaMax = 28;
    else
        this.diaMax = 30;
    
    if (this.dia > this.diaMax || this.dia < 1 )
        this.dia = 1;
    
    this.formatada = String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
    }
    
    public int compara(Data outraData){
       if (this.formatada.equals(outraData.formatada))
           return 0;
       else if (this.ano > outraData.ano)
           return 1;
       else if (this.ano == outraData.ano && this.mes > outraData.mes)
           return 1;
       else if (this.ano == outraData.ano && this.mes == outraData.mes && this.dia > outraData.dia)
           return 1;
       else
           return -1;
    }

    public int getDia(){
        return this.dia;
    }
    
    public int getMes(){
        return this.mes;
    }
    
    public String getMesExtenso(){
        return this.nomeMeses[this.mes - 1];
    }
    
    public int getAno(){
        return this.ano;
    }
    
    public boolean isBissexto(){
        return this.bissexto;
    }
    
    
    public Data clonar(){
        return new Data(this.dia, this.mes, this.ano);
    }
}