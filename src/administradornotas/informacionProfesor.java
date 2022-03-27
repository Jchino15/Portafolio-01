/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administradornotas;

/**
 *
 * @author josue
 */
public class informacionProfesor extends Profesor{
    private String lugardeEstudio;
    private String universidad;
    private String diplomas;
    private String estadoCivil;
    private String planesFuturo;
    private String religion;
    private double salario;
    private int añosdeContrato;
    
    public informacionProfesor(String lugardeEstudio, String universidad, String diplomas, String estadoCivil,
            String planesFuturo, String religion, double salario, int añosdeContrato)
    {
        this.lugardeEstudio = lugardeEstudio;
        this.universidad = universidad;
        this.diplomas = diplomas;
        this.estadoCivil = estadoCivil;
        this.planesFuturo = planesFuturo;
        this.religion = religion;
        this.añosdeContrato = añosdeContrato;
        this.salario = salario;
    }
    
    public String getlugardeEstudio(){
        return lugardeEstudio;
    }
    
    public void setlugardeEstudio(String lugardeEstudio){
        this.lugardeEstudio = lugardeEstudio;
    }
    
    public String getuniversidad(){
        return universidad;
    }
    
    public void setuniversidad(String universidad){
        this.universidad = universidad;
    }
    
    public String getdiplomas(){
        return diplomas;
    }
    
    public void setdiplomas(String diplomas){
        this.diplomas = diplomas;
    }
    
    public String getestadoCivil(){
        return estadoCivil;
    }
    
    public void setestadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }
    
    public String getplanesFuturo(){
        return planesFuturo;
    }
    
    public void setplanesFuturo(String planesFuturo){
        this.planesFuturo = planesFuturo;
    }
    
    public String getreligion(){
        return religion;
    }
    
    public void setreligion(String religion){
        this.religion = religion;
    }
    
    public double getsalario(){
        return salario;
    }
    
    public void setsalario(double salario){
        this.salario = salario;
    }
    
    public int getañosdeContrato(){
        return añosdeContrato;
    }
    
    public void setañosdeContrato(int añosdeContrato){
        this.añosdeContrato = añosdeContrato;
    }
}

