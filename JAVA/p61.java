import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int firstNum = sc.nextInt();
            int secondNum = sc.nextInt();

            // 최대공약수 초기화 (1은 모든 정수의 공약수)
            int gcd = 1;

            // 순회 횟수를 입력값 중 최소값으로 저장하여 순회시 cpu 절약
            int limit = Math.min(firstNum, secondNum);

            // limit까지 순회하여 최대공약수 갱신
            for (int i = 1; i <= limit; i++) {
                if (firstNum % i == 0 && secondNum % i == 0) {
                    gcd = i;
                }
            }

            // 최종 최대공약수 출력
            System.out.println("GCD: " + gcd);
        }
    }
}