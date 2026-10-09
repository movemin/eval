import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 자기 자신과 비교할 약수의 합 초기화
            int sum = 0;
            
            // n 나누기 2 -> 이보다 큰 자신의 약수는 없기 때문에 cpu 절약
            for (int divisor = 1; divisor <= (n / 2); divisor++) {
                if (n % divisor == 0) {
                    sum += divisor;
                }
            }

            // 같으면 완전수, 아니면 완전수 아님 출력
            if (n == sum) {
                System.out.println("완전수");
            } else {
                System.out.println("완전수 아님");
            }
        }
    }
}