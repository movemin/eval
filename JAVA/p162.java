import java.util.Scanner;

public class Main {

    // GCD(최대공약수)를 구하는 메서드: gcd(a, b) = gcd(b, a % b)
    private static int gcd(int num1, int num2) {
        return num2 == 0 ? num1 : gcd(num2, num1 % num2);
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            
            // 클래스 메모리에 있는 최대공약수 메서드를 두번 호출하여 세 개의 정수도 대비하여 출력
            int gcdAB  = gcd(num1, num2);
            int gcdABC = gcd(gcdAB, num3);
            System.out.println("GCD: " + gcdABC);
        }
    }
}