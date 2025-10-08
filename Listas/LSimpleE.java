/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog3.listassimple;

/**
 *
 * @author SAMSUNG
 */
public class LSimpleE {
    private NodoE p;
    
    LSimpleE(){
        p=null;
    }

    public NodoE getP() {
        return p;
    }

    public void setP(NodoE x) {
        this.p = x;
    }
    int nroNodos(){
        int c=0;
        NodoE w = getP();
        while (w != null){
            c = c +1;
            w = w.getSig();
        }
        return c;
    }
    void mostrar(){
        NodoE a =getP();
        while (a != null){
            a.mostrar();
            a = a.getSig();
        }
    }
    
    void adiprincipio(String a, String b, String c, int d){
        NodoE nue = new NodoE();
        nue.setNom(a);
        nue.setPat(b);
        nue.setMat(c);
        nue.setNot(d);
        
        nue.setSig(getP());
        setP(nue);
    }
    
    void adiFinal(String a, String b, String c, int d){
        NodoE nue = new NodoE();
        nue.setNom(a);
        nue.setPat(b);
        nue.setMat(c);
        nue.setNot(d);
        nue.setSig(null);
        
        if (getP() == null) {
            setP(nue);
        } else {
            NodoE w= getP();
            while(w.getSig() != null){
                w = w.getSig();
            }
            w.setSig(nue);
        }
    }
    
}
