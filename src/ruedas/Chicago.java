/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ruedas;

import exceptions.AtraccionLlenaException;
import exceptions.ParejaNoJuntaException;

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
        asientoVacio = false;
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
    
     public void llenarAsientosChicago(){
          for (int x = 0; x < capacidad.length; x++) {
            for (int y = 0; y < capacidad[y].length; y++) {
                capacidad[x][y] = asientoVacio;
            }
          }
    }
    
      public void ingresarPersonasChicago(int numPersonas) throws AtraccionLlenaException, ParejaNoJuntaException{
        switch(super.llenarAsiento(numPersonas)){
            case 1:
                
               for (int x = 0; x < capacidad.length; x++) {
             for (int y = 0; y <= capacidad[x].length-1; y++) {
                           if (capacidad[x][y] == asientoVacio) {
                                capacidad[x][y] = !asientoVacio;
                                return;
                           
                            } if(capacidad[11][1] == !asientoVacio) {
                              throw new AtraccionLlenaException("¡ATRACCION LLENA, LO SENTIMOS'");
                      }
                    }
                    
                }
              
              break;
        
            case 2: 
                
                 for (int y = 0; y <= capacidad[y].length; y++) {
             for (int x = 0; x < capacidad.length; x++) {
                           if (capacidad[x][y] == asientoVacio) {
                                capacidad[x][y] =! asientoVacio;
                                capacidad[x][y+1] =! asientoVacio;                                              
                                return;
                            }if(capacidad[x][y+1] == asientoVacio && capacidad[x][y] == !asientoVacio){
                                capacidad[x][y+1] = !asientoVacio;
                                capacidad[x+1][y] = !asientoVacio;
                                return;
                            }if(capacidad[x+1][y] == asientoVacio){
                                capacidad[x+1][y] = !asientoVacio;
                                capacidad[x+1][y+1] = !asientoVacio;
                                return;
                            }if(capacidad[11][1] == !asientoVacio) {
                              throw new AtraccionLlenaException("¡ATRACCION LLENA, LO SENTIMOS'");
                      }
                         
                    }
                 
                }
                 
              
              break;
                
              }
            }
    
          
}
