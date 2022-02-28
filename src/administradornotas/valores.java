/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administradornotas;

/**
 *
 * @author josue
 */
public class valores implements comparar{
    
    public valores(){
        
    }

    @Override
    public void mayornota(){
        System.out.print("El primer numero es el mayor");
    }
    
    @Override
    public void menornota(){
        System.out.print("El primer numero es el menor");
    }
}
