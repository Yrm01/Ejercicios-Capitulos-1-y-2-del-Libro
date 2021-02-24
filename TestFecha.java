package Libro.cap02.fechas;

public class TestFecha {
    public static void main (String []args)
    {
        Fecha f = new Fecha();
        f.setdia(2);
        f.setmes(10);
        f.setanio(1970);
    
            // imprimo el dia
        System.out.println("Dia="+f.getdia());
        // imprimo el mes
        System.out.println("Mes="+f.getmes());
        // imprimo el anio
        System.out.println("Anio="+f.getanio());
        // imprimo la fecha
        System.out.println(f);
    }
}
