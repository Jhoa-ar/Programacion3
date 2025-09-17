/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog3.ejercicioprogra3;

public class ColaS {
    private int max = 50;
    private Mascotas[] v = new Mascotas[max + 1];
    private int frente;
    private int fin;

    public ColaS() {
        frente = 0;
        fin = 0;
    }

    public boolean esvacia() {
        return frente == fin;
    }

    public boolean esllena() {
        return fin == max;
    }

    public void adicionar(Mascotas elem) {
        if (!esllena()) {
            fin++;
            v[fin] = elem;
        } else {
            System.out.println("Cola llena");
        }
    }

    public Mascotas eliminar() {
        if (!esvacia()) {
            frente++;
            return v[frente];
        } else {
            System.out.println("Cola vacía");
            return null;
        }
    }

    public void vaciar(ColaS otra) {
        while (!otra.esvacia()) {
            adicionar(otra.eliminar());
        }
    }
}

