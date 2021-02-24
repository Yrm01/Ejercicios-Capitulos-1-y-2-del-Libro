package Libro.cap02.interfaces;

public class Alumno implements Comparable<Alumno>
{
        private String nombre;
        private int edad;
        private double notaPromedio;
        // constructor
        public Alumno(String nom, int e, double np)
        {
            this.nombre = nom;
            this.edad = e;
            this.notaPromedio = np;
        }
        // metodo heredado de la interface Comparable
        public int compareTo(Alumno otroAlumno)
        {
            return this.edad - otroAlumno.edad;
        }
        public String toString()
        {
            return nombre+", "+edad+", "+notaPromedio;
        }
        
        public String getNombre()
    {
        //retornamos el valor de la variable dia
       return nombre; 
    }
    public void setNombre(String nom)
    {
        //asignamos el valor del parametro ala variable dia
        this.nombre=nom;
    }
    
    public int getEdad()
    {
        //retornamos el valor de la variable dia
       return edad; 
    }
    public void setEdad(int Edad)
    {
        //asignamos el valor del parametro ala variable dia
        this.edad=Edad;
    }
    
    public double getNotaPromedio()
    {
        //retornamos el valor de la variable dia
       return notaPromedio; 
    }
    public void setNotaPromedio(double notaPromedio)
    {
        //asignamos el valor del parametro ala variable dia
        this.notaPromedio=notaPromedio;
    }
}
