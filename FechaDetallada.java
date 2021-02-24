package Libro.cap02.misclases;

import Libro.cap02.fechas.Fecha;

public class FechaDetallada extends Fecha{
    private static String meses[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio"
                  ,"Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    public String toString()
    {
        return getdia()+" de "+meses[getmes()-1]+" de "+getanio();
    }   
   
    public FechaDetallada(int dia, int mes,int anio)
    {
        //invcamos al contructor del padre
        super(dia,mes,anio);
    }
    public FechaDetallada(String s)
    {
        //invocamos al constructor del padre
        super(s);
    }
    public FechaDetallada()
    {//invocamos al constructor de 3 int pasando ceros
        this(0,0,0);
    }
    
}
