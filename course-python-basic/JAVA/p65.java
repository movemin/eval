import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 카운트 변수 초기화
            int count = 0;

            // 1부터 루트 n까지의 약수 개수 구하기
            for (int i = 1; i*i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            // 최종 약수 쌍의 개수 출력
            System.out.println("약수 쌍 개수: " + count);
        }
    }
}