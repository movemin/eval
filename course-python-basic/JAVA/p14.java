import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int isMember = sc.nextInt();
        int amount = sc.nextInt();
        // 1단계: 회원 여부 확인
        // 2단계: 회원이면 금액이 1만원 이상인지 확인
        if (isMember == 1) {
            if (amount >= 10000) {
                System.out.println("10% 할인 대상");
            } else {
                System.out.println("할인 대상 아님");
            }
        } else {
            System.out.println("회원만 할인 가능");
        } 
    }
}