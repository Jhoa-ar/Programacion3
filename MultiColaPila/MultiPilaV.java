/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog3.tiendaj;

/**
 *
 * @author SAMSUNG
 */
public class MultiPilaV {
    private int np;
    private  PilaV p[] = new PilaV[100];
    
    MultiPilaV(){
        for (int i = 0; i < 50; i++) {
            p[i] = new PilaV();
        }
    }

    public int getNp() {
        return np;
    }

    public void setNp(int n) {
        this.np = n;
    }
    boolean esvacia(int i){
        return p[i].esvacia();
    }
    boolean esllena(int i){
        return p[i].esllena();
    }
    int nroelem(int i){
        return p[i].nroelem();
    }
    void adicionar(int i, Venta elem){
        p[i].adicionar(elem);
    }
    Venta eliminar(int i){
        return p[i].eliminar();
    }
    void mostrar(int i){
        p[i].mostrar();
    }
    void mostrar(){
        for (int i = 0; i < np; i++) {
            if(!p[i].esvacia()){
                System.out.println("Pila " + i + ":");
                p[i].mostrar();
                System.out.println("-----------------");
            }
        }
    }

    void vaciar(int i, PilaV Z){
        p[i].vaciar(Z);
    }
    void vaciar(int i, int j){
        p[i].vaciar(p[j]);
    }
    
}
