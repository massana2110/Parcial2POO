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
public class Gusanito extends Ruedas{

    public Gusanito(){
        nombre = "Gusanito";
        capacidad = new boolean[12][2];
        precioPersona = 3.0;
        asientoVacio = true;
    }
    
    public void llenarAsientosGusanito(int numPersonas){
       if(super.llenarAsiento(numPersonas) == 1){
          capacidad[0][0] = false;
         }else if(super.llenarAsiento(numPersonas) == 2){
           capacidad[0][0] = false;
           capacidad[0][1] = false;
       }
    }
    
    public void mostrarAsientosGusanito(){
        for (int x = 0; x < capacidad.length; x++) {
            for (int y = 0; y < capacidad.length; y++) {
                System.out.println(capacidad[x][y]);
            }
            System.out.println("\n");   
        }
    } 
}
