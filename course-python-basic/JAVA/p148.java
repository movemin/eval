import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int m = sc.nextInt();
            int sum = 0;

            // 반복문으로 누적합을 하되 누적합이 m을 초과하면 종료 후 출력, 초과 x면 합계 업데이트
            for (int i = 1; ; i++) {
                    int next = sum + i;
                    if (next > m) break;
                    sum = next;
            }
            
            System.out.println(sum);
        }
    }
}