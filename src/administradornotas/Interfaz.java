/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administradornotas;

import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class Interfaz {
    int []vector = new int[4];
    int opcion;
    
    public void menu()
    {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu\n\n1)-Ingresar\n2)-Mostrar\n3)-" 
                + "Modificar\n4)-Eliminar\n5)-Salir"));
        
        switch(opcion)
        {
            case 1:
                insertar();
            break;
            
            case 2:
                mostrar();
            break;
            
            case 3:
                modificar();
            break;
            
            case 4:
                eliminar();
            break;
            
            case 5:
                JOptionPane.showMessageDialog(null, "Adios gracias por\n usar el programa");
            break;
            
            default:
                JOptionPane.showMessageDialog(null, "No se eligio ninguna\n opcion anterior");
            break;
        }

    }

    public void insertar(){
        for(int i=0; i < 4; i++){
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresar valor en vector["+i+"]"));
        }
        menu();
    }
    
    public void mostrar(){
        JOptionPane.showMessageDialog(null, "El valor en vector[0] = " + vector[0] + ""
                + "\nEl valor en vector[1] = " + vector[1] + "\nEl valor en vector[2] = " + vector[2] 
                + "\nEl valor en vector[3] = " + vector[3]);
        
        menu();
    }
    
    public void modificar(){
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Posicion a modificar: "));
        
        if(opcion > 4){
            JOptionPane.showMessageDialog(null, "Esa posicion no existe\n Ingrese una posicion correcta");
            modificar();
        }
        else{
            vector[opcion] = Integer.parseInt(JOptionPane.showInputDialog("Nuevo valor en vector["+opcion+"]"));
            menu();
        }
    }
    
    public void eliminar(){
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Posicion a eliminar: "));
        
        if(opcion >= 4){
            JOptionPane.showMessageDialog(null, "Esa posicion no existe\n Ingrese una posicion correcta");
            eliminar();
        }
        else{
            vector[opcion] = 0;
            JOptionPane.showMessageDialog(null, "Se elimino el vector["+opcion+"]");
            menu();
        }
    }
    
}
