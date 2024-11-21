/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116;

/**
 *
 * @author darwi
 */
public class CuentaCorriente extends CajeroAutomatico
{
    private String NombreCompleto;
    private Integer edad;

    public CuentaCorriente(String NombreCompleto, Integer edad, Integer NombreCuenta, Integer DNI, Integer saldo) {
        super(NombreCuenta, DNI, saldo);
        this.NombreCompleto = NombreCompleto;
        this.edad = edad;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    
}
