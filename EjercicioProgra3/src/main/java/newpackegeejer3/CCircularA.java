/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackegeejer3;

/**
 *
 * @author SAMSUNG
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class CCircularA {
    private int max=30;
    private Termino[] v= new Termino[max+1];
    private int ini,fin;
    
    public CCircularA(){   
        ini=fin=0;
    }
    public int nroelem(){
        if (ini == 0 & fin==0) {
            return 0;
        }
        else{
            if (fin>ini) 
                return fin - ini;
            else 
                return max - ini + fin;
        }
    }
    
    public boolean esvacia(){
        if (nroelem()==0) {
            return true;
        }
        return false;
    }
    
    public boolean esllena(){
        if (nroelem()==max) {
            return true;
        }
        return false;
    }
    
    public void adicionar(Termino elem){
        if (!esllena()) {
            if (fin == max) 
                fin = 1;
            else 
                fin++;
            v[fin] = elem;            
        } else {
            System.out.println("Cola llena");
        }
}

    
    public Termino eliminar(){
        Termino elem = null;
        if (!esvacia()) {
            ini=ini+1;
            elem=v[ini];
            if (ini == max)
                ini = 0;
            if (ini== fin)
                ini = fin = 0;
        } else {
            System.out.println("Cola vacia");
        }
        return elem;
    }
    
public void mostrar() {
    if (esvacia()) {
        System.out.println("Cola vacía");
        return;
    }

    CCircularA aux = new CCircularA();  // auxiliar para guardar elementos
    CCircularA temp = new CCircularA(); // auxiliar temporal para buscar el menor

    while (!esvacia()) {
        Termino menor = eliminar();  // tomar el primer elemento como referencia

        // Buscar el elemento con menor exponente
        while (!esvacia()) {
            Termino t = eliminar();
            if (t.getExpo()< menor.getExpo()) {
                temp.adicionar(menor);
                menor = t;
            } else {
                temp.adicionar(t);
            }
        }

        // Mostrar el menor
        menor.mostrar();

        // Devolver los elementos restantes a la cola original
        vaciar(temp);

        // Guardar el menor en la cola auxiliar
        aux.adicionar(menor);
    }

    // Restaurar todos los elementos a la cola original
    vaciar(aux);
}


public void vaciar(CCircularA c){
    while (!c.esvacia()){
        adicionar(c.eliminar());
    }
}



}

    


