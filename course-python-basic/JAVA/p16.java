import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 팩토리얼 변수 저장공간 큰 값을 대비하여 long 타입으로 초기화
        long factorial = 1;

        // 시작값은 1로 시작하고 끝값은 n으로 하여 스텝은 1씩 증가
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        // format 형식을 사용하여 가독성 향상
        System.out.printf("%d! = %d", n, factorial);

        // sc 누수 방지
        sc.close();
    }
}