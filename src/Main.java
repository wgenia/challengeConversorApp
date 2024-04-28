import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bienvenida/o a ConversorApp");

        ConsultaConversion consulta = new ConsultaConversion();

        System.out.println("Digite el número de opción deseada ");

        String menu = """
                1- Cambiar de ARS a USD
                2- Cambiar de USD a CLP
                3- Cambiar de CLP a ARS
                9- Salir
                """;

        int opcionMenu = 0;
        Scanner tecaldo = new Scanner(System.in);
        while (opcionMenu != 9){
            System.out.println(menu);
            int opcionMenu = teclado.nextint();
            switch (opcionMenu){
                case 1:
                    System.out.println("El cambio de pesos argentinos (ARS) a dólares (USD) es:" + consulta);
                    break;
                case 2:
                    System.out.println("El cambio de dólares (USD) a pesos chilenos (CLP) es: " + consulta);
                    break;
                case 3:
                    System.out.println("El cambio de pesos chilenos (CLP) a pesos argentinos (ARS) es: " + consulta);
                    break;
                case 9:
                    System.out.println("Fin");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        }




        //Conversion conversion = consulta.buscaValor(double conversion_rates);

        //System.out.println(conversion);
    }
}