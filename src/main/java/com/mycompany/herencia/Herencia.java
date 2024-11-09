/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencia;

/**
 *
 * @author darwi
 */
import java.util.ArrayList;
import java.util.List;
public class Herencia {

    public static void main(String[] args) 
    {
        Perro p = new Perro("Color negro","SI","SI","SI",4);
        //p.Sonido();
        
        Gato g = new Gato("Blanco","SI","SI","SI",4);
        //g.Sonido();
        
        List<Animal> lista = new ArrayList<Animal>();
        lista.add(p);
        lista.add(g);
        
        lista.add(new Queco ("NO","SI","SI","SI",4));
        
        for (Animal item : lista)
        {
            item.Sonido();
        }
    }
}
