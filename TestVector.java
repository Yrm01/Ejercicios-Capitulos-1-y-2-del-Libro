package Libro.cap02.colecciones;

import java.util.Collection;
public class TestVector {
    public static void main(String[] args)
    {
        // el metodo obtenerLista retorna una Collection
        Collection<String> coll = UNombres.obtenerLista();
        // itero la coleccion de nombres y muestro cada elemento
        for(String nom: coll)
        {
            System.out.println(nom);
        }
    }
}
