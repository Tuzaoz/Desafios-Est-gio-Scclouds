import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da Sequência de Fibonacci:");
        int n = sc.nextInt();
        while (n < 0) {
            System.out.println("Digite novamente um número >= 0");
            n = sc.nextInt();
        }
        System.out.println("f("+n+")="+fibonacciRecursivo(n));

    }
    public static Integer fibonacciRecursivo(int n){
        if (n == 0) {
            return 0;
        }else if (n == 1){
            return 1;
        } else return fibonacciRecursivo(n-1) + fibonacciRecursivo(n -2);

    }
}