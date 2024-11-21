/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116;

/**
 *
 * @author darwi
 */
public class Bicicleta extends Vehiculos
{
    private Integer pedales;

    public Bicicleta(Integer pedales, Integer llantas, Integer rines, Integer frenos, Integer asientos) {
        super(llantas, rines, frenos, asientos);
        this.pedales = pedales;
    }

    public Integer getPedales() {
        return pedales;
    }

    public void setPedales(Integer pedales) {
        this.pedales = pedales;
    }
    
    
}
