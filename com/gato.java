import unlar.com.animal;

public class gato extends animal{

    
    public void cargarNombre (){
           System.out.println("ingresar el nombre del animal");
           nombre = entrada.nextLine();

    }

    public void cargarPeso (){
        System.out.println("ingresar el PESO del animal");
        peso = entrada.nextDouble();
    }
    
    public void cargarRaza (){
        System.out.println("ingresar la Raza del animal");
        raza = entrada.nextLine();
    }
}