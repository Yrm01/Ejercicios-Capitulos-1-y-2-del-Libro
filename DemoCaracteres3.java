package Libro.cap01;


public class DemoCaracteres3 {
    public static void main (String []args)
    {
    char C;
        for (int i = 'A'; i <='Z'; i++) {
            //para asignar un int en un char debemos "Castear"
            C=(char)i;
            System.out.println(C);
        }
    
    }
}
