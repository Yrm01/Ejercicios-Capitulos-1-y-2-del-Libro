package Libro.cap02.instancias;

public class X {
    private int a;
    private int b;
    
    public X(int a,int b)
    {
    this.a=a;
    this.b=b;
    }
    public String toString()
    {
    return "("+a+","+b+")";
    }
    
    public int getA()
    {
    return a;
    }
    
    public void setA(int A)
    {
      this.a=A;
    }
    public int getB()
    {
    return b;
    }
    public void setB(int B)
    {
    this.b=B;
    }
}
