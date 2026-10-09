import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int sum = 0, count = 0, number;
            
            // [알고리즘] do-while 로 입력. x >= 0 이면 sum, count 누적. x < 0 이면 종료.
            // count > 0 이면 "평균: %.2f" 출력, 아니면 "입력 없음".
            do {
                number = sc.nextInt();
                if (number >= 0) {
                    count++;
                    sum += number;
                }
            } while (number >= 0);
            if (count > 0) {

                // 정확하게 나누기 위해 누적합 실수 선언
                double average = (double) sum / count;
                System.out.printf("평균: %.2f", average);
            } else {
                System.out.println("입력 없음");
            }
        }
    }
}