public class Main {

    public static void main(String[] args) {

            int numeroIf = -3;

            if(numeroIf < 0){
                System.out.println("La variable " + numeroIf + " es negativa");
            }
            else if(numeroIf >= 0){
                System.out.println("La variable " + numeroIf + " es positiva ");
            }


            int numeroWhile = 0;

            while(numeroWhile < 3){
                System.out.println(numeroWhile);
                numeroWhile++;
            }


            do{
            System.out.println(numeroWhile);
            numeroWhile++;
            } while(numeroWhile < 0);


            for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
                System.out.println(numeroFor);
            }

            String estacion = "OTOÑO";

            switch(estacion){
                case "PRIMAVERA":
                    System.out.println("Estamos en la primavera");
                    break;
                case "VERANO":
                    System.out.println("Estamos en el verano");
                    break;
                case "OTOÑO":
                    System.out.println("Estamos en el otoño");
                    break;
                case "INVIERNO":
                    System.out.println("Estamos en el invierno");
                    break;
                default:
                    System.out.println("No es una estación valida");
            }


    }




}
