package Libro.cap01;
import java.util.Scanner;
    

public class DemoArray2 {
    public static void main(String [] args)
    {
    
    String dias[]= {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
    Scanner scanner = new Scanner (System.in);
    System.out.println("Ingrese un dia de la semana (Numero):");
    int v = scanner.nextInt();
    if (v<=dias.length && v>0)
    {
    System.out.println(dias[v-1]);
    }
    else
    {
    System.out.println("Dia Incorrecto");
    }
    }
}
