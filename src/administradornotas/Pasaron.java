/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administradornotas;

/**
 *
 * @author Miguel Zelaya
 */
public class Pasaron extends Notas {
    //privete
    public Pasaron()
    {
        super();
    }
    public void siguient()
    {
        if(this.getNotas()>=7)
        {
            System.out.println("Paso materia");
        }else
        {
            System.out.println("Reprobo la ateria");
        }
    }
}
