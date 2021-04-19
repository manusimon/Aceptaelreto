//Ejercicio acepta el reto 290
//Probar a cambiar los char de dato por int y asignar un numero a '*' y a '.'

import java.util.Scanner;

class Nodo{
    char dato;
    Nodo nodoDer;
    Nodo nodoIzq;

    public Nodo(char dato){
        this.dato = dato;
        nodoIzq = nodoDer = null;
    }

}

class Arbol{
    private Nodo raiz;

    public Arbol(){
        raiz = null;
    }

    public void insertar(char valor){
        if(raiz == null){
            raiz = new Nodo(valor);
        }else{
            ayudaInsertar(raiz, valor);
        }    
    }

    public void ayudaInsertar(Nodo a, char valor){
        if(valor == '.'){
            if(a.nodoIzq == null){
                a.nodoIzq = new Nodo(valor);
            }else{
                ayudaInsertar(a.nodoIzq, valor);
            }
        }else if(valor == '*'){
            if(a.nodoDer == null){
                a.nodoDer = new Nodo(valor);
            }else{
                ayudaInsertar(a.nodoDer, valor);
            }
        }
    }

    int altura(){
        if(raiz == null){
            return 0;
        }else{
            return 1 + Math.max(ayudaAltura(raiz.nodoDer),ayudaAltura(raiz.nodoIzq));
        }
    }

    int ayudaAltura(Nodo raiz){
        if(raiz == null){
            return 0;
        }else{
            return 1 + Math.max(ayudaAltura(raiz.nodoDer),ayudaAltura(raiz.nodoIzq));
        }
    }

}

public class aceptaelreto290{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int veces = sc.nextInt();
        while(veces > 0){
            String arbol = sc.next();
            Arbol a = new Arbol();
            for(int i=0;i<arbol.length();i++){
                char dato = arbol.charAt(i);
                a.insertar(dato);
            }
            System.out.println(a.altura());
            veces--;
        }
        sc.close();
    }
}