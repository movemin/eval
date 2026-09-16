import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long firstTerm = sc.nextInt();
            long ratio = sc.nextInt();
            int termCount = sc.nextInt();

            // 카운트 변수와 시작값 보존 변수 저장
            int count = 0;
            long term = firstTerm;

            // n번 전부 순회할 때까지 반복
            for (int i = 0; i < termCount; i++) {

                // 현재 정수 저장
                System.out.print(term);

                // 등비수열 반영을 위한 곱셈 연산
                term *= ratio;

                // 마지막 값이 아닌 경우 공백도 같이 출력
                if (i < termCount - 1) {
                    System.out.print(" ");
                }
            }
        }
    }
}