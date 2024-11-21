/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116;

/**
 *
 * @author darwi
 */
public class Carros extends Vehiculos
{
    private String carroceria;
    private Integer motor;
    private Integer timon;

    public Carros(String carroceria, Integer motor, Integer timon, Integer llantas, Integer rines, Integer frenos, Integer asientos) {
        super(llantas, rines, frenos, asientos);
        this.carroceria = carroceria;
        this.motor = motor;
        this.timon = timon;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public Integer getMotor() {
        return motor;
    }

    public void setMotor(Integer motor) {
        this.motor = motor;
    }

    public Integer getTimon() {
        return timon;
    }

    public void setTimon(Integer timon) {
        this.timon = timon;
    }
    
    
}
