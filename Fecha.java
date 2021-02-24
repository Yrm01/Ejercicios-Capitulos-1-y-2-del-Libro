package Libro.cap02.fechas;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    //Constructor
    public Fecha()
    {}
    public Fecha(int d,int m,int a)
    {
    dia =d;
    mes= m;
    anio=a;
    }
    public Fecha(String s)
    {
        //busca la primera ocurrencia de '/'
    int pos1=s.indexOf('/');
        //busca la ultima Ocurrencia de '/'
    int pos2=s.lastIndexOf('/');
    //proceso el dia
    String sDia=s.substring(0,pos1);
    dia = Integer.parseInt(sDia);
    //proceso del mes
    String sMes=s.substring(pos1+1,pos2);
    mes = Integer.parseInt(sMes);
    
    //proceso del año
    String sAnio=s.substring(pos2+1);
    anio=Integer.parseInt(sAnio);
    }
    public int getdia()
    {
        //retornamos el valor de la variable dia
       return dia; 
    }
    public void setdia(int dia)
    {
        //asignamos el valor del parametro ala variable dia
        this.dia=dia;
    }
    public int getmes()
    {
        return mes;
    }
    public void setmes(int mes)
    {
        this.mes=mes;
    }
    public int getanio()
    {
        return anio;
    }
    public void setanio(int anio)
    {
        this.anio=anio;
    }
    //sobrecribimos el metodo toString(lo heredamos de object)
    public String toString()
    {   
        //retorna una cadenatal como queremos que se vea la fecha
        return dia+"/"+mes+"/"+anio;
    }
    public boolean equals(Object o)
    {
    Fecha otra=(Fecha)o;
    return(dia==otra.dia)&&(mes==otra.mes)&&(anio==otra.anio);
    }
    //retorn la fecha expresada en dias
    private int fechaToDias()
    {
        //no requiere mucha explicacion
        return anio*360+mes*30+dia;
    }
    
    //Asigna la fecha expresadad en dias a los atributos
    private void diasToFecha(int i)
    {
        // dividimos por 360 y obtenemos el anio
            anio = (int)i/360;
        // del resto de la division anterior podremos obtener el mes y el dia
            int resto = i % 360;
        // el mes es el resto dividido 30
            mes = (int) resto/30;
        // el resto de la division anterior son los dias
            dia = resto % 30;
       
        // ajuste por si dia quedo en cero
        if( dia == 0)
        {
            dia=30;
            mes--;
        }
        // ajuste por si el mes quedo en cero
        if( mes == 0)
        {
            mes=12;
            anio--;
        }
    }
    public void addDias(int d)
    {
        // convierto la fecha a dias y le sumo d
        int sum=fechaToDias()+d;
        // la fecha resultante (sum) la separo en dia, mes y anio
        diasToFecha(sum);
    }
}
