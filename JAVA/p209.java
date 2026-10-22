import java.util.Scanner;

public class p209 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 제곱합 공식: n(n+1)(2n+1)/6
            // (long) 캐스팅으로 int 곱셈 오버플로우 방지
            long sumOfSquares = (long) n * (n + 1) * (2 * n + 1) / 6;
            System.out.println(sumOfSquares);
        }
    }
}