/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackegeejer3;

/**
 *
 * @author SAMSUNG
 */
public class Termino {
    private int coef,expo;
    
    Termino(int coef, int expo){
        this.coef=coef;
        this.expo=expo;
    }

    public int getCoef() {
        return coef;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }

    public int getExpo() {
        return expo;
    }

    public void setExpo(int expo) {
        this.expo = expo;
    }
    
    public void mostrar(){
        if(expo == 0){
            System.out.println(coef);
        } else if (expo == 1) {
            System.out.println(coef + "x");
        } else {
            System.out.println(coef + "x^" + expo);
        }
    }
}
