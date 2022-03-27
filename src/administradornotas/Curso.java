/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administradornotas;

/**
 *
 * @author josue
 */
public class Curso {
    //Atributos
    
    private String nombreCurso;
    private String nombreAlumno;
    private String nombreProfesor;
    
    //Metodo constructor
    public Curso(String nombreCurso, String nombreAlumno, String nombreProfesor){
        
        this.nombreCurso = nombreCurso;
        this.nombreAlumno = nombreAlumno;
        this.nombreProfesor = nombreProfesor;
    }
    
    public Curso(){
        
    }
    
    public String getnombreCurso(){
        return nombreCurso;
    }
    
    public void setnombreCurso(String nombreCurso){
        this.nombreCurso = nombreCurso;
    }
    
    public String getnombreAlumno(){
        return nombreAlumno = nombreAlumno;
    }
    
    public void setnombreAlumno(String nombreAlumno){
        this.nombreAlumno = nombreAlumno;
    }
    
    public String getnombreProfesor(){
        return nombreProfesor;
    }
    
    public void setnombreProfesor(String nombreProfesor){
        this.nombreProfesor = nombreProfesor;
    }
}
