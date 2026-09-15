import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();

            // 자릿수 0 여부는 불린형으로 저장
            boolean hasZero = false;

            // while문으로 자릿수에 0이 있으면 불린형 변경
            while (n > 0) {
                long digit = n % 10;
                if (digit == 0) {
                    hasZero = true;
                }

                // 자릿수 업데이트
                n /= 10;
            }

            // 불린형 변수를 사용하여 조건문 작성시 가독성 향상
            if (hasZero) {
                System.out.println("있음");
            } else {
                System.out.println("없음");
            }
        }
    }
}