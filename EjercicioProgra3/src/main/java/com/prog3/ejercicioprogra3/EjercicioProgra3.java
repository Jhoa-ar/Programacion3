/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.prog3.ejercicioprogra3;

/**
 *
 * @author SAMSUNG
 */
public class EjercicioProgra3 {

    public static void main(String[] args) {
       PilaM pila= new PilaM();
       PilaV pila2 = new PilaV();
       Mascotas m1 = new Mascotas("perro", "Scott", "Golden","gris", "macho", "si", 12); 
       Mascotas m2 = new Mascotas("gato", "michi", "siames","blanco", "hembra", "si", 5); 
       Mascotas m3 = new Mascotas("conejo", "maria", "criollo","cafe", "hembra", "si", 4); 
       Mascotas m4 = new Mascotas("loro", "mio", "tucan","verde", "macho", "no", 2);
       
       pila.adicionar(m1);
       pila.adicionar(m2);
       pila.adicionar(m3);
       pila.adicionar(m4);
       
      
       solucion(pila,pila2,"perro");
       
        System.out.println("PILA ORIGINAL: ");
        pila.mostrar();
        
        System.out.println("/nPILA DESTINO: ");
        pila2.mostrar();
       
       
    }
    
    public static void solucion(PilaM A, PilaV V, String x){
        ColaS colaAux= new ColaS();
        while(!A.esvacia()){
            colaAux.adicionar(A.eliminar());
            
        }
        while(!colaAux.esvacia()){
            Mascotas m = colaAux.eliminar();
            if (m.getEspecie().equals(x)) {
                V.adicionar(m);
            } else {
                A.adicionar(m);
            }
        }
    } 
}
