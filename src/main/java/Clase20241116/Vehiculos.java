/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116;

/**
 *
 * @author darwi
 */
public class Vehiculos 
{
    private Integer llantas;
    private Integer rines;
    private Integer frenos;
    private Integer asientos;

    public Vehiculos(Integer llantas, Integer rines, Integer frenos, Integer asientos) {
        this.llantas = llantas;
        this.rines = rines;
        this.frenos = frenos;
        this.asientos = asientos;
    }

    public Integer getLlantas() {
        return llantas;
    }

    public void setLlantas(Integer llantas) {
        this.llantas = llantas;
    }

    public Integer getRines() {
        return rines;
    }

    public void setRines(Integer rines) {
        this.rines = rines;
    }

    public Integer getFrenos() {
        return frenos;
    }

    public void setFrenos(Integer frenos) {
        this.frenos = frenos;
    }

    public Integer getAsientos() {
        return asientos;
    }

    public void setAsientos(Integer asientos) {
        this.asientos = asientos;
    }
    
    
}
