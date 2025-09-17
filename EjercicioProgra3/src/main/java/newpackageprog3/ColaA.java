package newpackageprog3;

public class ColaA {
    private int max = 50;
    private Artesanias[] v = new Artesanias[max + 1];
    private int frente;
    private int fin;

    public ColaA() {
        frente = 0;
        fin = 0;
    }

    public boolean esvacia() {
        return frente == fin;
    }

    public boolean esllena() {
        return fin == max;
    }

    public void adicionar(Artesanias elem) {
        if (!esllena()) {
            fin++;
            v[fin] = elem;
        } else {
            System.out.println("Cola llena");
        }
    }

    public Artesanias eliminar() {
        if (!esvacia()) {
            frente++;
            return v[frente];
        } else {
            System.out.println("Cola vacía");
            return null;
        }
    }

    public void vaciar(ColaA otra) {
        while (!otra.esvacia()) {
            adicionar(otra.eliminar());
        }
    }

    public void mostrar() {
        if (esvacia()) {
            System.out.println("Cola vacía");
            return;
        }

        ColaA aux = new ColaA(); // Cola auxiliar para mantener el orden

        while (!esvacia()) {
            Artesanias elem = eliminar();
            if (elem != null) {
                elem.mostrar();    // Llama al método mostrar() de Artesanias
                aux.adicionar(elem);
            }
        }

        // Regresar los elementos a la cola original
        while (!aux.esvacia()) {
            adicionar(aux.eliminar());
        }
    }
}
