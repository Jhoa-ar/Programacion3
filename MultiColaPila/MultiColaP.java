/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog3.tiendaj;

/**
 *
 * @author SAMSUNG
 */
public class MultiColaP {
    private int nc;
    private CCircularP [] v = new CCircularP[50];
    
    MultiColaP(){
        for (int i = 0; i < 50; i++) {
            v[i] = new CCircularP();
        }
    }

    public int getNc() {
        return nc;
    }

    public void setNc(int n) {
        this.nc = n;
    }
    boolean esvacia(int i){
        return v[i].esvacia();
    }
    boolean esllena(int i){
        return v[i].esllena();
    }
    int nroelem(int i){
        return v[i].nroelem();
    }
    void adicionar(int i, Prenda elem){
        v[i].adicionar(elem);
    }
    Prenda eliminar(int i){
        return v[i].eliminar();
    }
    void mostrar(int i){
        v[i].mostrar();
    }
    void mostrar(){
        for (int i = 0; i < nc; i++) {
            mostrar(i);
        }
    }
    void vaciar(int i, CCircularP Z){
        v[i].vaciar(Z);
    }
    void vaciar(int i, int j){
        v[i].vaciar(v[j]);
    }
    
}
