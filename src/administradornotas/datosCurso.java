/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administradornotas;

/**
 *
 * @author josue
 */
public class datosCurso extends Curso{
    
    private int Temas;
    private int destrezaAlumno;
    private int calificacionProfesor;
    private int numAlumnos;
    private double promedio;

    public datosCurso(int Temas, int destrezaAlumno, int calificacionProfesor, int numAlumnos){
    
        this.calificacionProfesor = calificacionProfesor;
        this.destrezaAlumno = destrezaAlumno;
        this.Temas = Temas;
        this.numAlumnos = numAlumnos;
    }
    
    public int getTemas(){
        return Temas;
    }
    
    public void settemas(int temas){
        this.Temas = temas;
    }
    
    public int getdestrezaAlumno(){
        return destrezaAlumno;
    }
    
    public void setdestrezaAlumno(int destrezaAlumno){
        this.destrezaAlumno = destrezaAlumno;
    }
    
    public int getcalificacionProfesor(){
        return calificacionProfesor;
    }
    
    public void setcalificacionProfesor(int calificacionProfesor){
        this.calificacionProfesor = calificacionProfesor;
    }
    
    public int getnumAlumnos(){
        return numAlumnos;
    }
    
    public void setnumAlumnos(int numAlumnos){
        this.numAlumnos = numAlumnos;
    }
    
    public datosCurso()
    {
        super();
    }
    
    
    public void temasCurso()
    {
        if(getTemas() >= 16)
        {
            System.out.println("El curso sera de 4 periodos con 4 temas cada uno");
        }
        else{
            System.out.println("El curso sera de 3 periodos repartidos a preferencia del docente");
        }
    }
    
    public void alumno()
    {
        if(getdestrezaAlumno() <= 5)
        {
            System.out.println("Avisar al docente del estudiante para poder ayudarlo");
        }
        if (getdestrezaAlumno() > 5 && getdestrezaAlumno() <= 8 )
        {
            System.out.println("El estudiante posee una buena destreza");
        }
        if (getdestrezaAlumno() > 8 )
        {
            System.out.println("El estudiante es sobre saliente");
        }
    }
    
    //suma de todas las calificaciones
    private double sumaCal;
    
    public void calificacion()
    {
        sumaCal = getcalificacionProfesor();
        promedio = sumaCal / getnumAlumnos(); 
        if(promedio <= 7)
        {
            System.out.println("La docente tiene que ser evaluada");
        }
        else
        {
            System.out.println("Se felicita al docente por buena enseñanza");
        }
    }
}
