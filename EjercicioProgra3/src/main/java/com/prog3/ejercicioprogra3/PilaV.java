/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog3.ejercicioprogra3;

public class PilaV {
    private int max = 50;
    private Mascotas[] v = new Mascotas[max + 1];
    private int tope;

    public PilaV() {
        tope = 0; // tope empieza vacío
    }

    // Verifica si la pila está vacía
    public boolean esvacia() {
        return tope == 0;
    }

    // Verifica si la pila está llena
    public boolean esllena() {
        return tope == max;
    }

    // Agregar mascota a la pila
    public void adicionar(Mascotas elem) {
        if (esllena()) {
            System.out.println("Pila llena");
        } else {
            tope++;
            v[tope] = elem;
        }
    }

    // Eliminar mascota del tope
    public Mascotas eliminar() {
        if (esvacia()) {
            System.out.println("Pila vacía");
            return null;
        } else {
            Mascotas elem = v[tope];
            v[tope] = null; // limpia referencia
            tope--;
            return elem;
        }
    }

    // Mostrar todas las mascotas sin perder la pila
    public void mostrar() {
        if (esvacia()) {
            System.out.println("Pila vacía");
            return;
        }

        PilaV aux = new PilaV();
        while (!esvacia()) {
            Mascotas m = eliminar();
            if (m != null) {
                m.mostrar();
                aux.adicionar(m);
            }
        }

        while (!aux.esvacia()) {
            adicionar(aux.eliminar());
        }
    }
}

