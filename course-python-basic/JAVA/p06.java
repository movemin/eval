import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        
        // 특정 날짜 (이퀄 연산자)에 따라 메시지 출력, 그 외에는 출력 x
        if (month == 3) { 
            System.out.println("새 학기"); 
        } else if (month == 6) {
            System.out.println("여름 방학");
        } else if (month == 9) { 
            System.out.println("2학기"); 
        } else if (month == 12) {
            System.out.println("겨울 방학");
        }
    }
}