/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog3.tiendaj;

/**
 *
 * @author SAMSUNG
 */
public class Venta {
    private int codigo, cantidad;
    private String fecha;
    
    Venta(int a, int b, String c){
        codigo=a;
        cantidad=b;
        fecha=c;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public void mostrar(){
        System.out.println(codigo+ " " + cantidad + " " + fecha + " ");
    }
}
