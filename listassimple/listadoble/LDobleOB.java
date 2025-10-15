/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog3.listassimple.listadoble;

/**
 *
 * @author SAMSUNG
 */
public class LDobleOB {
    private NodoOE p;
    
    LDobleOB(){
        p=null;
    }

    public NodoOE getP() {
        return p;
    }

    public void setP(NodoOE p) {
        this.p = p;
    }
    
    int nronodos(){
        NodoOE z = getP();
        int c = 0;
        while (z!= null){
            c=c+1;
            z = z.getSig();
        }
        return c;
    } 
    void mostrar(){
        NodoOE z = getP();
        while(z!=null){
            z.getM().mostrar();
            z=z.getSig();
        }
        
    }
    void adiprincipio(Mascota x){
        NodoOE nue = new NodoOE();
        nue.setM(x);
        if (getP()== null) {
            setP(nue);
        } else {
            nue.setSig(getP());
            getP().setAnt(nue); //esto enlaza el nodo si no esta creado 
            setP(nue);
        }
    }
    void adifinal(Mascota x){
        NodoOE nue =  new NodoOE();
        nue.setM(x);
        if (getP() == null) {
            setP(nue);
        } else {
            NodoOE r = getP();
            while (r.getSig() != null)
                r=r.getSig();
            r.setSig(nue);
            nue.setAnt(r);
        }
    }
    
    
}
