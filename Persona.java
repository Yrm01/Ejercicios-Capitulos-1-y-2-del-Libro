package Libro.cap02.instancias;

import Libro.cap02.fechas.Fecha;
import Libro.cap02.misclases.FechaDetallada;
public class Persona {
    private String Nombre;
    private String Dni;
    private Fecha FechaNacimiento;
    
    private int cont=0;
    public Persona(String nombre,String dni,Fecha fecNac)
    {
    this.Nombre=nombre;
    this.Dni=dni;
    this.FechaNacimiento=fecNac;
    }
    public String toString()
    {
        cont++;
        return Nombre + ", DNI: " + Dni+ ", nacido el: " + FechaNacimiento+ " (" + cont + ")";
    }
    public String getNombre()
    {
    return Nombre;
    }
    
    public void setNombre(String nombre)
    {
      this.Nombre=nombre;
    }
    public String getDni()
    {
    return Dni;
    }
    
    public void setDni(String Dni)
    {
      this.Dni=Dni;
    }
    public Fecha getFechaNac()
    {
    return FechaNacimiento;
    }
    
    public void setA(Fecha FecNac)
    {
      this.FechaNacimiento=FecNac;
    }
}
