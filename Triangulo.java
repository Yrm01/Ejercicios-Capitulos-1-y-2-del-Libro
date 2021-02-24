package Libro.cap02.figuras;


public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    
    public Triangulo(int b, int h)
    {
        super("Triangulo");
        base = b;
        altura = h;
    }
    public double area()
    {
    return base*altura/2;
    }
    public double getbase()
    {
        //retornamos el valor de la variable dia
       return base; 
    }
    public void setbase(int base)
    {
        //asignamos el valor del parametro ala variable dia
        this.base=base;
    }
    public double getaltura()
    {
        //retornamos el valor de la variable dia
       return altura; 
    }
    public void setaltura(int altura)
    {
        //asignamos el valor del parametro ala variable dia
        this.altura=altura;
    }
}
