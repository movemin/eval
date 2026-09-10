import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 최댓값과 최솟값 변수 초기화 -> 양수 음수에 영향받지 않도록 각각 자바 최댓값, 최솟값 저장
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            
            // 입력받은 n번 반복하여 정수 입력 받기
            for (int i = 0; i < n; i++) {
                int number = sc.nextInt();

                // 최댓값, 최솟값 갱신 -> 메서드를 활용하여 코드 간략화 및 가독성 향상
                max = Math.max(number, max);
                min = Math.min(number, min);
            }

            // 최종 최댓값, 최솟값 출력
            System.out.println("최댓값: " + max);
            System.out.println("최솟값: " + min);
        }
    }
}