import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // [수도코드]: boolean isPrime = true;
            //            for (int i = 2; i*i <= n; i++) if (n%i==0) { isPrime=false; break; }
            //            "소수" / "소수 아님" 출력.

            // 소수 플래그 변수
            boolean isPrime = true;

            // n의 제곱근까지 순회
            for (int i = 2; i * i <= n; i++) {

                // i로 나누어 떨어지면 플래그 변수 변경 후 종료
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // 최종 결과값 삼항 연산자를 활용하여 한 줄 출력
            System.out.println(isPrime ? "소수" : "소수 아님");
        }
    }
}