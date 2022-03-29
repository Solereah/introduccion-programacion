public class Main {

    public static void main(String[] args) {
        int resultado;
        resultado = suma(15, 30, 25);

        Coche miCoche = new Coche();
        miCoche.sumarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b;
    }
}
class Coche {
    public int puertas =3;

    public void sumarPuertas(){
        this.puertas++;
    }

}




