import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        // switch fall-through 로 31일/30일 케이스를 묶고,
        // 2 는 28일, default 는 "잘못된 월" 출력.
        switch (month) {
            case 1:  // 충족 여부와 관계 없이 밑에 코드를 읽어 충족하면 출력문 실행
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31일");
                break;  // 해당 출력이 끝나면 코드 읽기 중단
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30일");
                break;
            case 2:
                System.out.println("28일");
                break;
            default:
                System.out.println("잘못된 월"); // 마지막 케이스이므로 break 생략 가능
        }
    }
}