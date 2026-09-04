import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber;
        
        // do-while문으로 1이상 100이하일 때까지 입력값받고 그 범위안에 들어올 시 출력
        do {
            inputNumber = sc.nextInt();  // 1 미만이거나 100 초과이면 재입력
        } while (inputNumber < 1 || inputNumber > 100);
        
        System.out.println("입력값: " + inputNumber);
        sc.close(); // Scanner 자원 해제
    }
}