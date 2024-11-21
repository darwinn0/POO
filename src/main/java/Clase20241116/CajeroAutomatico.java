/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116;

/**
 *
 * @author darwi
 */
public class CajeroAutomatico 
{
    private Integer NombreCuenta;
    private Integer DNI;
    private Integer saldo;

    public CajeroAutomatico(Integer NombreCuenta, Integer DNI, Integer saldo) {
        this.NombreCuenta = NombreCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public Integer getNombreCuenta() {
        return NombreCuenta;
    }

    public void setNombreCuenta(Integer NombreCuenta) {
        this.NombreCuenta = NombreCuenta;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }
    
    
}
