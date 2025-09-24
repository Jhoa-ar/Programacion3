/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog3.estructuras;

/**
 *
 * @author SAMSUNG
 */
public class CCircular {
    private int max = 50;
    private int v[] = new int[max + 1];
    private int ini, fin;

    public CCircular() {
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

    void adicionar(int elem) {
        if (!esllena()) {
            fin = (fin + 1) % max;
            v[fin] = elem;
        } else {
            System.out.println("Cola circular llena");
        }
    }

    int eliminar() {
        int elem = 0; 
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
        int elem;
        if (esvacia()) {
            System.out.println("Cola vacia xxx");
        } else {
            System.out.println("\nPasajeros de la Cola ");
            CCircular aux = new CCircular();
            while (!esvacia()) {
                elem = eliminar();
                aux.adicionar(elem);
                System.out.println(elem); 
            }
            vaciar(aux);
        }
    }

    void vaciar(CCircular a) {
        while (!a.esvacia())
            adicionar(a.eliminar());
    }
}

