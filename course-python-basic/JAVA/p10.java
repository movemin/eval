import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        // switch와 case, break, default를 활용하여
        // 1부터 7까지 각 요일 / 한국어 영어 형식으로 출력
        switch (day) {
            case 1:
                System.out.println("월요일 / Monday");
                break;  // 조건에 해당하면 종료 시켜 cpu 낭비 방지
            case 2:
                System.out.println("화요일 / Tuesday");
                break;
            case 3:
                System.out.println("수요일 / Wednesday");
                break;
            case 4:
                System.out.println("목요일 / Thursday");
                break;
            case 5:
                System.out.println("금요일 / Friday");
                break;
            case 6:
                System.out.println("토요일 / Saturday");
                break;
            case 7:
                System.out.println("일요일 / Sunday");
                break;
            default:
                System.out.println("잘못된 입력");
                break;  // 코드의 통일성
        }
    }
}