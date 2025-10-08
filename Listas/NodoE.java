/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog3.listassimple;

/**
 *
 * @author SAMSUNG
 */
public class NodoE {
    private String nom,pat,mat;
    private int not;
    private NodoE sig;
    
    NodoE(){
        sig = null;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPat() {
        return pat;
    }

    public void setPat(String pat) {
        this.pat = pat;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public int getNot() {
        return not;
    }

    public void setNot(int not) {
        this.not = not;
    }

    public NodoE getSig() {
        return sig;
    }

    public void setSig(NodoE d) {
        this.sig = d;
    }
    public void mostrar() {
        System.out.println("Nombre: " + nom + 
                           " | Apellido Paterno: " + pat + 
                           " | Apellido Materno: " + mat + 
                           " | Nota: " + not);
    }
}
