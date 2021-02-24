package Libro.cap02.figuras;

public abstract class FiguraGeometrica {
    
    private String nombre;
    //metodo abstracto
    public abstract double area();
    
    public static double areaPromedio(FiguraGeometrica arr[])
    {
    int suma=0;
        for (int i = 0; i < arr.length; i++) {
            suma+=arr[i].area();
        }
        return suma/arr.length;
    }
    public FiguraGeometrica(String nom)
    {
    nombre = nom;
    }
    // ahora en el toString muestro tambien el nombre
    public String toString()
    {
    return nombre +" (area = "+ area()+") ";
    }
    public String getNombre()
    {
    return nombre;
    }
    public void setNombre(String nombre)
    {
    this.nombre=nombre;
    }
}
