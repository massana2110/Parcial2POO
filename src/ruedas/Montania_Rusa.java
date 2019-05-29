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
public class Montania_Rusa extends Ruedas{

    
    public Montania_Rusa(String nombre){
        super(nombre);
        capacidad = new boolean[24][2];
        precioPersona = 5.0;
        asientoVacio = true;
    }
    
    public void mostrarAsientosMontaniaRusa(){
        
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
    
     public void llenarAsientosMontaniaRusa(){
          for (int x = 0; x < capacidad.length; x++) {
            for (int y = 0; y < capacidad[y].length; y++) {
                capacidad[x][y] = asientoVacio;
            }
          }
    }
    
    public void ingresarPersonasMontaniaRusa(int numPersonas){
        switch(super.llenarAsiento(numPersonas)){
            case 1:                int i=0, j=0;
              
                 for (i = 0; i < capacidad.length; i++) {
                   for ( j = 0; j < capacidad[j].length; j++) {
                       if(capacidad[i][j] == asientoVacio){
                           capacidad[i][j] = !asientoVacio;
                          
                       }
                      capacidad[i][j] = !asientoVacio;
                }
                }
              
              break;
        
                
                case 2: 
                for (i = 0; i < capacidad.length; i++) {
                    for (j = 0; j < capacidad[j].length; j++) {
                           if (capacidad[i][j] != asientoVacio) 
                          capacidad[i][j] = asientoVacio;
                          capacidad[i][j] = asientoVacio;
                } 
                }
                break;
                
              }
            }
    
          
}


