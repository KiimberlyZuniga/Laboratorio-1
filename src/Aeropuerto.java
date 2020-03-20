
import avion.AvionI;
import avion.Jet;


/**
 *
 * @author Kimbe
 */
public class Aeropuerto {
    //
    
    
    private final AvionI avion;
    
    public Aeropuerto(AvionI avion){
   
        this.avion = avion;
    }
    public void takeOff(){
    System.out.println("Saliendo" + avion.tipo());
    }
}
