import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 알고리즘: N 초과부터 후보를 1씩 증가시키며 소수를 2개 찾아 공백 구분 출력
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int count = 0;
            int candidate = n;

            StringBuilder result = new StringBuilder();
            
            while (count < 2) {
                candidate++;
                boolean isPrime = true;
                
                // 2부터 √candidate까지 나누어 떨어지면 소수 아님
                for (int i = 2; i * i <= candidate; i++) {
                    if (candidate % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    if (count > 0) result.append(" ");  // 후행 공백 방지: 숫자 사이에만 공백
                        result.append(candidate);
                        count++;
                }
            }
            System.out.println(result);
        }
    }
}