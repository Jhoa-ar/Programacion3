/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.prog3.listassimple;

/**
 *
 * @author SAMSUNG
 */
public class ListasSimple {

    public static void main(String[] args) {
        LSimpleE l= new LSimpleE();
        l.adiprincipio("jhoana", "calderon", "quispe", 75);
        l.adiprincipio("rafael", "condori", "mamani", 75);
        l.adiprincipio("luis", "calderon", "salazar", 75);
        
        l.adiFinal("roberto", "valdez", "salazar", 75);
        l.adiFinal("victor", "salazar", "salazar", 75);
        
        System.out.println("lista de estudiantes");
        l.mostrar();
        
        System.out.println("lista de nodos" + l.nroNodos());
        
        
    }
}
