import java.util.Scanner;

public class p184 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 서로소인 정수의 개수 초기화
            int count = 0;

            // 1부터 n까지 반복
            for (int num = 1; num <= n; num++) {

                // 인라인 유클리드 호제법으로 gcd(n, num) 계산
                int gcdA = n, gcdB = num;
                while (gcdB != 0) {
                    int remainder = gcdB;
                    gcdB = gcdA % gcdB;
                    gcdA = remainder;
                }
                // gcd가 1이면 서로소 → 카운트 증가
                if (gcdA == 1) {
                    count++;
                }
            }

            // 카운트 출력
            System.out.println(count);
        }
    }
}