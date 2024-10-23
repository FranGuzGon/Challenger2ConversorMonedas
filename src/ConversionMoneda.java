import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class ConversionMoneda {
    public static void convertir(Moneda moneda, String exit_code, Scanner lectura) {
        System.out.println("Ingrese la cantidad a convertir");

        try {
            double cantidad = lectura.nextDouble();
            double cantidadConvertida;

            //Obtener la tasa de conversion correspondiente
            Map<String, Double> tasasConversion = moneda.conversion_rates();
            if (tasasConversion.containsKey(exit_code)) {
                double tasa = tasasConversion.get(exit_code);
                double resultado = cantidad * tasa;
                System.out.printf("La cantidad de %.2f [%s] equivale a %.2f [%s]%n", cantidad, moneda.base_code(), resultado, exit_code);
            } else {
                System.out.println("Codigo de moneda no encontrado.");

            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un número válido");
            lectura.nextLine();
        }
    }
}
