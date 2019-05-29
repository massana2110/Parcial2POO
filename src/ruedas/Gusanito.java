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
    
    public void llenarAsientosGusanitos(){
          for (int x = 0; x < capacidad.length; x++) {
            for (int y = 0; y < capacidad[y].length; y++) {
                capacidad[x][y] = asientoVacio;
            }
          }
    }
    
    public void ingresarPersonas(int numPersonas){
        switch(super.llenarAsiento(numPersonas)){
            case 1:
                for (int x = 0; x < capacidad.length; x++) {
                    for (int y = 0; y < capacidad[y].length; y++) {
                           if (capacidad[x][y] = asientoVacio) {
                           capacidad[x][y] = !asientoVacio;
                } 
                }
                }
                break;
                
                case 2: 
                for (int x = 0; x < capacidad.length; x++) {
                    for (int y = 0; y < capacidad[y].length; y++) {
                           if (capacidad[x][y] = asientoVacio) {
                          capacidad[x][y] = !asientoVacio;
                          capacidad[x+1][y+1] = !asientoVacio;
                } 
                }
                break;
                
              }
            }
          }
    
    
    public void mostrarAsientosGusanito(){
        for (int x = 0; x < capacidad.length; x++) {
            System.out.print("|");
            for (int y = 0; y < capacidad[y].length; y++) {
                System.out.print(capacidad[x][y]);
                if (y != capacidad.length -1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");  
        }
    } 
}
