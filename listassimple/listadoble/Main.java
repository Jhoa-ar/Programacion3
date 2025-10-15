/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog3.listassimple.listadoble;

/**
 *
 * @author SAMSUNG
 */
public class Main {
    public static void main(String[] args) {
        LDobleOB m1 = new LDobleOB();
        m1.adiprincipio(new Mascota("scott", "perro", 11));
        m1.adiprincipio(new Mascota("firulais", "perro", 10));
        m1.adiprincipio(new Mascota("sebastian", "gato", 4));
        m1.adiprincipio(new Mascota("chichi", "loro", 7));
       
        m1.adifinal(new Mascota("scott2", "perro", 6));
        
        LDobleOB m2 = new LDobleOB();
        m2.adiprincipio(new Mascota("scott", "perro", 11));
        m2.adiprincipio(new Mascota("michi", "gato", 10));
        m2.adiprincipio(new Mascota("arturo", "conejo", 4));
        m2.adiprincipio(new Mascota("tody", "loro", 7));
       
        m2.adifinal(new Mascota("scott2", "gallo", 6));
        m2.adifinal(new Mascota("michi", "nutria", 6));
        m2.adifinal(new Mascota("ria", "gato", 6));
        
        System.out.println("lista de mascotas1");
        m1.mostrar();
        System.out.println("\nlista de mascotas2");
        m2.mostrar();
        
        
        System.out.println("\nMostrar a las mascotas  tipo X: ");
        solucion1(m1,"perro");
        System.out.println("\nMostrar a la penultima mascota de la lista ");
        solucion3(m1);
        System.out.println("\nMostrar a las mascota con edad par ");
        solucion4(m1);
        System.out.println("\nMostrar la cantidad de mascotas mayores de 5 años");
        solucion5(m1);
        System.out.println("\nMostrar a las mascotas excepto la primera");
        solucion6(m2);
        System.out.println("\nMostrar la segunda mascota");
        solucion7(m2);
        System.out.println("\nMostrar la ultima mascota");
        solucion8(m1);
        System.out.println("\nMostrar la mascota de la posicion k");
        solucion9(m2,4);
        System.out.println("\nMostrar la mascota con posiciones pares");
        solucion10(m1);
    }
    
    public static void solucion1(LDobleOB a, String x){
        NodoOE w = a.getP();
        while(w!=null){
            if(w.getM().getTipo() == x)
                w.getM().mostrar();
            w=w.getSig();
        }
    }
    
    public static void solucion2(LDobleOB a, int i){
        int c = 0;
        NodoOE b = a.getP();
        while (b!= null){
            c++;
            if(c==1)
                b.getM().mostrar();
            b = b.getSig();
        }
    }
    
    public static void solucion3(LDobleOB a) {
        NodoOE b = a.getP();
            while (b.getSig() != null) {
                if (b.getSig().getSig() == null) {
                    b.getM().mostrar();
                }
                b = b.getSig();
            }
    }
    //mostrar las mascotas con edad par
    public static void solucion4(LDobleOB a){
        NodoOE w = a.getP();
        while(w != null){
            if(w.getM().getEdad() % 2 == 0){
                w.getM().mostrar();
            }
            w = w.getSig();
        }
    }
    //Mostrar la cantidad de mascotas mayores de 5 años
    public static void solucion5(LDobleOB a){
        NodoOE p = a.getP();
        int cant = 0;
        while(p != null){
            if(p.getM().getEdad() > 5){
                cant = cant +1;
            }
            p = p.getSig();
        }
        System.out.println("Cantidad de mascotas mayores a 5 años: " + cant);
    }
    //Mostrar todas las mascotas excepto la primera 
    public static void solucion6(LDobleOB a){
        NodoOE t = a.getP();
        if(t != null){
            t = t.getSig();
        }
        while(t != null){
            t.getM().mostrar();
            t = t.getSig();
        }
    }
    //Mostrar la segunda mascota de la lista
    public static void solucion7(LDobleOB a){
        NodoOE b = a.getP();
        if (b == null) {
            System.out.println("Lista vacía.");
            return;
        }
        b = b.getSig();
        if (b != null) {
        b.getM().mostrar();
        } else {
            System.out.println("No existe segunda mascota (solo hay una).");
        }
    }
    //Mostrar solo la última mascota de tipo “Gato”
    public static void solucion8(LDobleOB a){
        NodoOE h = a.getP();
        while(h!=null){
            if(h.getSig() == null){
                h.getM().mostrar();
            }
            h=h.getSig();
        }
    }
    //mostrar la mascota que esta en la posicion k
    public static void solucion9(LDobleOB a, int k){
        NodoOE r = a.getP();
        int c =0;
        while (r != null){
            if (c == k){
                r.getM().mostrar();
            }
            r = r.getSig();
            c  = c + 1;
        }
    }
    //Mostrar las mascotas en posiciones pares
    public static void solucion10(LDobleOB a){
        NodoOE w = a.getP();
        int c =1;
        while (w !=null){
            if(c % 2 == 0){
                w.getM().mostrar();
            }
            w = w.getSig();
            c =c + 1;
        }
    }
}
