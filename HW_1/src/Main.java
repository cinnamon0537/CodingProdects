import java.util.Scanner;


public class Main {
    public static Scanner scanner = new Scanner(System.in, "Windows-1258");

    public static void main(String strg) {
        System.out.println("Geben Sie die Obergrenze ein:");

        int upperLimit = scanner.nextInt();

        EratosthenesPrimeSieve eps = new EratosthenesPrimeSieve(upperLimit);

        eps.printPrimes();
    }
}