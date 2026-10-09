import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 인치 센치 변환시 단위 상수화
        final double inch_to_cm = 2.54;
        try (Scanner sc = new Scanner(System.in)) {
            double inch = sc.nextDouble();
            
            // 인치를 cm로 변환하여 저장한 뒤 출력
            double cm = inch * inch_to_cm;
            System.out.printf("%.2f cm%n", cm);
        }
    }
}