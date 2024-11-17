/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116;

/**
 *
 * @author darwi
 */
public class televisor extends producto
{
private String pantalla;  
private String sonido;

    public televisor(String pantalla, String sonido, String Color, String marca, String modelo) {
        super(Color, marca, modelo);
        this.pantalla = pantalla;
        this.sonido = sonido;
    }

   

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }


}
