/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackegeejer3;

/**
 *
 * @author SAMSUNG
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class PilaC {
    private int max=50;
    private Termino[] v = new Termino[max+1];
    private int tope;
    
    PilaC(){
        tope = 0;
    }
    
    boolean esvacia(){
        if (tope==0) {
            return true;
        }
        return false;
    }
    
    boolean esllena(){
        if (tope == max) {
            return true;
        }
        return false;
    }
    
    int nroelem(){
        return tope;
    }
    
    void adicionar(Termino elem){
        if (esllena()) {
            System.out.println("Pila llena");
        } else {
            tope++;
            v[tope] = elem;
   
        }
    }
    Termino eliminar(){
        if (esvacia()) {
            System.out.println("Pila vacia");
            return null;
        } else{
            Termino elem = v[tope];
            v[tope] = null; 
            tope--;
            return elem;
        }
    }
    
public void mostrar() {
    if (esvacia()) {
        System.out.println("Pila vacía");
        return;
    }

    PilaC aux = new PilaC(); 

    while (!esvacia()) {
        Termino x = eliminar();
        x.mostrar();      
        aux.adicionar(x); 
    }

    while (!aux.esvacia()) {
        adicionar(aux.eliminar());
    }
}

    
    void vaciar(PilaC a){
        while(!a.esvacia()){
            adicionar(a.eliminar());
        }
    }
    
    
}

