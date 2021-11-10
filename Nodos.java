/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodos;
import java.util.Scanner;

/**
 *
 * @author areye
 */
public class Nodos {

    /**
     * @param args the command line arguments
     */
    
       static class Nodo{
        String Nombre;
        Nodo sig;
    }
        public static void mostrar(String name, Nodo inicio){
        System.out.println(name+" ");
        while(inicio != null){
            System.out.print(inicio.Nombre + " ");
            inicio = inicio.sig;
        }
    }
    
    public static void main(String[] args) {
        Nodo inicio=null;
        int opt;
       do {
           Scanner sc= new Scanner(System.in);
            System.out.println("\n1 add"
                    + "\n2 Show"
                    + "\n3 exit");
            
            switch (opt = sc.nextInt()) 
            
            {
                
                case 1:
                if (inicio==null){
                inicio=new Nodo();
                System.out.print("Ingrese el dato");
                inicio.Nombre =sc.nextLine();
                inicio.sig=null;
                }    
                
                else {
                Nodo  temp =new Nodo ();
                System.out.print("Ingrese el dato");
                temp.Nombre= sc.nextLine();
                temp.sig=inicio;
                inicio=temp;
                }
                break;
       
                case 2:
                      while(inicio != null){
            System.out.print(inicio.Nombre + " ");
            inicio = inicio.sig;
        }
       
                }
         
    }
    while (opt != 3);
            } 

    }


    
