import java.util.Scanner;

public class Main {

    // gcd 메서드 설계
    private static int gcd(int num1, int num2) {
        return num2 == 0 ? num1 : gcd(num2, num1 % num2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 입력받기
        int n = sc.nextInt();

        // 카운터 초기화
        long count = 0;

        // 1부터 n까지 반복
        for (int num1 = 1; num1 <= n; num1++) {

            // num1부터 n까지 반복
            for (int num2 = num1; num2 <= n; num2++) {

                // num1, num2의 gcd가 1이면 카운트
                if (gcd(num1, num2) == 1) {
                    count++;
                }
            }
        }

        // 최종 카운트 출력
        System.out.println(count);
    }
}