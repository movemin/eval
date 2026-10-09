import java.util.Scanner;

public class Main {

    // 구조적 언어에 맞게 짝수 홀수 판별은 메소드로 분리
    private static boolean isEven(long num) {
        return num % 2 == 0;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();
            long steps = 0;
            
            // n이 1에 도달할 때까지 반복
            while (n != 1) {
                if (isEven(n)) {
                    n /= 2;
                } else {
                    n = 3 * n + 1;
                }

                // 짝수, 홀수 판별이 끝나면 카운트
                steps++;
            }

            // 최종 steps 출력
            System.out.println(steps);
        }
    }
}