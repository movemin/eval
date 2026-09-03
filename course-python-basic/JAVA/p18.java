import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {  // sc 누수 방지
            int n = sc.nextInt();

            // 1에서 시작해 2배씩 증가, N 이하인 동안 공백 구분 출력
            long power = 1;
        
            while (power <= n) {  // 1을 입력할 시 결과값이 1이 나올 수 있게 이상으로 설정
                System.out.print(power);
                power *= 2;
                if (power <= n) System.out.print(" ");  // 다음 값이 N 이하일 때만 공백 출력 (trailing space 방지)
            }
        }
    }
}