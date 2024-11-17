/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116;

/**
 *
 * @author darwi
 */
public class parlante extends producto
{
    private String sonido;
    private String rendimiento;

    public parlante(String sonido, String rendimiento, String Color, String marca, String modelo) {
        super(Color, marca, modelo);
        this.sonido = sonido;
        this.rendimiento = rendimiento;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(String rendimiento) {
        this.rendimiento = rendimiento;
    }
    
}
