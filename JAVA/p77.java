import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int firstNum = sc.nextInt();
            int secondNum = sc.nextInt();
            
            // 입력값을 각각 시작값과 끝값으로 선언한 뒤 1 스텝으로 반복
            for (int number = firstNum; number <= secondNum; number++) {

                // 순회 숫자 이어서 출력
                System.out.print(number);

                // 마지막 숫자 외에는 뒤에 공백 붙이기
                if (number != secondNum) {
                    System.out.print(" ");
                }
            }
        }
    }
}