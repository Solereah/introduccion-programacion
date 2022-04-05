public class Main {

    public static void main(String[] args){
    Cliente cliente = new Cliente();

    cliente.edad = 35;
        System.out.println("Tiene " + cliente.edad + " años" );

    cliente.nombre ="Pedro";
        System.out.println("Su nombre es "+ cliente.nombre);

    cliente.telefono = 591131834;
        System.out.println("Su numero de telefono es " + cliente.telefono);

    cliente.credito = 500;
        System.out.println("Su credito es de " + cliente.credito);

  
    }



}

class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}