import java.util.Scanner;

public class p01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 0 초과일 때 '양수입니다' 출력
        if (n > 0) {
            System.out.print("양수입니다");
        }
    }
}