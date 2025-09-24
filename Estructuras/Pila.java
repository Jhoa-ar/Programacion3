/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog3.estructuras;

public class Pila {
    private int max = 100;
    private int v[] = new int[max + 1];
    private int tope;

    public Pila() {
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

    public void adicionar(int elem) {
        if (!esllena()) {
            tope = tope + 1;
            v[tope] = elem;
        } else {
            System.out.println("Pila llena");
        }
    }

    public int eliminar() {
        int elem = 0;
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
        Pila aux = new Pila();
        while (!esvacia()) {
            int e = eliminar();
            System.out.println(e);
            aux.adicionar(e);
        }
        vaciar(aux);
    }

    public void vaciar(Pila z) {
        while (!z.esvacia()) {
            adicionar(z.eliminar());
        }
    }
}

