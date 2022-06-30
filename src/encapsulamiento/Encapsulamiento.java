package encapsulamiento;

public class Encapsulamiento {
    //Encapsulamiento se trata de ocultar los atributos o metodos
    //Para acceder a atributos privados, se usan Getters y Setters
    
    //No tiene modificador de acceso
    int atributo1;//Se puede acceder desde clases del mismo paquete
    public int atributo2;//Se puede acceder desde cualquier parte
    private int atributo3;//Solo puede acceder desde la misma clase
    
    private int edad;
    private String nombre;
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
