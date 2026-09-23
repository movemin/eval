import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long firstNum = sc.nextInt();
            long commonRate = sc.nextInt();
            int termIndex = sc.nextInt();

            // 등비수열 결과값 초기화 (곱셈이므로 long 타입)
            long term = firstNum;

            // 항 번호만큼 반복
            for (int i = 1; i < termIndex; i++) {
                term *= commonRate;
            }

            // 결과값 출력
            System.out.println(termIndex + "번째 항: " + term);
        }
    }
}