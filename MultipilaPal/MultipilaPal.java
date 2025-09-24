/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog3.multipila;

/**
 *
 * @author SAMSUNG
 */
public class MultipilaPal {
    private int np;
    private PilaPal[] P = new PilaPal[50];

    public MultipilaPal() {
        for (int i = 0; i < 50; i++) {
            P[i] = new PilaPal();
        }
    }
    public int getNp() {
        return np;
    }
    public void setNp(int n) {
        np = n;
    }
    
    boolean esvacia(int i){
        return P[i].esvacia();
    }
    
    boolean esllena(int i){
        return P[i].esllena();
    }
    
    void adicionar(int i, String elem){
        P[i].adicionar(elem);
    }
    
    String eliminar(int i){
        return P[i].eliminar();
    }
    
}

