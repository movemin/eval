import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 나머지를 구할 값을 n을 저장하여 보존
            int reminding = n;

            // 맨 앞자리를 나누었을 때 10 미만이 되어야 한 자리수가 나오기 때문에 10 이상일 때까지 반복
            while (reminding >= 10) {

                // 자리수 업데이트
                reminding /= 10;
            }

            // 최종값 출력
            System.out.println("맨 앞 자리: " + reminding);
        }
    }
}