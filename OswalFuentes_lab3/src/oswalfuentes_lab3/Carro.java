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
public class Carro {

    protected String Numero_Serie, marca_llantas, polarizado;
    Date fecha_ensamblado;
    private Color color;
    protected int velocidad, kilometros_galon, precio;

    public Carro() {
    }

    public Carro(String Numero_Serie, String marca_llantas, String polarizado, Date fecha_ensamblado, Color color, int velocidad, int kilometros_galon, int precio) {
        this.Numero_Serie = Numero_Serie;
        this.marca_llantas = marca_llantas;
        this.polarizado = polarizado;
        this.fecha_ensamblado = fecha_ensamblado;
        this.color = color;
        this.velocidad = velocidad;
        this.kilometros_galon = kilometros_galon;
        this.precio = precio;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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
        return "Carro{" + "Numero_Serie=" + Numero_Serie + ", marca_llantas=" + marca_llantas + ", polarizado=" + polarizado + ", fecha_ensamblado=" + fecha_ensamblado + ", color=" + color + ", velocidad=" + velocidad + ", kilometros_galon=" + kilometros_galon + ", precio=" + precio + '}';
    }

    
    
}
