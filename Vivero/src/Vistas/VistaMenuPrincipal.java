/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Presentadores.ContratoPresentadorMenuPrincipal;
import Presentadores.PresentadorMenuPrincipal;
import java.util.Scanner;

/**
 *
 * @author utku30
 */
public class VistaMenuPrincipal implements ContratoVistaMenuPrincipal {
    private ContratoPresentadorMenuPrincipal presentador;

    public VistaMenuPrincipal() {
        this.presentador = new PresentadorMenuPrincipal(this);
        this.presentador.iniciar();
    }
    
    
    public void mostrarMenuPrincipal (){
        Scanner scannerDeOpciones = new Scanner(System.in);
        System.out.println("INGRESE LA OPCIÓN CORRESPONDIENTE");
        System.out.println("01-Catálogo de flores");
        System.out.println("02-Catálogo de arbustos");
        System.out.println("03-Catálogo de acuáticas");
        System.out.println("04-Catálogo de Productos");
        System.out.println("05-Consultas");
        int opcionIngresada = scannerDeOpciones.nextInt();
        presentador.procesarOpcionIngresada(opcionIngresada);
        
      
        
    }
    public void mostrarOpcionInexistente (){
         System.out.println("OPCION INCORRECTA");
    }
    
    
}
