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
    
public Ruedas(){

}

public int llenarAsiento(int numPersonas){
    return numPersonas;
}

}
