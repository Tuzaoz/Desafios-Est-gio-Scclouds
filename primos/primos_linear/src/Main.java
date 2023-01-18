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

        List<Integer> primos = primosLinear(n);
        System.out.println("Os números primos até "+n+"são:");
        for (Integer primo:primos
             ) {
            System.out.println(primo +"");
        }
    }
    public static List<Integer> primosLinear(int n){
        List<Integer> primos = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            boolean eprimo = true;
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    eprimo = false;
                }
            }
            if (eprimo){
                primos.add(i);
            }
        }
        return primos;
    }
}