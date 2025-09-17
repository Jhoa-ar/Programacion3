/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackageprog3;

/**
 *
 * @author SAMSUNG
 */
public class Artesanias {
    private int nroPuesto;
    private String nombreArte;
    private double precioArte;
    
    Artesanias(int n, String nom, double p){
        this.nombreArte = nom;
        this.nroPuesto = n;
        this.precioArte = p;
    }

    public int getNroPuesto() {
        return nroPuesto;
    }

    public void setNroPuesto(int nroPuesto) {
        this.nroPuesto = nroPuesto;
    }

    public String getNombreArte() {
        return nombreArte;
    }

    public void setNombreArte(String nombreArte) {
        this.nombreArte = nombreArte;
    }

    public double getPrecioArte() {
        return precioArte;
    }

    public void setPrecioArte(double precioArte) {
        this.precioArte = precioArte;
    }
    
    public void mostrar(){
        System.out.println("Numero de puesto: " + nroPuesto + ", Nombre del Arte: " + nombreArte + ", Precio: " + precioArte + "Bs");
    }
}
