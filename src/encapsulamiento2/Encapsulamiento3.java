package encapsulamiento2;
//Quiero acceder a los atributos de otro paquete, tengo que importarlo
import encapsulamiento.Encapsulamiento;

public class Encapsulamiento3 {
    public static void main(String[] args) {
        Encapsulamiento objeto1 = new Encapsulamiento();
        
        //objeto1.atributo1 = 15; Esta linea dice que atributo1 debe ser publico para poder acceder asi
        objeto1.atributo2 = 20;//Al ser atributo publico, se puede modificar desde este paquete
    }
}
