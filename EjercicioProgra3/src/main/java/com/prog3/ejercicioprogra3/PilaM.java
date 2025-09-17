/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog3.ejercicioprogra3;

/**
 *
 * @author SAMSUNG
 */
public class PilaM {
    private int max=50;
    private Mascotas[] v = new Mascotas[max+1];
    private int tope;
    
    PilaM(){
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
    
    void adicionar(Mascotas elem){
        if (esllena()) {
            System.out.println("Pila llena");
        } else {
            tope++;
            v[tope] = elem;
   
        }
    }
    Mascotas eliminar(){
        if (esvacia()) {
            System.out.println("Pila vacia");
            return null;
        } else{
            Mascotas elem = v[tope];
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

    PilaM aux = new PilaM(); 

    while (!esvacia()) {
        Mascotas x = eliminar();
        x.mostrar();      
        aux.adicionar(x); 
    }

    while (!aux.esvacia()) {
        adicionar(aux.eliminar());
    }
}

    
    void vaciar(PilaM a){
        while(!a.esvacia()){
            adicionar(a.eliminar());
        }
    }
    
    
}
