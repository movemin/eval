import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        // 바깥 for : rows 번, 안쪽 for : cols 번 print("*"). 행 끝에 줄바꿈.
        for (int i = 1 ; i <= rows ; i++) {
            for (int j = 1 ; j <= cols ; j++) {
                System.out.print("*");  // 안쪽 for문은 붙여서 출력
            }
            System.out.println();       // 줄 바꿈
        }
    }
}