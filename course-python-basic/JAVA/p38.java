import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 수도코드: 약수 개수 초기화; 1부터 √n까지 반복; 약수일 시 쌍으로 카운트; 카운트 출력
            int count = 0;

            // O(√N) 최적화: i와 n/i를 쌍으로 처리
            for (int i = 1; (long) i * i <= n; i++) {
                if (n % i == 0) {
                    count++; // i 자체가 약수
                    if (i != n / i) {
                        count++; // n/i 도 약수 (중복 방지)
                    }
                }
            }
            
            System.out.println("약수 개수: " + count);
        }
    }
}