import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int endNum = sc.nextInt();
            
            // 입력값을 각각 시작값과 끝값으로 선언한 뒤 1 스텝으로 반복
            for (int num = 1; num <= endNum; num++) {

                // 순회 숫자 이어서 출력
                System.out.print(num);

                // 마지막 숫자면 마침표, 그 외에는 쉼표+공백 출력
                if (num != endNum) {
                    System.out.print(", ");
                } else {
                    System.out.println(".");
                }
            }
        }
    }
}