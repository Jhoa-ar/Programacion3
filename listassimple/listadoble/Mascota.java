/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog3.listassimple.listadoble;

/**
 *
 * @author SAMSUNG
 */
public class Mascota {
    private String nom,tipo;
    private int edad;
    
    Mascota(String a, String b, int c){
        nom=a;
        tipo=b;
        edad=c;
    } 

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void mostrar(){
        System.out.print(nom + " " + tipo + " " + edad + " | ");
    }
}
