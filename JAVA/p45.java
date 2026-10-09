import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 스캐너 누수 방지
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 공배수 개수 초기화
            int commonMultipleCount = 0;

            // 1부터 n까지 순회하고, 조건문으로 3과 5의 공배수 판별
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    commonMultipleCount++;
                }
            }

            // 최종 공배수 개수 출력
            System.out.println("공배수 개수: " + commonMultipleCount);
        }
    }
}