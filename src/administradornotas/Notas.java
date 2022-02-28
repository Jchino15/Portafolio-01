/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administradornotas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author josue
 */
public class Notas {
    //Atributos
    
   /**
     * @return the notas
     */
    public double getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(double notas) {
        this.notas = notas;
    }
    //Atributos
    
    private double notas;
      
    public Notas(){
    }

    public void promedio() {
        ArrayList lista = new ArrayList();
        lista.add(6);
        lista.add(5);
        lista.add(4);
        lista.add(3);
        int promedio = 0;
        System.out.println("Sus notas son: "+lista.toString());
        for(Object num : lista)promedio+=(int)num;
        promedio/=lista.size();
        System.out.println("El promedio de sus notas son: "+promedio);

    }
    public  void busquedaSecuencial(){
        ArrayList lista = new ArrayList();
        lista.add(6);
        lista.add(5);
        lista.add(4);
        lista.add(3);
        Scanner dato = new Scanner(System.in);
        System.out.print("Buscar: ");
        Object lim = dato.nextInt();
        int posicion = 0;
        for(int i = 0; i < lista.size(); i++){//recorremos todo el arreglo
            if(lista.get(i) == lim){
                posicion = i;//Si es verdadero guardamos la posicion
                break;//Para el ciclo
            
            }//comparamos el elemento en el arreglo con el buscado         
            
        }
        System.out.println("El dato esta en la posicion: "+posicion);
    }
    
    public int busquedaBinaria()
    {
        int [] a={1,5,4,6,7,8};
         Scanner dato = new Scanner(System.in);
        System.out.print("Buscar: ");
        int n = dato.nextInt();
        int central, alto, bajo;
        int valorCentral;
        bajo = 0;
        alto = a.length-1;
        while(bajo<=alto)
        {
        central = (bajo + alto)/2;
        valorCentral = a[central];
        if(n == valorCentral) return central;
        else if(n< valorCentral) alto = central -1;
        else bajo = central +1;
        }
        return -1;
    }
}
