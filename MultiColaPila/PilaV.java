/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog3.tiendaj;

/**
 *
 * @author SAMSUNG
 */
public class PilaV {
    private int max = 100;
    private Venta v[] = new Venta[max + 1];
    private int tope;

    public PilaV() {
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

    public void adicionar(Venta elem) {
        if (!esllena()) {
            tope = tope + 1;
            v[tope] = elem;
        } else {
            System.out.println("Pila llena");
        }
    }

    public Venta eliminar() {
        Venta elem = null;
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
        PilaV aux = new PilaV();
        while (!esvacia()) {
            Venta e = eliminar();
            e.mostrar();
            aux.adicionar(e);
        }
        vaciar(aux);
    }

    public void vaciar(PilaV z) {
        while (!z.esvacia()) {
            adicionar(z.eliminar());
        }
    }

}
