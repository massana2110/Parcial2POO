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
public class Gusanito extends Ruedas{

    public Gusanito(String nombre){
        super(nombre);
        capacidad = new boolean[12][2];
        
        precioPersona = 3.0;
        asientoVacio = false;
    }
    
    public void llenarAsientosGusanitos(){
          for (int x = 0; x < capacidad.length; x++) {
            for (int y = 0; y < capacidad[y].length; y++) {
                capacidad[x][y] = asientoVacio;
            }
          }
    }
    
    public void ingresarPersonasGusanito(int numPersonas) throws AtraccionLlenaException, ParejaNoJuntaException{
        switch(super.llenarAsiento(numPersonas)){
            case 1:
                
               for (int x = 0; x < capacidad.length; x++) {
             for (int y = 0; y <= capacidad[x].length-1; y++) {
                           if (capacidad[x][y] == asientoVacio) {
                                capacidad[x][y] = !asientoVacio;
                                System.out.println(ANSI_GREEN + "¡PERSONA INGRESADA CORRECTAMENTE!" + ANSI_RESET);
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
                                System.out.println(ANSI_GREEN + "¡PERSONA INGRESADA CORRECTAMENTE!" + ANSI_RESET);
                                return;
                            }
                           if(capacidad[x][y] == !asientoVacio && capacidad[x][y+1] == asientoVacio){
                               throw new ParejaNoJuntaException("NO PUEDEN SENTARSE JUNTOS :(");
                           }
                            if(capacidad[x][y+1] == asientoVacio && capacidad[x][y] == !asientoVacio){
                                capacidad[x][y+1] = !asientoVacio;
                                capacidad[x+1][y] = !asientoVacio;
                                System.out.println(ANSI_GREEN + "¡PERSONA INGRESADA CORRECTAMENTE!" + ANSI_RESET);
                                return;
                            }if(capacidad[x+1][y] == asientoVacio){
                                capacidad[x+1][y] = !asientoVacio;
                                capacidad[x+1][y+1] = !asientoVacio;
                                System.out.println(ANSI_GREEN + "¡PERSONA INGRESADA CORRECTAMENTE!" + ANSI_RESET);
                                return;
                            }if(capacidad[11][1] == !asientoVacio) {
                              throw new AtraccionLlenaException("¡ATRACCION LLENA, LO SENTIMOS'");
                      }
                         
                    }
                 
                }
                break;
            default:
                System.out.println(ANSI_RED + "NO PERMITIMOS INGRESAR MAS DE 2 PERSONAS..." + ANSI_RESET);
                break;
              }
    }
    
    public void mostrarAsientosGusanito(){
        
    for (int i = 0; i < capacidad.length; i++) {
            System.out.print("|");
            for (int j = 0; j < capacidad[i].length; j++) {
                if (capacidad[i][j] != true) {
                    System.out.print(ANSI_GREEN + capacidad[i][j] + ANSI_RESET);
                }
                else{
                    System.out.print(ANSI_RED + capacidad[i][j] + ANSI_RESET);
                }
                if (j != capacidad.length -1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    } 
}
