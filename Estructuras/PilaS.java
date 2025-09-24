/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog3.estructuras;

public class PilaS {
    private int max = 100;
    private String v[] = new String[max + 1];
    private int tope;

    public PilaS() {
        tope = 0;
    }

    public boolean esvacia() {
        return tope == 0;
    }

    public boolean esllena() {
        return tope == max;
    }

    public int nroelem() {
        return tope;
    }

    public void adicionar(String elem) {
        if (!esllena()) {
            tope = tope + 1;
            v[tope] = elem;
        } else {
            System.out.println("Pila llena");
        }
    }

    public String eliminar() {
        String elem = null;
        if (!esvacia()) {
            elem = v[tope];
            tope = tope - 1;
        } else {
            System.out.println("Pila vacía");
        }
        return elem;
    }

    public void mostrar() {
        if (esvacia()) {
            System.out.println("Pila vacía");
            return;
        }

        System.out.println("\nElementos de la pila:");
        PilaS aux = new PilaS();
        while (!esvacia()) {
            String e = eliminar();
            System.out.println(e);
            aux.adicionar(e);
        }
        vaciar(aux);
    }

    public void vaciar(PilaS z) {
        while (!z.esvacia()) {
            adicionar(z.eliminar());
        }
    }

}

