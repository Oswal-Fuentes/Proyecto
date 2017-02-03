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
public class Empleados extends Personas {

    private int numeros_horas;
    Clientes cliente;

    public Empleados() {
        super();
    }

    public Empleados(int numeros_horas, Clientes cliente, String nombre, String ID, int edad, int altura, int peso) {
        super(nombre, ID, edad, altura, peso);
        this.numeros_horas = numeros_horas;
        this.cliente = cliente;
    }

    public int getNumeros_horas() {
        return numeros_horas;
    }

    public void setNumeros_horas(int numeros_horas) {
        this.numeros_horas = numeros_horas;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleados{" + "numeros_horas=" + numeros_horas + ", cliente=" + cliente + '}';
    }
}
