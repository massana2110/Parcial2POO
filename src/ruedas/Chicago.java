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
public class Chicago extends Ruedas{

    public Chicago(String nombre){
        super(nombre);
        capacidad = new boolean[24][2];
        precioPersona = 3.0;
        asientoVacio = true;
    }
    
    public void mostrarAsientosChicago(){
        for (int x = 0; x < capacidad.length; x++) {
            System.out.print("|");
            for (int y = 0; y < capacidad[y].length; y++) {
                if (capacidad[x][y] != true) {
                    System.out.print(ANSI_GREEN + capacidad[x][y] + ANSI_RESET);
                }
                else{
                    System.out.print(ANSI_RED + capacidad[x][y] + ANSI_RESET);
                }
                if (y != capacidad.length -1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");  
        }
    }
}
