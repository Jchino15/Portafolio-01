/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package administradornotas;

import java.util.Scanner;

/**
 *
 * @author Miguel Zelaya
 */
public class AdministradorNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //llamada al metodo promedio//
        Notas llamada2 = new Notas();
        llamada2.promedio();
        System.out.println("**********************************");
        //llamada al metodo alumno//
        Alumno llamada3 = new Alumno();
        llamada3.datos();
        System.out.println("**********************************");   

        Interfaz llamada = new Interfaz();
        llamada.menu();

        System.out.println("**********************************");
        llamada2.busquedaSecuencial();
        System.out.println("**********************************");
        llamada2.busquedaBinaria();

        valores arre = new valores();
        arre.arreglo();   
        
    }


    public static void ordenarPorSeleccion(double[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // ...intercambiarlos, es decir, mover el actual a la derecha y el de la derecha al actual
                    double temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                }
            }
        }
    }
}
