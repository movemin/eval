import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        // switch fall-through 로 1~5 를 "평일", 6~7 을 "주말" 로 묶어 출력.
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:  // break 없이 다음 case로 fall-through → 1~5 모두 여기서 출력
                System.out.println("평일");
                break;
            case 6:
            case 7:  // break 없이 다음 case로 fall-through → 6~7 모두 여기서 출력
                System.out.println("주말");
                break;
            default:  // 마지막 케이스는 break 생략 가능
                System.out.println("잘못된 입력");
        }

        sc.close();  // Scanner 자원 명시적 해제
    }
}