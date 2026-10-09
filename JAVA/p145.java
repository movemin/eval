import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 누수 방지
        sc.close();

        // 첫번째 값은 무조건 1 -> 그 다음 출력
        long c = 1;
        System.out.print(c);

        // 1부터 n까지 순회
        for (long k = 1; k <= n; k++) {

            // 증분 공식으로 업데이트 후 출력
            c = c * (n - k + 1) / k;
            System.out.print(" " + c);
        }
        
        // 후의 작성하는 코드를 대비하여 위의 코드가 끝나면 줄바꿈
        System.out.println();
    }
}