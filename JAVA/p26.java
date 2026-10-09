import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int maxNum = sc.nextInt();

            // for (1..N) 에서 짝수면 continue, 홀수면 공백 구분으로 출력
            // boolean 플래그로 구분자 처리: 첫 홀수 앞에는 공백을 붙이지 않음
            boolean first = true;
            for (int i = 1; i <= maxNum; i++) {
                if (i % 2 == 0) {
                    continue;
                }
                if (!first) {
                    System.out.print(" "); // 두 번째 홀수부터 앞에 공백을 붙여 후행 공백 방지
                }
                System.out.print(i);
                first = false;
            }
        }
    }
}