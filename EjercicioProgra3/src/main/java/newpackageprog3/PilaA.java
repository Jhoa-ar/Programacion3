/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackageprog3;

/**
 *
 * @author SAMSUNG
 */
public class PilaA {
    private int max=50;
    private Artesanias[] v = new Artesanias[max+1];
    private int tope;
    
    PilaA(){
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
    
    void adicionar(Artesanias elem){
        if (esllena()) {
            System.out.println("Pila llena");
        } else {
            tope++;
            v[tope] = elem;
   
        }
    }
    Artesanias eliminar(){
        if (esvacia()) {
            System.out.println("Pila vacia");
            return null;
        } else{
            Artesanias elem = v[tope];
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

    PilaA aux = new PilaA(); 

    while (!esvacia()) {
        Artesanias x = eliminar();
        x.mostrar();      
        aux.adicionar(x); 
    }

    while (!aux.esvacia()) {
        adicionar(aux.eliminar());
    }
}

    
    void vaciar(PilaA a){
        while(!a.esvacia()){
            adicionar(a.eliminar());
        }
    }
    
    
}
