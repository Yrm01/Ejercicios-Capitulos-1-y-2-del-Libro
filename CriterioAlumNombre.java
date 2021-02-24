package Libro.cap02.interfaces.criterios;

import Libro.cap02.interfaces.Alumno;
public class CriterioAlumNombre extends Criterio<Alumno>
{
    public int comparar(Alumno a, Alumno b)
    {
        return a.getNombre().compareTo(b.getNombre());
    }
}
