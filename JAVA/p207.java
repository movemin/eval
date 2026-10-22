import java.util.Scanner;

public class p207 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextInt();
            
            // 삼각수 판정: k를 1부터 증가시키며 k*(k+1)/2 계산
            for (int k = 1; ; k++) {
                long triNum = (long) k * (k + 1) / 2;

                if (triNum == n) {
                    System.out.println(k);
                    break;
                }

                if (triNum > n) {
                    System.out.println("아님");
                    break;
                }
            }
        }
    }
}