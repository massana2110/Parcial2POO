/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import exceptions.AtraccionLlenaException;
import exceptions.ParejaNoJuntaException;
import java.util.InputMismatchException;
import ruedas.*;
import java.util.Scanner;

/**
 * 
 * @author David Massana 00072416
 * @author Ronald Sanchez 00191018
 */

public class MainClass {
    
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    
    
    public static void main(String[] args) {
        Gusanito g = new Gusanito("Gusanito");
        Montania_Rusa mr = new Montania_Rusa("Montania Rusa");
        Chicago cg = new Chicago("Chicago");
        
        Scanner in = new Scanner(System.in);
        int opcion;
        boolean flag = true;
        
        System.out.println("¡¡¡BIENVENIDO A NUESTRO PARQUE DE DIVERSIONES!!!");
        
        while(flag){
            try{
                mainMenu();
                opcion = in.nextInt();
                switch(opcion){
                    case 1:
                        try{
                            menuRuedas();
                            int opcionRueda = in.nextInt(); in.nextLine();
                            switch(opcionRueda){
                                case 1 : 
                                    System.out.println("¿CUANTAS PERSONAS DESEAN SUBIR? (1/2)");
                                    int opcionPersonas = in.nextInt(); in.nextLine();
                                    g.ingresarPersonasGusanito(opcionPersonas);
                                    break;
                        
                                case 2 :
                                    System.out.println("¿CUANTAS PERSONAS DESEAN SUBIR? (1/2)");
                                    int opcionPersonas2 = in.nextInt(); in.nextLine();        
                                    cg.ingresarPersonasChicago(opcionPersonas2);
                                    break;
                        
                                case 3:
                        
                                    System.out.println("¿CUANTAS PERSONAS DESEAN SUBIR? (1/2)");
                                    int opcionPersonas3 = in.nextInt(); in.nextLine();        
                                    mr.ingresarPersonasMontaniaRusa(opcionPersonas3);
                            }
                        }catch(AtraccionLlenaException e){
                            System.out.println(e.toString());
                        } catch(ParejaNoJuntaException a){
                            System.out.println(a.toString());
                        }
                    break;
                        
                    case 2:
                        menuRuedas();
                        opcion = in.nextInt();
                        switch(opcion){
                            case 1:
                                System.out.println("\nDISPOSICION DE ASIENTOS DE RUEDA DE GUSANITO\n");
                                System.out.println("\n" + ANSI_GREEN_BACKGROUND + "   " + ANSI_RESET + " = DISPONIBLES.");
                                System.out.println("\n" + ANSI_RED_BACKGROUND + "   " + ANSI_RESET + " = OCUPADOS\n");
                                g.mostrarAsientosGusanito();
                                break;
                            case 2:
                                System.out.println("\nDISPOSICION DE ASIENTOS DE RUEDA DE CHICAGO\n");
                                System.out.println("\n" + ANSI_GREEN_BACKGROUND + "   " + ANSI_RESET + " = DISPONIBLES.");
                                System.out.println("\n" + ANSI_RED_BACKGROUND + "   " + ANSI_RESET + " = OCUPADOS\n");
                                cg.mostrarAsientosChicago();
                                break;
                            case 3:
                                System.out.println("\nDISPOSICION DE ASIENTOS DE MONTANIA RUSA\n");
                                System.out.println("\n" + ANSI_GREEN_BACKGROUND + "   " + ANSI_RESET + " = DISPONIBLES.");
                                System.out.println("\n" + ANSI_RED_BACKGROUND + "   " + ANSI_RESET + " = OCUPADOS\n");
                                mr.mostrarAsientosMontaniaRusa();
                                break;
                            default:
                                System.out.println("REGRESANDO A MENU PRINCIPAL...");
                                break;
                        }
                        break;
                    case 3:
                        calculoGanancias(g, cg, mr);
                        break;
                    case 4:
                        System.out.println("LO ESPERAMOS PRONTO...");
                        flag = false;
                    default:
                        System.out.println("\nINGRESE OPCION VALIDA.");
                        break;
                }
            }catch(InputMismatchException e){
                System.out.println("ERROR. ESTA INGRESANDO DATOS NO NUMERICOS.");
                in.nextLine();
            }
        }
    }
    
    public static void mainMenu(){
        System.out.println("");
        System.out.println(ANSI_BLUE_BACKGROUND + ANSI_YELLOW +  "********* MENU PRINCIPAL **********" + ANSI_RESET);
        System.out.println("1. INGRESO DE PERSONAS.");
        System.out.println("2. MOSTRAR ASIENTO.");
        System.out.println("3. MOSTRAR GANANCIAS.");
        System.out.println("4. SALIR.");
        System.out.println(ANSI_BLUE_BACKGROUND + ANSI_YELLOW +  "********* MENU PRINCIPAL **********" + ANSI_RESET);
        System.out.print("INGRESE OPCION: ");
    }
    
    public static void menuRuedas(){
        System.out.println("");
        System.out.println(ANSI_RED_BACKGROUND + ANSI_YELLOW + "---------- ATRACCIONES ----------" + ANSI_RESET);
        System.out.println("1. RUEDA DE GUSANITO.");
        System.out.println("2. RUEDA DE CHICAGO.");
        System.out.println("3. MONTANIA RUSA.");
        System.out.println(ANSI_RED_BACKGROUND + ANSI_YELLOW + "---------- ATRACCIONES ----------" + ANSI_RESET);
        System.out.print("INGRESE OPCION: ");
    }
    
    public static void calculoGanancias(Gusanito g, Chicago cg, Montania_Rusa mr){
        double gananciaGus;
        double gananciaChic;
        double gananciaMont;
        double gananciaTotal;
        int cont1 = 0, cont2 = 0, cont3 = 0;
        
        for (int i = 0; i < g.getCapacidad().length; i++) {
            for (int j = 0; j < g.getCapacidad()[i].length; j++) {
                if (g.getCapacidad()[i][j] == true) {
                    cont1++;
                }
            }
        }
        gananciaGus = cont1*g.getPrecioPersona();
        
        for (int i = 0; i < cg.getCapacidad().length; i++) {
            for (int j = 0; j < cg.getCapacidad()[i].length; j++) {
                if (cg.getCapacidad()[i][j] == true) {
                    cont2++;
                }
            }
        }
        
        gananciaChic = cont2*cg.getPrecioPersona();
        
        for (int i = 0; i < mr.getCapacidad().length; i++) {
            for (int j = 0; j < mr.getCapacidad()[i].length; j++) {
                if (mr.getCapacidad()[i][j] == true) {
                    cont3++;
                }
            }
        }
        
        gananciaMont = cont3*mr.getPrecioPersona();
        
        gananciaTotal = gananciaGus + gananciaChic + gananciaMont;
        
        System.out.println("");
        System.out.println(ANSI_PURPLE_BACKGROUND + "****** GANANCIAS ******" + ANSI_RESET);
        System.out.println("GANANCIA GUSANITO: " + gananciaGus);
        System.out.println("GANANCIA CHICAGO: " + gananciaChic);
        System.out.println("GANANCIA MONTANIA RUSA: " + gananciaMont);
        System.out.println("-----------------------------------------");
        System.out.println("GANANCIA TOTAL:\t" + gananciaTotal);
        System.out.println(ANSI_PURPLE_BACKGROUND + "****** GANANCIAS ******" + ANSI_RESET);
    }
}
