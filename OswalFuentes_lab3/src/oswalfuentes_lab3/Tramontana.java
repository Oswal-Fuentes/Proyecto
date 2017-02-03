/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oswalfuentes_lab3;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Oswal
 */
public class Tramontana extends Carro {

    private int peso;
    String transmision;

    public Tramontana() {
        super();
    }

    public Tramontana(int peso, String transmision, String Numero_Serie, String marca_llantas, String polarizado, Date fecha_ensamblado, Color color, int velocidad, int kilometros_galon, int precio) {
        super(Numero_Serie, marca_llantas, polarizado, fecha_ensamblado, color, velocidad, kilometros_galon, precio);
        this.peso = peso;
        this.transmision = transmision;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getNumero_Serie() {
        return Numero_Serie;
    }

    public void setNumero_Serie(String Numero_Serie) {
        this.Numero_Serie = Numero_Serie;
    }

    public String getMarca_llantas() {
        return marca_llantas;
    }

    public void setMarca_llantas(String marca_llantas) {
        this.marca_llantas = marca_llantas;
    }

    public String getPolarizado() {
        return polarizado;
    }

    public void setPolarizado(String polarizado) {
        this.polarizado = polarizado;
    }

    public Date getFecha_ensamblado() {
        return fecha_ensamblado;
    }

    public void setFecha_ensamblado(Date fecha_ensamblado) {
        this.fecha_ensamblado = fecha_ensamblado;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getKilometros_galon() {
        return kilometros_galon;
    }

    public void setKilometros_galon(int kilometros_galon) {
        this.kilometros_galon = kilometros_galon;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tramontana{" + "peso=" + peso + ", transmision=" + transmision + '}';
    }

}
