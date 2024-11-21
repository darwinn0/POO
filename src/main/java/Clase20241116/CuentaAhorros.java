/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116;

/**
 *
 * @author darwi
 */
public class CuentaAhorros extends CajeroAutomatico 
{
    private Integer TasaInteres;
    private Integer Cuenta;

    public CuentaAhorros(Integer TasaInteres, Integer Cuenta, Integer NombreCuenta, Integer DNI, Integer saldo) {
        super(NombreCuenta, DNI, saldo);
        this.TasaInteres = TasaInteres;
        this.Cuenta = Cuenta;
    }

    public Integer getTasaInteres() {
        return TasaInteres;
    }

    public void setTasaInteres(Integer TasaInteres) {
        this.TasaInteres = TasaInteres;
    }

    public Integer getCuenta() {
        return Cuenta;
    }

    public void setCuenta(Integer Cuenta) {
        this.Cuenta = Cuenta;
    }
    
    
}
