package Libro.cap02.misclases;


public class FechaHora extends FechaDetallada{
    
    private int hora;
    private int minuto;
    private int segundo;
    
    public FechaHora(String sFecha,int hora,int min, int seg)
    {
    super(sFecha);
    this.hora=hora;
    this.minuto=min;
    this.segundo=seg;
    }
    public FechaHora(){}
    public String toString()
    {
        return super.toString()+" ("+hora+":"+minuto+":"+segundo+")";
    }
    
    public int getHora()
    {
        //retornamos el valor de la variable dia
       return hora; 
    }
    public void setHora(int hora)
    {
        //asignamos el valor del parametro ala variable dia
        this.hora=hora;
    }
    public int getminuto()
    {
        return minuto;
    }
    public void setminuto(int minuto)
    {
        this.minuto=minuto;
    }
    public int getsegundo()
    {
        return segundo;
    }
    public void setsegundo(int segundo)
    {
        this.segundo=segundo;
    }
         
}
