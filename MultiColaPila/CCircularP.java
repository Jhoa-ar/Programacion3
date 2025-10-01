/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog3.tiendaj;

/**
 *
 * @author SAMSUNG
 */
public class CCircularP {
    private int max = 50;
    private Prenda v[] = new Prenda[max + 1];
    private int ini, fin;

    public CCircularP() {
        ini = fin = 0;
    }

    int nroelem() {
        return ((max + fin - ini) % max);
    }

    boolean esvacia() {
        return nroelem() == 0;
    }

    boolean esllena() {
        return nroelem() == max - 1;
    }

    void adicionar(Prenda elem) {
        if (!esllena()) {
            fin = (fin + 1) % max;
            v[fin] = elem;
        } else {
            System.out.println("Cola circular llena");
        }
    }

    Prenda eliminar() {
        Prenda elem = null;
        if (!esvacia()) {
            ini = (ini + 1) % max;
            elem = v[ini];
            if (nroelem() == 0)
                ini = fin = 0;
        } else {
            System.out.println("Cola circular vacia");
        }
        return elem;
    }

    void mostrar() {
        Prenda elem;
        if (esvacia()) {
            System.out.println("Cola vacia xxx");
        } else {
            System.out.println("\nElementos de la Cola ");
            CCircularP aux = new CCircularP();
            while (!esvacia()) {
                elem = eliminar();
                aux.adicionar(elem);
                elem.mostrar(); 
            }
            vaciar(aux);
        }
    }

    void vaciar(CCircularP a) {
        while (!a.esvacia())
            adicionar(a.eliminar());
    }
}
