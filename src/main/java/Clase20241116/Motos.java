/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116;

/**
 *
 * @author darwi
 */
public class Motos extends Vehiculos
{
    private Integer motor;

    public Motos(Integer motor, Integer llantas, Integer rines, Integer frenos, Integer asientos) {
        super(llantas, rines, frenos, asientos);
        this.motor = motor;
    }

    public Integer getMotor() {
        return motor;
    }

    public void setMotor(Integer motor) {
        this.motor = motor;
    }
    
    
}
