/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog3.tiendaj;

/**
 *
 * @author SAMSUNG
 */
public class Prenda {
    private int codigo, stock;
    private String nombre, material, color;
    private double precio;
    
    Prenda(int a, String b, String c, String d, int e, double f){
        codigo = a;
        nombre = b ;
        material = c;
        color = d;
        stock = e;
        precio = f;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    
    public void mostrar(){
        System.out.println(codigo + " "+ nombre + " " + material + " "+ color + " " + stock + " " + precio + " ");
    }
    
}
