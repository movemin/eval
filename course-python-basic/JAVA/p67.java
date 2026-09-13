import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            
            // 자릿수는 0 ~ 9 이므로 그 범위에서 최대값인 9로 초기화
            int min = 9;
            
            // 입력값 보존
            int t = n;
            
            // 보존값이 0 이하가 될 때까지 반복
            while (t > 0) {

                // 자릿수 최솟값 갱신
                if (t % 10 < min) {
                    min = t % 10;
                }

                // 자릿수 업데이트
                t /= 10;
            }

            // 최종 자릿수 최솟값 출력
            System.out.println("자릿수 최솟값: " + min);
        }
    }
}