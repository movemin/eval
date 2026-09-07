import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            // 수도코드: 카운트 초기화; 배수 대상값부터 마지막 값까지 반복; 반복하는 동안 카운트
            int count = 0;

            for (int i = k; i <= n; i += k) {
                count ++;
            }
            
            System.out.printf("%d의 배수 개수: %d", k, count);
        }
    }
}