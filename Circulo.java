package Libro.cap02.figuras;


public class Circulo extends FiguraGeometrica
{
    private int radio;
    
    public Circulo(int r)
    {
        super("Circulo");
        radio = r;
    }
    public double area()
    {
            //retorna *PI por radio al cuadrado
            return Math.PI*Math.pow(radio,2);
    }
    
     public double getradio()
    {
        //retornamos el valor de la variable dia
       return radio; 
    }
    public void setradio(int radio)
    {
        //asignamos el valor del parametro ala variable dia
        this.radio=radio;
    }
}
