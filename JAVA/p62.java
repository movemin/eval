import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int firstNum = sc.nextInt();
            int secondNum = sc.nextInt();
            
            // 개수 초기화
            int count = 0;

            // 1부터 n까지 반복하여 둘 중 하나라도 배수라면 카운트
            for (int i = 1; i <= n; i++) {
                if (i % firstNum == 0 || i % secondNum == 0) {
                    count++;
                }
            }

            // 최종 개수 출력
            System.out.println("개수: " + count);
        }
    }
}