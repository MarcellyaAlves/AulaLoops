import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            count = count + 1;
        } while (count < 5);

    }
}
