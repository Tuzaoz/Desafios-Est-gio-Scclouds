import java.util.ArrayList;
import java.util.List;
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
        System.out.println("f("+n+")="+fibonacciLinear(n));
    }
    public static Integer fibonacciLinear(Integer n){
        if (n == 0) {
            return 0;
        }
        int anterior = 0;
        int atual = 1;
        for (int i = 2; i <= n; i++) {
            int prox = atual + anterior;
            anterior = atual;
            atual = prox;
        }
        return atual;
    }
}