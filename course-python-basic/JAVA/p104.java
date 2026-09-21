import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int target = sc.nextInt();
            int number, count = 0;

            // [알고리즘]
            // 목표 정수와 같을 때까지 반복
            // 목표 정수와 비교할 정수를 입력받고 카운트 누적합
            do {
                number = sc.nextInt();
                count++;
            } while (number != target);

            // 가독성 좋게 출력 메서드 두번 불러서 출력
            System.out.println("도달");
            System.out.println("시도 횟수: " + count);
        }
    }
}