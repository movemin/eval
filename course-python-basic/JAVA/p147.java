import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            // 공식을 변수에 저장한 뒤 출력
            int result = ((n + k - 1) / k) * k;
            System.out.println(result);
        }
    }
}