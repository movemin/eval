import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double heightCm = sc.nextDouble();
        double weightKg = sc.nextDouble();
        
        // 키 m 변환하여 변수 선언 밑 bmi 변수 선언
        double heightM = heightCm / 100.0;
        double bmi = weightKg / (heightM * heightM);

        // 조건문에 따라 상태 프린트 -> 형식 문자열을 활용하여 가독성 향상
        if (bmi < 18.5) {
           System.out.printf("BMI: %.2f → 저체중", bmi);
        } else if (bmi < 23) {
            System.out.printf("BMI: %.2f → 정상", bmi);
        } else if (bmi < 25) {
            System.out.printf("BMI: %.2f → 과체중", bmi);
        } else {
            System.out.printf("BMI: %.2f → 비만", bmi);
        }
    }
}