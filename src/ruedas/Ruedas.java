/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ruedas;

/**
 * 
 * @author David Massana 00072416
 * @author Ronald Sanchez 00191018
 */

//Esta es la clase padre
public class Ruedas {
    
    protected String nombre;
    protected boolean[][] capacidad;
    protected double precioPersona;
    protected boolean asientoVacio;
    
    //Variables solo para el uso de colores en los metodos de mostrar asiento.
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    
    public Ruedas(String nombre){
        this.nombre = nombre;
    }

    public int llenarAsiento(int numPersonas){
    return numPersonas;
    }

    public boolean[][] getCapacidad(){
        return capacidad;
    }
    
    public double getPrecioPersona(){
        return precioPersona;
    }
}
