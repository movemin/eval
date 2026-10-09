import javax.swing.*;
import java.awt.*;

// JFrame 상속받는 CalGUI2 클래스

// CalGUI2 클래스가 판떄기(JFrame) 기능을 사용하기 위해 상속받음
// is a 관계 -> CalGUI2는 판때기이다.
public class CalGUI2 extends JFrame {

    // 계산기 화면 구현을 위한 클래스
    // JFrame f;   // 판때기
    JButton b;  // 버튼

    JButton b0;  // 버튼
    JButton point;  // 버튼
    JButton equal;  // 버튼
    JButton plus;  // 버튼

    JButton b1;  // 버튼
    JButton b2;  // 버튼
    JButton b3;  // 버튼
    JButton minus;  // 버튼

    JButton b4;  // 버튼
    JButton b5;  // 버튼
    JButton b6;  // 버튼
    JButton multiple;  // 버튼


    JButton b7;  // 버튼
    JButton b8;  // 버튼
    JButton b9;  // 버튼
    JButton division;





    JButton clear;
    JTextField jtf; // 한줄 입력창

    public CalGUI2() {  // 생성자 목적: 멤버변수 초기화
        // f = new JFrame("계산기");
        // FlowLayout layout = new FlowLayout();   // 화면 배치 관리자: FlowLayput: 화면에 들어오는 순서대로 배치
        // this.setLayout( layout );  // 판때기 화면 배치 관리자 설정
        setLayout(null);  // 판때기에 부여되어 있는 화면 배치 정책 없앰
        b = new JButton("상속된판때기");
        b.setSize(110, 50);
        b.setLocation(180, 0);
        jtf = new JTextField(10);
        jtf.setSize(170, 50);
        jtf.setLocation(0, 0);

        b0 = new JButton("0");
        b0.setBackground(Color.CYAN);
        b0.setSize(50, 50);
        b0.setLocation(0,240);
        point = new JButton(".");;  // 버튼
        point.setBackground(Color.GREEN);
        point.setSize(50, 50);
        point.setLocation(60,240);
        equal = new JButton("=");;  // 버튼
        equal.setBackground(Color.GREEN);
        equal.setSize(50, 50);
        equal.setLocation(120,240);
        plus = new JButton("+");;  // 버튼
        plus.setBackground(Color.GREEN);
        plus.setSize(50, 50);
        plus.setLocation(180,240);

        b1 = new JButton("1");
        b1.setBackground(Color.CYAN);
        b1.setSize(50, 50);
        b1.setLocation(0,180);
        b2 = new JButton("2");
        b2.setBackground(Color.CYAN);
        b2.setSize(50, 50);
        b2.setLocation(60,180);
        b3 = new JButton("3");
        b3.setBackground(Color.CYAN);
        b3.setSize(50, 50);
        b3.setLocation(120,180);
        minus = new JButton("-");;  // 버튼
        minus.setBackground(Color.GREEN);
        minus.setSize(50, 50);
        minus.setLocation(180,180);

        b4 = new JButton("4");
        b4.setBackground(Color.CYAN);
        b4.setSize(50, 50);
        b4.setLocation(0,120);
        b5 = new JButton("5");
        b5.setBackground(Color.CYAN);
        b5.setSize(50, 50);
        b5.setLocation(60,120);
        b6 = new JButton("6");
        b6.setBackground(Color.CYAN);
        b6.setSize(50, 50);
        b6.setLocation(120,120);
        multiple = new JButton("x");;  // 버튼
        multiple.setBackground(Color.GREEN);
        multiple.setSize(50, 50);
        multiple.setLocation(180,120);

        b7 = new JButton("7");
        b7.setBackground(Color.CYAN);
        b7.setSize(50, 50);
        b7.setLocation(0,60);
        b8 = new JButton("8");
        b8.setBackground(Color.CYAN);
        b8.setSize(50, 50);
        b8.setLocation(60,60);
        b9 = new JButton("9");
        b9.setBackground(Color.CYAN);
        b9.setSize(50, 50);
        b9.setLocation(120,60);
        division = new JButton("÷");
        division.setBackground(Color.GREEN);
        division.setSize(50, 50);
        division.setLocation(180,60);
        clear = new JButton("C");
        clear.setBackground(Color.LIGHT_GRAY);
        clear.setSize(50, 230);
        clear.setLocation(240,60);
        this.add(clear);
        this.add(plus);
        this.add(minus);
        this.add(equal);
        this.add(point);
        this.add(multiple);
        this.add(division);
        this.add(jtf);      // add도 되는데 this를 쓰는 이유 제미나이에게 물어보자
        this.add(b);
        this.add(b0);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);


        this.setSize(500,500);
        this.setLocation(500, 500);    // 판때기 위차
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); // 강제종료 활성화
        this.setVisible(true);
    }
}