import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 소수 개수 변수
            int count = 0;

            // 2부터 n까지 순회
            for (int candidate = 2; candidate <= n; candidate++) {
                
                // 각 심사 숫자의 플래그 변수를 초기화하기 위해 바깥 반복문에서 초기화
                boolean isPrime = true;

                // 2부터 n의 제곱근까지 순회
                for (int divisor = 2; divisor * divisor <= candidate; divisor++) {

                    // 소수가 아니면 플래그 변수 변경 후 종료
                    if (candidate % divisor == 0) {
                        isPrime = false;
                        break;
                    }
                }

                // 소수인 경우 카운트 누적
                if (isPrime) {
                    count++;
                }
            }

            // 구문이 끝나면 개수 출력
            System.out.println("개수: " + count);
        }
    }
}