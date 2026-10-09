import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int value = sc.nextInt();
            int base = sc.nextInt();
            
            // 진수를 구하고자 하는 값이 0이면 0출력(모든 진수의 0은 0)
            if (value == 0) {
                System.out.println("0");

            // 아니면 진수를 구하기 위해 결과값 초기화
            } else {
                String result = "";

                // 계속 나눠 업데이트 되어 0이 될 때까지 반복
                while (value > 0) {
                    result = (value%base) + result;
                    value /= base;
                    
                }

                // 결과값 출력
                System.out.print(result);
            }
        }
    }
}