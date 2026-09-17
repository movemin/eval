import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 플래그 변수로 소수 판정
            boolean isPrime = true;

            // 문제 요구사항에 맞게 2부터 n-1까지 순회
            for (int divisor = 2; divisor < n; divisor++) {

                // 소수가 아니면 플래그 변수 변환
                if (n % divisor == 0) {
                    isPrime = false;
                }
            }
            
            // 삼항연산자 사용하여 가독성 증가
            System.out.println( isPrime ? "소수" : "소수 아님" );
        }
    }
}