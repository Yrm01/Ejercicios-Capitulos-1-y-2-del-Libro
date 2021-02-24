package Libro.cap01;

import java.util.Scanner;
public class DemoMatriz {
    
    public static void main(String [] args)
    {
    Scanner scanner= new Scanner (System.in);
    
    System.out.println("Ingrese la Cantidad de Filas: ");
    int f=scanner.nextInt();
    
    System.out.println("Ingrese la cantidad de columnas: ");
    int c=scanner.nextInt();
    
    //se Crea una Matriz de f Filas x C Columnas
    int matriz [][]= new int[f][c];
    
    int nro;
    //se crean 2 for para poder correr la matriz uno 
    //para las filas y el otro para las columnas
        for (int i = 0; i < f; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                // se generan numeros aleatorios entre 0 y 1000
                nro=(int)(Math.random()*1000);
                //se le Asigna el numero ala matriz
                matriz[i][j]= nro;
            }
        }
        //se crean otros 2 for oara poder imprimir la matriz
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                //se imprime la celda de la matriz
                System.out.print(matriz[i][j]+"\t");
                
            }
            System.out.println();
        }
    
    }
}
