import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int sentinel = sc.nextInt();

            // 개수와 합계 저장
            int count = 0;
            long sum = 0;

            // sentinel을 만날 때까지 정수를 입력받아 합산  ← 주석을 실제 동작과 일치하도록 수정
            while (true) {
                int x = sc.nextInt();
                if (x == sentinel) {
                    break;
                }

                sum += x;
                count++;
            }

            // 카운트가 0 초과이면 평균 출력, 아니면 "입력 없음" 출력
            if (count > 0) {
                double average = (double) sum / count;
                System.out.printf("평균: %.2f%n", average);
            } else {
                System.out.printf("입력 없음%n");
            }
        }
    }
}