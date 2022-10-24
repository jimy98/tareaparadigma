import javax.management.monitor.GaugeMonitor;

public class veterianaria {

       public static void main (String [] args){

          Gato g = new Gato (); 
          Perro p = new Perro ();
          System.out.println("ingresos de datos del gato:");
          g.cargarNombre ();
          g.cargarRaza ();
          g.cargarPeso ();

          System.out.println("******************************");

          System.out.println("ingresos de datos del perro:");
          p.cargarNombre ();
          p.cargarRaza ();
          p.cargarPeso ();


          System.out.println("datos de tu gato");
          g.mostrarGato ();

          System.out.println("datos de tu perro:");
          p.mostrarPerro ();






}


}




