import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int inputNum;

            // 양수 받을 때까지 반복 입력
            do {
                inputNum = sc.nextInt();
            } while (inputNum <= 0);

            // 양수를 받으면 받은 양수값 출력
            System.out.println("입력값: " + inputNum);
        }
    }
}