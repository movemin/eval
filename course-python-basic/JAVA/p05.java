import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        
        // if-else if문을 사용하여 75미만은 아무 값도 출력 안하게 설계
        if (score >= 95) {
            System.out.println("전액 장학금");
        } else if (score >= 85) {
            System.out.println("반액 장학금");
        } else if (score >= 75) {
            System.out.println("기숙사 장학금");

        }
    }
}