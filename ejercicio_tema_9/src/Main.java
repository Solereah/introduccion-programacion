public class Main {

    public static void main(String[] args){
    Cliente cliente = new Cliente();
    Trabajador trabajador = new Trabajador();

    cliente.edad = 35;
    cliente.nombre ="Pedro";
    cliente.telefono = 591131834;
    cliente.credito = 550.70;

        System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años y mi telefono es " + cliente.telefono
                + " y mi credito disponible es " + cliente.credito + "€");

    trabajador.edad = 27;
    trabajador.nombre = "Juan";
    trabajador.telefono = 591145678;
    trabajador.salario = 2345.60;

        System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi telefono es " + trabajador.telefono
                + " y mi salario es de " + trabajador.salario + "€");



    }



}

class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona{
    double salario;
}