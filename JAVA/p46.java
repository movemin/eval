import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int m = sc.nextInt();

            // 필요한 항 수 변수 초기화
            int count = 0;

            // 필요한 항 수를 구하기 위한 합계 초기화
            int sum = 0;

            // 종료 조건(sum > m)을 루프 헤더에 명시하여 의도를 명확히 표현
            int term = 0;
            while (sum <= m) {
                term++;        // 현재 항의 번호
                sum += term;
                count++;
            }
            
            // 합계가 m을 초과한 시점의 항 수 출력
            System.out.println("필요한 항 수: " + count);
        }
    }
}