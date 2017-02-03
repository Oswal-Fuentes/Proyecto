/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oswalfuentes_lab3;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Oswal
 */
public class OswalFuentes_lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList();
        ArrayList<Personas> personas = new ArrayList();
        int menu = 1;
        while (menu != 6) {
            menu = Integer.parseInt(JOptionPane.showInputDialog("MENU \n"
                    + "1) Agregar \n"
                    + "2) Modificar \n"
                    + "3) Eliminar \n"
                    + "4) Reporte Carros \n"
                    + "5) Reporte Personas \n"
                    + "6) Salir"));
            switch (menu) {
                case 1:
                    int menu2;
                    menu2 = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea agregar? \n"
                            + "1) Carros \n"
                            + "2) Empleado \n"
                            + "3) Cliente \n"));
                    switch (menu2) {
                        case 1:
                            int menu3;
                            menu3 = Integer.parseInt(JOptionPane.showInputDialog("¿Que tipo de carro? \n"
                                    + "1) Maybach \n"
                                    + "2) Morgan Aero 8 \n"
                                    + "3) Fisker Automotive \n"
                                    + "4) Tranmontana \n"));
                            switch (menu3) {
                                case 1:
                                    String Numero_Serie,
                                     marca_llantas,
                                     polarizado;
                                    Date fecha_ensamblado = new Date();
                                    Color color = new Color(Color.BITMASK);
                                    int llantas_repuestos,
                                     velocidad,
                                     kilometros_galon,
                                     precio;
                                    Numero_Serie = JOptionPane.showInputDialog("Numero de serie [String]");
                                    marca_llantas = JOptionPane.showInputDialog("Marca de las llantas [String]");
                                    polarizado = JOptionPane.showInputDialog("Polarizado [String]");
                                    velocidad = Integer.parseInt(JOptionPane.showInputDialog("Velocidad [Int]"));
                                    kilometros_galon = Integer.parseInt(JOptionPane.showInputDialog("Kilometros/Galon [Int]"));
                                    precio = Integer.parseInt(JOptionPane.showInputDialog("Precio [Int]"));
                                    llantas_repuestos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de llantas de respuestos [Int]"));
                                    carros.add(new Maybach(llantas_repuestos, Numero_Serie, marca_llantas, polarizado, fecha_ensamblado, color, velocidad, kilometros_galon, precio));
                                    break;
                                case 2:
                                    String convertible,
                                     cabina,
                                     Numero_Serie2,
                                     marca_llantas2,
                                     polarizado2;
                                    Date fecha_ensamblado2 = new Date();
                                    Color color2 = new Color(Color.BITMASK);
                                    int velocidad2,
                                     kilometros_galon2,
                                     precio2;
                                    Numero_Serie2 = JOptionPane.showInputDialog("Numero de serie [String]");
                                    marca_llantas2 = JOptionPane.showInputDialog("Marca de las llantas [String]");
                                    polarizado2 = JOptionPane.showInputDialog("Polarizado [String]");
                                    velocidad2 = Integer.parseInt(JOptionPane.showInputDialog("Velocidad [Int]"));
                                    kilometros_galon2 = Integer.parseInt(JOptionPane.showInputDialog("Kilometros/Galon [Int]"));
                                    precio2 = Integer.parseInt(JOptionPane.showInputDialog("Precio [Int]"));
                                    convertible = JOptionPane.showInputDialog("Convertible [String]");
                                    cabina = JOptionPane.showInputDialog("Cabina [String]");
                                    carros.add(new MorganAero8(convertible, cabina, Numero_Serie2, marca_llantas2, polarizado2, fecha_ensamblado2, color2, velocidad2, kilometros_galon2, precio2));
                                    break;
                                case 3:
                                    String tipo,
                                     convertible3,
                                     Numero_Serie3,
                                     marca_llantas3,
                                     polarizado3;
                                    Date fecha_ensamblado3 = new Date();
                                    Color color3 = new Color(Color.BITMASK);
                                    int velocidad3,
                                     kilometros_galon3,
                                     precio3;
                                    Numero_Serie3 = JOptionPane.showInputDialog("Numero de serie [String]");
                                    marca_llantas3 = JOptionPane.showInputDialog("Marca de las llantas [String]");
                                    polarizado3 = JOptionPane.showInputDialog("Polarizado [String]");
                                    velocidad3 = Integer.parseInt(JOptionPane.showInputDialog("Velocidad [Int]"));
                                    kilometros_galon3 = Integer.parseInt(JOptionPane.showInputDialog("Kilometros/Galon [Int]"));
                                    precio3 = Integer.parseInt(JOptionPane.showInputDialog("Precio [Int]"));
                                    tipo = JOptionPane.showInputDialog("Tipo [String]");
                                    convertible3 = JOptionPane.showInputDialog("Convertible [String]");
                                    carros.add(new Fisker_Automotive(tipo, convertible3, Numero_Serie3, marca_llantas3, polarizado3, fecha_ensamblado3, color3, velocidad3, kilometros_galon3, precio3));
                                    break;
                                case 4:
                                    String transmision,
                                     Numero_Serie4,
                                     marca_llantas4,
                                     polarizado4;
                                    Date fecha_ensamblado4 = new Date();
                                    Color color4 = new Color(Color.BITMASK);
                                    int peso,
                                     velocidad4,
                                     kilometros_galon4,
                                     precio4;
                                    Numero_Serie4 = JOptionPane.showInputDialog("Numero de serie [String");
                                    marca_llantas4 = JOptionPane.showInputDialog("Marca de las llantas [String]");
                                    polarizado4 = JOptionPane.showInputDialog("Polarizado [String]");
                                    velocidad4 = Integer.parseInt(JOptionPane.showInputDialog("Velocidad [Int]"));
                                    kilometros_galon4 = Integer.parseInt(JOptionPane.showInputDialog("Kilometos/Galon [Int]"));
                                    precio4 = Integer.parseInt(JOptionPane.showInputDialog("Precio [Int]"));
                                    peso = Integer.parseInt(JOptionPane.showInputDialog("Peso [Int]"));
                                    transmision = JOptionPane.showInputDialog("Transmision [String]");
                                    carros.add(new Tramontana(peso, transmision, Numero_Serie4, marca_llantas4, polarizado4, fecha_ensamblado4, color4, velocidad4, kilometros_galon4, precio4));
                                    break;
                            }
                            break;
                        case 2:
                            String nombre,
                             ID;
                            int numeros_horas,
                             edad,
                             altura,
                             peso;
                            Clientes cliente = null;
                            nombre = JOptionPane.showInputDialog("Nombre [String]");
                            ID = JOptionPane.showInputDialog("Identificacion [String[");
                            edad = Integer.parseInt(JOptionPane.showInputDialog("Edad [Int]"));
                            altura = Integer.parseInt(JOptionPane.showInputDialog("Altura[Int] "));
                            peso = Integer.parseInt(JOptionPane.showInputDialog("Peso [Int]"));
                            numeros_horas = Integer.parseInt(JOptionPane.showInputDialog("Numero de horas trabajadas [Int]"));
                            personas.add(new Empleados(numeros_horas, cliente, nombre, ID, edad, altura, peso));
                            break;
                        case 3:
                            String nombre2,
                             ID2;
                            int dinero,
                             edad2,
                             altura2,
                             peso2;
                            nombre2 = JOptionPane.showInputDialog("Nombre [String]");
                            ID2 = JOptionPane.showInputDialog("Identificacion [String]");
                            edad2 = Integer.parseInt(JOptionPane.showInputDialog("Edad [Int]"));
                            altura2 = Integer.parseInt(JOptionPane.showInputDialog("Altura [Int]"));
                            peso2 = Integer.parseInt(JOptionPane.showInputDialog("Peso [Int]"));
                            dinero = Integer.parseInt(JOptionPane.showInputDialog("Dinero que posee el cliente [Int]"));
                            personas.add(new Clientes(dinero, nombre2, ID2, edad2, altura2, peso2));
                            break;
                    }
                    break;
                case 2://MODIFICAR
                    int menu1;
                    menu1 = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea modificar? \n"
                            + "1) Carros \n"
                            + "2) Empleado \n"
                            + "3) Cliente \n"));
                    switch (menu1) {
                        case 1:
                            String p = "";
                            for (int x = 0; x < carros.size(); x++) {
                                p += x + ") " + carros.get(x).toString();
                            }
                            JOptionPane.showMessageDialog(null, p);
                            int menu3;
                            menu3 = Integer.parseInt(JOptionPane.showInputDialog("¿Que tipo de carro? \n"
                                    + "1) Maybach \n"
                                    + "2) Morgan Aero 8 \n"
                                    + "3) Fisker Automotive \n"
                                    + "4) Tranmontana"));
                            switch (menu3) {
                                case 1:
                                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del carro"));
                                    if (carros.get(pos) instanceof Maybach) {
                                        JOptionPane.showMessageDialog(null, "Ingrese los datos del carro que desea modificar");
                                        String Numero_Serie,
                                                marca_llantas,
                                                polarizado;
                                        Date fecha_ensamblado = new Date();
                                        Color color = new Color(Color.BITMASK);
                                        int llantas_repuestos,
                                                velocidad,
                                                kilometros_galon,
                                                precio;
                                        Numero_Serie = JOptionPane.showInputDialog("Numero de serie");
                                        marca_llantas = JOptionPane.showInputDialog("Marca de las llantas");
                                        polarizado = JOptionPane.showInputDialog("Polarizado");
                                        velocidad = Integer.parseInt(JOptionPane.showInputDialog("Velocidad"));
                                        kilometros_galon = Integer.parseInt(JOptionPane.showInputDialog("Kilometros/Galon"));
                                        precio = Integer.parseInt(JOptionPane.showInputDialog("Precio"));
                                        llantas_repuestos = Integer.parseInt(JOptionPane.showInputDialog("Llantas de respuestos"));
                                        carros.get(pos).setNumero_Serie(Numero_Serie);
                                        carros.get(pos).setMarca_llantas(marca_llantas);
                                        carros.get(pos).setPolarizado(polarizado);
                                        carros.get(pos).setVelocidad(velocidad);
                                        carros.get(pos).setKilometros_galon(kilometros_galon);
                                        carros.get(pos).setPrecio(precio);
                                        ((Maybach) carros.get(pos)).setLlantas_repuestos(llantas_repuestos);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No existe ese tipo de carro en esa posicion");
                                    }
                                    break;
                                case 2:
                                    int pos2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del carro"));
                                    if (carros.get(pos2) instanceof MorganAero8) {
                                        JOptionPane.showMessageDialog(null, "Ingrese los datos del carro que desea modificar");
                                        String convertible,
                                                cabina,
                                                Numero_Serie2,
                                                marca_llantas2,
                                                polarizado2;
                                        Date fecha_ensamblado2 = new Date();
                                        Color color2 = new Color(Color.BITMASK);
                                        int velocidad2,
                                                kilometros_galon2,
                                                precio2;
                                        Numero_Serie2 = JOptionPane.showInputDialog("Numero de serie");
                                        marca_llantas2 = JOptionPane.showInputDialog("Marca de las llantas");
                                        polarizado2 = JOptionPane.showInputDialog("Polarizado");
                                        velocidad2 = Integer.parseInt(JOptionPane.showInputDialog("Velocidad"));
                                        kilometros_galon2 = Integer.parseInt(JOptionPane.showInputDialog("Kilometros/Galon"));
                                        precio2 = Integer.parseInt(JOptionPane.showInputDialog("Precio"));
                                        convertible = JOptionPane.showInputDialog("Convertible");
                                        cabina = JOptionPane.showInputDialog("Cabina");
                                        carros.get(pos2).setNumero_Serie(Numero_Serie2);
                                        carros.get(pos2).setMarca_llantas(marca_llantas2);
                                        carros.get(pos2).setPolarizado(polarizado2);
                                        carros.get(pos2).setVelocidad(velocidad2);
                                        carros.get(pos2).setKilometros_galon(kilometros_galon2);
                                        carros.get(pos2).setPrecio(precio2);
                                        ((MorganAero8) carros.get(pos2)).setConvertible(convertible);
                                        ((MorganAero8) carros.get(pos2)).setCabina(cabina);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No existe ese tipo de carro en esa posicion");
                                    }
                                    break;
                                case 3:
                                    int pos3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del carro"));
                                    if (carros.get(pos3) instanceof Fisker_Automotive) {
                                        JOptionPane.showMessageDialog(null, "Ingrese los datos del carro que desea modificar");
                                        String tipo,
                                                convertible3,
                                                Numero_Serie3,
                                                marca_llantas3,
                                                polarizado3;
                                        Date fecha_ensamblado3 = new Date();
                                        Color color3 = new Color(Color.BITMASK);
                                        int velocidad3,
                                                kilometros_galon3,
                                                precio3;
                                        Numero_Serie3 = JOptionPane.showInputDialog("Numero de serie");
                                        marca_llantas3 = JOptionPane.showInputDialog("Marca de las llantas");
                                        polarizado3 = JOptionPane.showInputDialog("Polarizado");
                                        velocidad3 = Integer.parseInt(JOptionPane.showInputDialog("Velocidad"));
                                        kilometros_galon3 = Integer.parseInt(JOptionPane.showInputDialog("Kilometros/Galon"));
                                        precio3 = Integer.parseInt(JOptionPane.showInputDialog("Precio"));
                                        tipo = JOptionPane.showInputDialog("Tipo");
                                        convertible3 = JOptionPane.showInputDialog("Convertible");
                                        carros.get(pos3).setNumero_Serie(Numero_Serie3);
                                        carros.get(pos3).setMarca_llantas(marca_llantas3);
                                        carros.get(pos3).setPolarizado(polarizado3);
                                        carros.get(pos3).setVelocidad(velocidad3);
                                        carros.get(pos3).setKilometros_galon(kilometros_galon3);
                                        carros.get(pos3).setPrecio(precio3);
                                        ((Fisker_Automotive) carros.get(pos3)).setTipo(tipo);
                                        ((Fisker_Automotive) carros.get(pos3)).setConvertible(convertible3);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No existe ese tipo de carro en esa posicion");
                                    }
                                    break;
                                case 4:
                                    int pos4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del carro"));
                                    if (carros.get(pos4) instanceof Tramontana) {
                                        JOptionPane.showMessageDialog(null, "Ingrese los datos del carro que desea modificar");
                                        String Numero_Serie4, transmision,
                                                marca_llantas4,
                                                polarizado4;
                                        Date fecha_ensamblado4 = new Date();
                                        Color color4 = new Color(Color.BITMASK);
                                        int peso,
                                                velocidad4,
                                                kilometros_galon4,
                                                precio4;
                                        Numero_Serie4 = JOptionPane.showInputDialog("Numero de serie");
                                        marca_llantas4 = JOptionPane.showInputDialog("Marca de las llantas");
                                        polarizado4 = JOptionPane.showInputDialog("Polarizado");
                                        velocidad4 = Integer.parseInt(JOptionPane.showInputDialog("Velocidad"));
                                        kilometros_galon4 = Integer.parseInt(JOptionPane.showInputDialog("Kilometos/Galon"));
                                        precio4 = Integer.parseInt(JOptionPane.showInputDialog("Precio"));
                                        peso = Integer.parseInt(JOptionPane.showInputDialog("Peso"));
                                        transmision = JOptionPane.showInputDialog("Transmision");
                                        carros.get(pos4).setNumero_Serie(Numero_Serie4);
                                        carros.get(pos4).setMarca_llantas(marca_llantas4);
                                        carros.get(pos4).setPolarizado(polarizado4);
                                        carros.get(pos4).setVelocidad(velocidad4);
                                        carros.get(pos4).setKilometros_galon(kilometros_galon4);
                                        carros.get(pos4).setPrecio(precio4);
                                        ((Tramontana) carros.get(pos4)).setPeso(peso);
                                        ((Tramontana) carros.get(pos4)).setTransmision(transmision);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No existe ese tipo de carro en esa posicion");
                                    }
                                    break;
                            }
                            break;
                        case 2://Empleados
                            int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del empleado"));
                            if (personas.get(posicion) instanceof Empleados) {
                                JOptionPane.showMessageDialog(null, "Ingrese los datos del empleado que desea modificar");
                                String nombre,
                                        ID;
                                int numeros_horas, edad, altura, peso;
                                Clientes cliente = null;
                                nombre = JOptionPane.showInputDialog("Nombre");
                                ID = JOptionPane.showInputDialog("Identificacion");
                                edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
                                altura = Integer.parseInt(JOptionPane.showInputDialog("Altura"));
                                peso = Integer.parseInt(JOptionPane.showInputDialog("Peso"));
                                numeros_horas = Integer.parseInt(JOptionPane.showInputDialog("Numero de horas trabajadas"));
                                personas.get(posicion).setNombre(nombre);
                                personas.get(posicion).setID(ID);
                                personas.get(posicion).setEdad(edad);
                                personas.get(posicion).setAltura(altura);
                                personas.get(posicion).setPeso(peso);
                                ((Empleados) personas.get(posicion)).setNumeros_horas(numeros_horas);
                            } else {
                                JOptionPane.showMessageDialog(null, "No existe un empleado en esa posicion");
                            }
                            break;
                        case 3://Clientes
                            int posicion2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del empleado"));
                            if (personas.get(posicion2) instanceof Clientes) {
                                JOptionPane.showMessageDialog(null, "Ingrese los datos del cliente que desea modificar");
                                String nombre2,
                                        ID2;
                                int dinero, edad2, altura2, peso2;
                                nombre2 = JOptionPane.showInputDialog("Nombre");
                                ID2 = JOptionPane.showInputDialog("Identificacion");
                                edad2 = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
                                altura2 = Integer.parseInt(JOptionPane.showInputDialog("Altura"));
                                peso2 = Integer.parseInt(JOptionPane.showInputDialog("Peso"));
                                dinero = Integer.parseInt(JOptionPane.showInputDialog("Dinero que posee el cliente"));
                                personas.get(posicion2).setNombre(nombre2);
                                personas.get(posicion2).setID(ID2);
                                personas.get(posicion2).setEdad(edad2);
                                personas.get(posicion2).setAltura(altura2);
                                personas.get(posicion2).setPeso(peso2);
                                ((Clientes) personas.get(posicion2)).setDinero(dinero);
                            } else {
                                JOptionPane.showMessageDialog(null, "No existe un cliente en esa posicion");
                            }
                            break;
                    }
                case 3://ELIMINAR
                    int menu5;
                    menu5 = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea eliminar?"
                            + "1) Carros \n"
                            + "2) Empleado \n"
                            + "3) Cliente \n"));
                    switch (menu5) {
                        case 1:
                            int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del carro que desea eliminar"));
                            carros.remove(pos);
                            break;
                        case 2:
                            int pos2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del empleado que desea eliminar"));
                            personas.remove(pos2);
                            break;
                        case 3:
                            int pos3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del cliente que desea eliminar"));
                            personas.remove(pos3);
                            break;
                    }
                    break;
                case 4:
                    String p = "";
                    for (int x = 0; x < carros.size(); x++) {
                        p += x + ") " + carros.get(x).toString();
                    }
                    JOptionPane.showMessageDialog(null, p);
                    break;
                case 5:
                    String p2 = "";
                    for (int x = 0; x < personas.size(); x++) {
                        p2 += x + ") " + personas.get(x).toString();
                    }
                    JOptionPane.showMessageDialog(null, p2);
                    break;
                case 6:
                    menu = 6;
                    break;
            }
        }
    }
}
