package Libro.cap01;

import java.util.Scanner;
public class ParOImpar {
    
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un valor: ");
        int v= scanner.nextInt();
        
        int Resto = v % 2;
        if (Resto==0) 
        {
         System.out.println(v + "Es Par");
        }
        else
        {
            System.out.println(v+"Es Impar");
        }
    }
}
