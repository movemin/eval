import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 자기 자신은 무조건 약수로 가지고, 약수의 최대값이기 때문에 n으로 초기화
            int result = n;
            
            // 2부터 루트 n까지 순회하여 효율적으로 최소 진약수 갱신
            for (int number = 2; number * number <= n; number++) {
                if (n % number == 0 && number < result) {
                    result = number;
                }
            }

            // 최종 최소 진약수 출력
            System.out.println("최소 진약수: " + result);
        }
    }
}