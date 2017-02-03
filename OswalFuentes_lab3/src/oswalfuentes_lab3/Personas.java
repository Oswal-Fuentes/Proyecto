/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oswalfuentes_lab3;

/**
 *
 * @author Oswal
 */
public class Personas {

    protected String nombre, ID;
    protected int peso, edad, altura;

    public Personas() {
    }

    public Personas(String nombre, String ID, int edad, int altura, int peso) {
        this.nombre = nombre;
        this.ID = ID;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", ID=" + ID + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + '}';
    }

}
