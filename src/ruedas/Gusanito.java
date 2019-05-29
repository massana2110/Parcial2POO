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

    public Gusanito(String nombre){
        super(nombre);
        capacidad = new boolean[12][2];
        precioPersona = 3.0;
        asientoVacio = true;
    }
    
    public void llenarAsientosGusanitos(){
          for (int x = 0; x < capacidad.length; x++) {
            for (int y = 0; y < capacidad[y].length; y++) {
                capacidad[x][y] = !asientoVacio;
            }
          }
    }
    
    public void ingresarPersonas(int numPersonas){
        switch(super.llenarAsiento(numPersonas)){
            case 1:
              
              break;
        
        
                case 2: 
                for (i = 0; i < capacidad.length; i++) {
                    for (j = 0; j < capacidad[j].length; j++) {
                           if (capacidad[i][j] = asientoVacio) {
                               int a = i, b = j;
                          capacidad[i][j] = !asientoVacio;
                          capacidad[i][j] = !asientoVacio;
                } 
                }
                break;
                
              }
            }
    }
          
    
    
    public void mostrarAsientosGusanito(){
        for (int i = 0; i < capacidad.length; i++) {
            System.out.print("|");
            for (int j = 0; j < capacidad[j].length; j++) {
                System.out.print(capacidad[i][j]);
                if (j != capacidad.length -1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");  
        }
    } 
}
