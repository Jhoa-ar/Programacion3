/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.prog3.estructuras;

/**
 *
 * @author SAMSUNG
 */

public class Estructuras {
    public static void main(String[] args) {
        // ----- Colas Simples -----
        CSimple colaEnteros = new CSimple();
        CSimpleS colaStrings = new CSimpleS();

        colaEnteros.adicionar(10);
        colaEnteros.adicionar(20);
        colaEnteros.adicionar(30);
        colaEnteros.mostrar();

        colaStrings.adicionar("Ana");
        colaStrings.adicionar("Luis");
        colaStrings.adicionar("Maria");
        colaStrings.mostrar();

        // ----- Colas Circulares -----
        CCircular colaCircularEnteros = new CCircular(); 
        CCircularS colaCircularStrings = new CCircularS();

        colaCircularStrings.adicionar("Rojo");
        colaCircularStrings.adicionar("Verde");
        colaCircularStrings.adicionar("Azul");
        colaCircularStrings.mostrar();

        // ----- Pilas -----
        Pila pilaEnteros = new Pila();
        PilaS pilaStrings = new PilaS();

        pilaEnteros.adicionar(100);
        pilaEnteros.adicionar(200);
        pilaEnteros.adicionar(300);
        pilaEnteros.mostrar();

        pilaStrings.adicionar("Hola");
        pilaStrings.adicionar("Mundo");
        pilaStrings.adicionar("Java");
        pilaStrings.mostrar();
    }
}

