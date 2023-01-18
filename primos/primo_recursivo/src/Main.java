import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para retornar todos os números primos até ele: ");
        int n = sc.nextInt();
        while (n <= 1) {
            System.out.println("Digite novamente um número > 1");
            n = sc.nextInt();
        }

        List<Integer> primos = primosRecursivo(n);
        System.out.println("Os números primos até "+n+" são:");
        for (Integer primo:primos
        ) {
            System.out.println(primo +"");
        }
    }
    public static List<Integer> primosRecursivo(int n){
        List<Integer> primos = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (eprimo(i)) {
                primos.add(i);
            }
        }
        return primos;
    }
    private static boolean eprimo(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        return eprimo(n, 2);
    }
    private static boolean eprimo(int n, int divisor) {
        if (divisor > Math.sqrt(n)) {
            return true;
        }

        if (n % divisor == 0) {
            return false;
        }
        return eprimo(n, divisor + 1);
    }
}
