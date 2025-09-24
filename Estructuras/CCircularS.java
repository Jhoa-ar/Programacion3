/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog3.estructuras;

/**
 *
 * @author SAMSUNG
 */
public class CCircularS {
    private int max = 50;
    private String v[] = new String[max + 1];
    private int ini, fin;

    public CCircularS() {
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

    void adicionar(String elem) {
        if (!esllena()) {
            fin = (fin + 1) % max;
            v[fin] = elem;
        } else {
            System.out.println("Cola circular llena");
        }
    }

    String eliminar() {
        String elem = null; // Inicializamos con null
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
        String elem;
        if (esvacia()) {
            System.out.println("Cola vacia xxx");
        } else {
            System.out.println("\nElementos de la Cola ");
            CCircularS aux = new CCircularS();
            while (!esvacia()) {
                elem = eliminar();
                aux.adicionar(elem);
                System.out.println(elem); 
            }
            vaciar(aux);
        }
    }

    void vaciar(CCircularS a) {
        while (!a.esvacia())
            adicionar(a.eliminar());
    }
}

