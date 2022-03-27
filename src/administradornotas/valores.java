/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administradornotas;

import java.util.Scanner;

/**
 *
 * @author josue
 */
public class valores implements comparar{
    
     public valores(){
        
    }

     @Override
    public void arreglo(){
        double[] arreglo1 = {10, 2.8, 1, 9.6, 5, 3, 7, 8, 3.3, 4};
        
        System.out.println("Arreglo antes de modificar");
        for (double i : arreglo1) {
        System.out.print(i);
        System.out.println(" ");
        }
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuantas notas desea agregar: ");
        int lim = lector.nextInt();
        
        for(int i=0;i < lim;i++){
        System.out.println("Digite la nota que sea agregar: ");
        arreglo1 [i] = lector.nextDouble();
        }
        
        System.out.println("En que posicion se encuentra la nota que desea eliminar: ");
        int elim = lector.nextInt();
        arreglo1 [elim] = 0;

        System.out.println("Arreglo después de ordenar...");
        for (double i : arreglo1) {
        System.out.print(i);
        System.out.println(" ");
        }
        
        System.out.print("En que posicion se encuentra el primer dato que desea comparar: ");
        int primer = lector.nextInt();

        System.out.print("En que posicion se encuentra el segundo dato que desea comparar: ");
        int segundo = lector.nextInt();

        if(arreglo1[primer] > arreglo1[segundo]){
            menorNota();
        }else{
            mayorNota();
        }
    }
    
     @Override
    public void mayorNota(){
        
        System.out.print("El primer numero es el mayor");
    }
    
     @Override
    public void menorNota(){
        
        System.out.print("El primer numero es el menor");
    }
}

