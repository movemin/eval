import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {  // sc 누수 방지
            int start = sc.nextInt();
            int end = sc.nextInt();

            // 바깥 for : i = start..end
            for ( int i = start; i <= end; i++ ) {

                // 안쪽 for : j = 1..9, 출력 "i x j = <곱>"
                for ( int j = 1; j <= 9; j++ ) {
                    // 각 단 끝에 빈 줄 (System.out.println()) — 트레일링 빈 줄은 무시됨
                    int result = (i * j);
                    System.out.println( i + " x " + j + " = " + result );
                }
                System.out.println();
            }
        }
    }
}