import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int opcion = 0;
        while (opcion != 7) {
            System.out.println("******************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda =]");

            System.out.println("1.) Dolar =>> Peso argentino");
            System.out.println("2.) Peso argentino =>> Dolar");
            System.out.println("3.) Dolar =>> Real brasileño");
            System.out.println("4.) Real brasileño =>> Dolar");
            System.out.println("5.) Dolar  =>> Peso Colombiano");
            System.out.println("6.) Peso colombiano =>> Dolar");
            System.out.println("7.) Salir");
            System.out.println("Elija una opción válida:");
            System.out.println("******************************");

            try {
                opcion = lectura.nextInt();
                lectura.nextLine();

                switch (opcion) {

                    case 1:
                        ConversionMoneda.convertir(consulta.buscaMoneda("USD"), "ARS", lectura);
                        break;


                    case 2:
                        ConversionMoneda.convertir(consulta.buscaMoneda("ARS"), "USD", lectura);
                        break;

                    case 3:
                        ConversionMoneda.convertir(consulta.buscaMoneda("USD"), "BRL", lectura);
                        break;

                    case 4:
                        ConversionMoneda.convertir(consulta.buscaMoneda("BRL"), "USD", lectura);
                        break;

                    case 5:
                        ConversionMoneda.convertir(consulta.buscaMoneda("USD"), "COP", lectura);
                        break;

                    case 6:
                        ConversionMoneda.convertir(consulta.buscaMoneda("COP"), "USD", lectura);
                        break;

                    case 7:
                        System.out.println("Saliendo");
                        break;

                    default:
                        System.out.println("Opcion no válida");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido para elegir la opcion");
                lectura.nextLine();
            }
        }

            lectura.close();

    }

}
