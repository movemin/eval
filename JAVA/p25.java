import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // 알고리즘: 3의 배수이면 스킵하여 3의 배수 제외 합 구하기
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum = 0;

            // for (1..N) 에서 i 가 3 의 배수면 continue, 그 외에는 sum 에 누적.
            for (int i = 1; i <= n; i++) {
                
                if (i % 3 == 0) {
                    continue;
                }
                sum += i;
            }

            // 끝에 "합계: <sum>" 출력.
            System.out.println("합계: " + sum);
        }
    }
}