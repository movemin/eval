import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int startNum = sc.nextInt();
            int step = sc.nextInt();
            int n = sc.nextInt();

            // 카운트 변수와 시작값 보존 변수 저장
            int count = 0;
            int term = startNum;

            // n번 전부 순회할 때까지 반복
            while (count < n) {

                // 횟수 업데이트
                count++;

                // 현재 정수 저장
                System.out.print(term);

                // 수열 반영을 위한 스텝 연산
                term += step;

                // 마지막 값이 아닌 경우 공백도 같이 출력
                if (count != n) {
                    System.out.print(" ");
                }
            }
        }
    }
}