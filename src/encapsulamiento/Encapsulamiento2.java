package encapsulamiento;

public class Encapsulamiento2 {
    public static void main(String[] args) {
        Encapsulamiento objeto1 = new Encapsulamiento();
        objeto1.atributo1 = 15;//No hay error al acceder al atributo1, porque es default
        objeto1.atributo2 = 29;//No hay error al acceder al atributo2, porque es public
        
        objeto1.setEdad(14);//Se puede acceder a los atributos privados de esta forma
        System.out.println("La edad es "+objeto1.getEdad());
        
        objeto1.setNombre("Victor");
        System.out.println("El nombre es "+objeto1.getNombre());
    }
}
