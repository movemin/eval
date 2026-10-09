import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // while문과 나누기 연산자를 사용하여 글자 수를 카운트하고, 나눴을 때 0이 되는 경우는 break
        int digitCount = 0;
        while (n > 0) {
            n /= 10;
            digitCount++;
        }
        System.out.println(digitCount + "자리");

        // sc 누수 방지
        sc.close();
    }
}