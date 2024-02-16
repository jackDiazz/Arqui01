import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        int[] specifications = new int[3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su número a convertir:");
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida, ingrese un número entero válido.");
            scanner.next();
        }
        specifications[0] = scanner.nextInt();
        specifications[1] = auxMenu("Ingrese la base en la que el número se encuentra (2, 8, 10, 12):");
        specifications[2] = auxMenu("Ingrese la base a la que quiere convertir el número (2, 8, 10, 12):");
        System.out.println("Su número convertido es:");
        System.out.println(isDecimal(specifications));
    }

    public static int auxMenu(String message){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println(message);
            if(scanner.hasNextInt()){
                int input = scanner.nextInt();
                if (input == 2 || input == 8 || input == 10|| input == 16) {
                    return input;
                } else {
                    System.out.println("Entrada inválida, introducir 2, 8, ó 16.");
                    scanner.next();
                }
            } else {
                System.out.println("Entrada inválida, ingrese un número entero válido.");
                scanner.next();
            }
        }
    }

    public static String isDecimal(int[] numbers){
        if(numbers[1] % 10 == 0) {
             return toBase(numbers);
        } else {
            return toDecimal(numbers);
        }
    }

    public static String toDecimal(int[] numbers){
        int numberConverted = 0;
        // TODO: Process
        numbers[1] = numberConverted;
        return toBase(numbers);
    }
    public static String toBase(int[] numbers){
        // Devuelve un String porque el número podría ser base 16,
        // entonces para poderlo expresar.
        String numberConverted = "hola";
        // TODO: Process
        return  numberConverted;
    }
}
