/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog3.ejercicioprogra3;

/**
 *
 * @author SAMSUNG
 */
public class Mascotas {
    private String especie, nombre, raza, color, sexo, esterilizado;
    private int edad;
    
    Mascotas(String e, String n, String r, String c, String s, String esterilizado, int edad){
        this.especie=e;
        this.color=c;
        this.nombre = n;
        this.raza=r;
        this.sexo=s;
        this.esterilizado=esterilizado;
        this.edad=edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(String esterilizado) {
        this.esterilizado = esterilizado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mostrar(){
        System.out.println("nombre: " + nombre + ", Especie: " + especie + ", Raza: " + raza + ",Color: " + color + ", Sexo: " + sexo + ", Esterilizado: " + esterilizado + 
        ", Edad: " + edad + " años");
    }
}
