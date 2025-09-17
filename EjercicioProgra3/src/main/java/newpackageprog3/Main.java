/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackageprog3;

/**
 *
 * @author SAMSUNG
 */
public class Main {
    public static void main(String[] args){
        PilaA pila= new PilaA();
        ColaA cola=new ColaA();
        
        Artesanias a1=new Artesanias(5,"la vida", 45.5);
        Artesanias a2=new Artesanias(2,"esperanza", 755.5);
        Artesanias a3=new Artesanias(1,"Infidelidad", 800);
        Artesanias a4=new Artesanias(8,"Amargura", 200);
        Artesanias a5=new Artesanias(10,"Dolor", 2540);
        Artesanias a6=new Artesanias(21,"Sentimiento", 890);
        Artesanias a7=new Artesanias(11,"Tristesa", 47);
        
        Artesanias b1=new Artesanias(78,"Complicado", 450.5);
        Artesanias b2=new Artesanias(45,"Compacion", 23.5);
        Artesanias b3=new Artesanias(2,"Diferencias", 420.5);
        Artesanias b4=new Artesanias(1,"Pasion", 960.5);
        Artesanias b5=new Artesanias(9,"Espiritu", 74.5);
        
        
        pila.adicionar(a1);
        pila.adicionar(a2);
        pila.adicionar(a3);
        pila.adicionar(a4);
        pila.adicionar(a5);
        pila.adicionar(a6);
        pila.adicionar(a7);
        
        System.out.println("PILA DE ARTESANIAS");
        pila.mostrar();
        
        
        cola.adicionar(b1);
        cola.adicionar(b2);
        cola.adicionar(b3);
        cola.adicionar(b4);
        cola.adicionar(b5);
        
        System.out.println("COLA DE ARTESANIAS");
        cola.mostrar();
        
        System.out.println("Solucion");
        solucion1();
        
       
        
        
    }
    
    public static void solucion1(){
        
        PilaA pila = new PilaA();
        ColaA cola = new ColaA();
        
        Artesanias a1=new Artesanias(5,"la vida", 45.5);
        Artesanias a2=new Artesanias(2,"esperanza", 755.5);
        Artesanias a3=new Artesanias(1,"Infidelidad", 800);
        Artesanias a4=new Artesanias(8,"Amargura", 200);
        Artesanias a5=new Artesanias(10,"Dolor", 2540);
        Artesanias a6=new Artesanias(21,"Sentimiento", 890);
        Artesanias a7=new Artesanias(11,"Tristesa", 47);
        
        pila.adicionar(a1);
        pila.adicionar(a2);
        pila.adicionar(a3);
        pila.adicionar(a4);
        pila.adicionar(a5);
        pila.adicionar(a6);
        pila.adicionar(a7);
        int puestoX = 1;
        ColaA aux = new ColaA();
        
        while(!pila.esvacia()){
            Artesanias art = pila.eliminar();
            if (art.getNroPuesto() == puestoX){
                cola.adicionar(art);
            } else{
                aux.adicionar(art);
            }
        }
        
        while (!aux.esvacia()){
            pila.adicionar(aux.eliminar());
        }
        
        while (!cola.esvacia()){
            pila.adicionar(cola.eliminar());
        }
        pila.mostrar();
        
    }
}
