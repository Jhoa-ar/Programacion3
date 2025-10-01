/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.prog3.tiendaj;

/**
 *
 * @author SAMSUNG
 */
public class Tiendaj {

    public static void main(String[] args) {
        CCircularP p1=new CCircularP();
        p1.adicionar(new Prenda(1234, "Jhoana", "lana", "azul", 42, 4500));
        p1.adicionar(new Prenda(4785, "Daniel", "tela", "verde", 10, 1200));
        p1.adicionar(new Prenda(6594, "Missa", "algodon", "gris", 2, 500));
        p1.adicionar(new Prenda(3754, "Diego", "lana de vaca", "rosado", 472, 800));
        p1.adicionar(new Prenda(4785, "Gabi", "lana", "azul", 12, 450));
        
        //p1.mostrar();
        
        CCircularP p2=new CCircularP();
        p2.adicionar(new Prenda(1234, "Jhoana", "lana", "azul", 42, 4500));
        p2.adicionar(new Prenda(4785, "Daniel", "tela", "verde", 10, 1200));
        p2.adicionar(new Prenda(6594, "Missa", "algodon", "gris", 2, 500));

        
        CCircularP p3=new CCircularP();
        p3.adicionar(new Prenda(1234, "Jhoana", "lana", "azul", 42, 4500));
        p3.adicionar(new Prenda(4785, "Daniel", "tela", "verde", 10, 1200));
        p3.adicionar(new Prenda(6594, "Missa", "algodon", "gris", 2, 500));
        p3.adicionar(new Prenda(3754, "Diego", "lana de vaca", "rosado", 472, 800));

        MultiColaP A= new MultiColaP();
        A.setNc(3);
        
        A.vaciar(0, p1);
        A.vaciar(1, p2);
        A.vaciar(2, p3);
        
        A.mostrar();
        
        PilaV v1=new PilaV();
   
        v1.adicionar(new Venta(234, 7, "1/10/2025"));
        v1.adicionar(new Venta(1234, 2, "7/10/2025"));
        v1.adicionar(new Venta(6594, 1, "15/10/2025"));
        
        //v1.mostrar();
        
        PilaV v2=new PilaV();
        v2.adicionar(new Venta(4785, 34, "1/10/2025"));
        v2.adicionar(new Venta(3754, 9, "21/10/2025"));
        
        
        MultiPilaV V=new MultiPilaV();
        V.setNp(4);
        
        V.vaciar(0,v1);
        V.vaciar(1,v2);
        
        V.mostrar();

    }
}
