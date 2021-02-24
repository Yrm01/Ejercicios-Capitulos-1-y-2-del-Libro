package Libro.cap01.Ejercicios;

/**
 *
 * @author YoelR
 */
import java.util.Scanner;
public class Circunferencia 
{
    public static void main(String []args)
    {
        double radio, circunferencia;
        Scanner scanner = new Scanner(System.in);
    System.out.println("Capture el radio de la Circunferencia");
    radio=scanner.nextDouble();
    circunferencia=2*radio*Math.PI;
    
    System.out.println("la circunferencia es:"+circunferencia);
    }
}
