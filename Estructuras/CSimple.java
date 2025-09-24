package com.prog3.estructuras;

public class CSimple {
    private int max = 50;
    private int v[] = new int[max + 1];
    private int ini, fin;

    public CSimple() {
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

    public void adicionar(int elem) {
        if (!esllena()) {
            fin++;
            v[fin] = elem;
        } else {
            System.out.println("Cola simple llena");
        }
    }

    public int eliminar() {
        int elem = 0; 
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
        CSimple aux = new CSimple();
        while (!esvacia()) {
            int elem = eliminar();
            System.out.println(elem);
            aux.adicionar(elem); 
        }
        vaciar(aux);
    }

    public void vaciar(CSimple a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }
}
