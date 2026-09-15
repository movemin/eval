import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int firstNum = sc.nextInt();
            int secondNum = sc.nextInt();

            // 시작값을 두번째 값으로, 마지막 값을 첫번째 값으로, 스탭은 1씩 빼기
            for (int number = secondNum; number >= firstNum; number--) {

                // 순회 숫자 이어서 출력
                System.out.print(number);

                // 마지막 숫자 외에는 뒤에 공백 붙이기
                if (number != firstNum) {
                    System.out.print(" ");
                }
            }
        }
    }
}