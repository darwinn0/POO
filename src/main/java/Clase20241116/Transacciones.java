/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116;

/**
 *
 * @author darwi
 */
public class Transacciones extends CajeroAutomatico
{
    private Integer monto;
    private String destinatario;

    public Transacciones(Integer monto, String destinatario, Integer NombreCuenta, Integer DNI, Integer saldo) {
        super(NombreCuenta, DNI, saldo);
        this.monto = monto;
        this.destinatario = destinatario;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    
    
}
