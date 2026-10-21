import java.util.Scanner;

class CountBitOne {
    // 인스턴스 생성 불필요 — 유틸리티 클래스
    private CountBitOne() {}

    // 비트 연산으로 1의 개수를 카운트 (표준 API 활용 버전)
    public static int countOneBits(int n) {
        return Integer.bitCount(n);
    }
}

public class p202 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            long total = 0;
            for (int num = 1; num <= n; num++) {
                total += CountBitOne.countOneBits(num);
            }
            System.out.println(total);
        }
    }
}