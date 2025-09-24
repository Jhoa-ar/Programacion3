/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog3.estructuras;

/**
 *
 * @author SAMSUNG
 */

public class CSimpleS {
    private int max = 50;
    private String v[] = new String[max + 1];
    private int ini, fin;

    public CSimpleS() {
        ini = fin = 0;
    }

    public boolean esvacia() {
        return ini == 0 && fin == 0;
    }

    public boolean esllena() {
        return fin == max;
    }

    public int nroelem() {
        return fin - ini;
    }

    public void adicionar(String elem) {
        if (!esllena()) {
            fin++;
            v[fin] = elem;
        } else {
            System.out.println("Cola simple llena");
        }
    }

    public String eliminar() {
        String elem = null; 
        if (!esvacia()) {
            ini++;
            elem = v[ini];
            if (ini == fin)
                ini = fin = 0;
        } else {
            System.out.println("Cola simple vacía");
        }
        return elem;
    }

    public void mostrar() {
        if (esvacia()) {
            System.out.println("Cola vacía");
            return;
        }

        System.out.println("\nElementos de la cola:");
        CSimpleS aux = new CSimpleS();
        while (!esvacia()) {
            String elem = eliminar();
            System.out.println(elem);
            aux.adicionar(elem); 
        }
        vaciar(aux);
    }

    public void vaciar(CSimpleS a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }
}
