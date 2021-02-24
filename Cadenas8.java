package Libro.cap01.Cadenas;

/**
 *
 * @author YoelR
 */
import java.util.Scanner;
public class Cadenas8 {
    public static void main(String []args)
    {
    Scanner scanner= new Scanner(System.in);
    
    System.out.println("Ingrese una cadena:");
    String s1=scanner.next();
    
    System.out.println("Ingrese Otra cadena:");
    String s2=scanner.next();
    
    System.out.println("s1 = [" + s1 + "]");
    System.out.println("s2 = [" + s2 + "]");
    
    //Esto esta mal !!!
    /*
        if (s1==s2) 
        {
        System.out.println("Son Iguales");
        }
        else
        {
        System.out.println("Son Distintas");
        }
        */
    //Ahora si !!!
        if (s1.equals(s2)) 
        {
        System.out.println("Son Iguales");    
        }else
        {
        System.out.println("Son distintas");
        }
    }
}
