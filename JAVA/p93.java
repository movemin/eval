import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long binary = sc.nextLong();
            
            // 10진수 변환 결과 초기화
            long result = 0;  // int → long: 큰 2진수 입력 시 오버플로우 방지
            long power = 1;   // int → long: result와 타입 일관성 유지

            // 나머지가 0이 될 때까지 반복하여 10진수 변환
            while (binary > 0) {
                result += (binary % 10) * power;
                power *= 2;
                binary /= 10;
            }
            System.out.println(result);
        }
    }
}