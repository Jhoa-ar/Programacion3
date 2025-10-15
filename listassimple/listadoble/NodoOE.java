/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog3.listassimple.listadoble;

/**
 *
 * @author SAMSUNG
 */
public class NodoOE {
    private Mascota m;
    private NodoOE ant, sig;
    
    NodoOE(){
        ant=sig=null;
    }

    public Mascota getM() {
        return m;
    }

    public void setM(Mascota m) {
        this.m = m;
    }

    public NodoOE getAnt() {
        return ant;
    }

    public void setAnt(NodoOE ant) {
        this.ant = ant;
    }

    public NodoOE getSig() {
        return sig;
    }

    public void setSig(NodoOE sig) {
        this.sig = sig;
    }
    
}
