/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administradornotas;

import java.util.ArrayList;

/**
 *
 * @author Miguel Zelaya
 */
public class SeparacionSexo extends Alumno {
    private String institucion;
    private String NIT;

    public SeparacionSexo(String institucion, String NIT) {
        this.institucion = institucion;
        this.NIT = NIT;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }
    
    public SeparacionSexo()
    {
        super();
        
    }
    
    //Metodo para separar los sexos
    public void SepSexo(){
        String tipo= this.getSexo();
        ArrayList guardarF = new ArrayList();
        ArrayList guardarM= new ArrayList();
        if("F".equals(tipo))
        {
            for(int i=0;i<100;i++)
            {
                guardarF.add(tipo);
            } 
        }else
        {
            
            for(int i=0;i<100;i++)
            {
                guardarM.add(tipo);
            } 
        }
        System.out.println("El listado de todas las alumnas de la institución "+this.getInstitucion() + " femeninas es: "+guardarF);
        System.out.println("El listado de todas las alumnos de la institución "+this.getInstitucion() +" masculinos es: "+guardarM);
        
    } 
    
}
