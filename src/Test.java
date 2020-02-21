
/**
 *
 * @author Kimbe
 */

import avion.Avioneta;
import avion.Jet;
import carro.Carro;
import carro.Sedan;
import carro.Suv;

public class Test {
    //
    
    private void ejecutarCarro(){
        //composicion por que estoy creamdo en la clase test un carro
     Carro carro = new Sedan(); //polimorfismo 
        carro.imprimir();
        
        //carro.tipo();
        carro = new Suv();
        carro.imprimir();
    }
    
     private static void ejecutarAvion(){
         
         //inyectando un jet al aeropuerto
     Aeropuerto aeropuerto = new Aeropuerto(new Jet());
     aeropuerto.takeOff();
     
     //inyectanndo una avioneta al aeropuerto
     aeropuerto = new Aeropuerto(new Avioneta());
     aeropuerto.takeOff();
     }
    public static void main(String[] args){
        ejecutarAvion();
       
       //new Test ().ejecutar();
        
    }
    
}
