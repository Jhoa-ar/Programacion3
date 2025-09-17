/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackegeejer3;

/**
 *
 * @author SAMSUNG
 */
public class Main {
    public static void main(String[] args){
        CCircularA colaA = new CCircularA();
        CCircularB colaB = new CCircularB();
        
        PilaC c = new PilaC();
        PilaC aux = new PilaC();
        
        Termino a1 = new Termino(3,0);
        Termino a2 = new Termino(4,2);
        Termino a3 = new Termino(-5,3);
        Termino a4 = new Termino(9,6);
        
        colaA.adicionar(a1);
        colaA.adicionar(a2);
        colaA.adicionar(a3);
        colaA.adicionar(a4);
        
        Termino b1 = new Termino(5,0);
        Termino b2 = new Termino(-8,2);
        Termino b3 = new Termino(10,4);
        Termino b4 = new Termino(7,5);
        
        colaB.adicionar(b1);
        colaB.adicionar(b2);
        colaB.adicionar(b3);
        colaB.adicionar(b4);
        
        System.out.println("Cola Circular A");
        colaA.mostrar();
        System.out.println("ColaCircular B");
        colaB.mostrar();
        
        solucion(colaA, colaB, c);
        System.out.println("Pila C: ");
        c.mostrar();
    }
     public static void solucion(CCircularA colaA, CCircularB colaB, PilaC c){
         while(!colaA.esvacia()){
             Termino t = colaA.eliminar();
             c.adicionar(t);
         }
         while (!colaB.esvacia()){
             Termino t = colaB.eliminar();
             c.adicionar(t);
         }
     }

}
