import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 짝수의 합 초기화
        int total = 0;

        // 시작값은 짝수 최소값인 2, 끝값은 입력값, 스텝은 2씩 증가 -> cpu 절약
        for (int i = 2; i <= n; i += 2) {
            // 짝수일 경우 복합연산
            total += i;
        }

        // 짝수의 합 출력
        System.out.printf("짝수 합: %d", total);

        // sc 누수 방지
        sc.close();
    }
}