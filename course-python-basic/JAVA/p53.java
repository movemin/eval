import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 첫 번째 입력값 최댓값으로 임시 선언
            int max = sc.nextInt();

            // 인덱스 첫 값으로 임시 선언
            int maxIndex = 1;

            // n - 1번 순회하여 정수 입력값 받기
            for (int index = 1; index < n; index++) {
                int current = sc.nextInt();
                int pos = index + 1; // 1-based 위치를 명시적으로 계산

                // 최댓값과 인덱스를 같이 갱신하기 위해 if문으로 최댓값과 인덱스 갱신
                if (current > max) {
                    max = current;
                    maxIndex = pos;
                }
            }

            // 최종 최댓값 위치 출력
            System.out.println("최댓값의 위치: " + maxIndex);
        }
    }
}