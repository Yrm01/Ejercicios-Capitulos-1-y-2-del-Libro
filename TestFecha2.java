package Libro.cap02.fechas;

public class TestFecha2 {
    
    public static void main(String[]args)
    {
    Fecha f=new Fecha();
    f.setdia(2);        //aqui tira el error y finaliza el programa
    f.setmes(10);       //no se llega a ejecutar
    f.setanio(1970);    //no se llega a ejecutar
    
    System.out.println(f);  //no se llega a ejecutar
    }
}
