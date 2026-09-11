import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            
            // n번 반복하며 약수를 공백 구분으로 출력
            StringBuilder result = new StringBuilder(); // 출력 결과를 모아서 한 번에 출력
            for (int number = 1; number <= n; number++) {
                
                // 약수인지 확인
                if (n % number == 0) {
                    if (result.length() > 0) {
                        result.append(" "); // 첫 약수 이후에는 공백 먼저 추가
                    }
                    result.append(number);
                }
            }
            System.out.println(result);
        }
    }
}