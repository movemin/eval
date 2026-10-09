import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        // switch 로 1~12 를 영어 달 이름으로, 그 외는 "Invalid" 출력.
        switch (month) {
            case 1:
                System.out.println("January");
                // 조건이 충족되면 switch에 속한 조건문 종료 -> cpu 절약
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default: // else와 같은 역할
                System.out.println("Invalid"); // printf → println 으로 통일: 다른 case와 출력 방식을 일관되게 맞춤
                break; // default에도 break 추가: 모든 case가 동일한 구조를 갖도록
        }
    }
}