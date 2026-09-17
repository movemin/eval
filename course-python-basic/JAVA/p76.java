import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 모두 짝수 인지 여부를 확인하는 불린형을 통해 출력문 가독성 향상
        boolean allEven = true;

        // 자릿수가 끝날 때까지 반복
        while (n > 0) {

            // 홀수가 있으면 불린형 변경
            if (n % 2 != 0) {
                allEven = false;
            }

            // 자릿수 업데이트
            n /= 10;
        }

        // 홀수가 하나라도 있으면 홀수 포함 출력
        if (allEven) {
            System.out.println("모두 짝수");
        } else {
            System.out.println("홀수 포함");
        }
    }
}