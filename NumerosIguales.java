package Libro.cap01.Ejercicios;

import java.util.Scanner;
public class NumerosIguales 
{
    public static void main (String []args)
    {
        double Num1,Num2;
    Scanner scanner= new Scanner(System.in);
    System.out.println("Cature el Primer numero");
    Num1= scanner.nextDouble();
    System.out.println("Cature el Segundo numero");
    Num2= scanner.nextDouble();
    
        if (Num1==Num2) 
        {
            System.out.println("Son Iguales");
        } 
        else 
        {
            System.out.println("Son Diferentes");
        }
    }
}
