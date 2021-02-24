package Libro.cap01.Ejercicios;

import java.util.Scanner;

public class Radio 
{
    public static void main(String []args)
    {
    double radio,area;
    Scanner scanner= new Scanner(System.in);
    
    System.out.println("Capture el Radio del circulo");
    radio=scanner.nextDouble();
    area=Math.PI*Math.pow(radio, 2);
    
    System.out.println("El Area del Circulo es:"+area);
    }
}
