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
public class Fisker_Automotive extends Carro {

    private String tipo, convertible;

    public Fisker_Automotive() {
        super();
    }

    public Fisker_Automotive(String tipo, String convertible, String Numero_Serie, String marca_llantas, String polarizado, Date fecha_ensamblado, Color color, int velocidad, int kilometros_galon, int precio) {
        super(Numero_Serie, marca_llantas, polarizado, fecha_ensamblado, color, velocidad, kilometros_galon, precio);
        this.tipo = tipo;
        this.convertible = convertible;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getConvertible() {
        return convertible;
    }

    public void setConvertible(String convertible) {
        this.convertible = convertible;
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
        return "Fisker_Automotive{" + "tipo=" + tipo + ", convertible=" + convertible + '}';
    }
}
