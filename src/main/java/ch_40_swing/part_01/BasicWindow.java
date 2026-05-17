package ch_40_swing.part_01;

import javax.swing.*;
import java.awt.*;

// JFrame 기초: 창 생성, 기본 설정
public class BasicWindow extends JFrame {
    public BasicWindow() {
        /*
            JFrame: 최상위 윈도우 컨테이너
            - setTitle(): 창 제목
            - setSize(): 창 크기 (픽셀)
            - setLocation() / setLocationRelativeTo(null): 화면 중앙 배치
            - setDefaultCloseOperation(): X 버튼 동작 설정
            - setVisible(true): 창 표시 (마지막에 호출)
         */
        setTitle("기초 JFrame 예제");
        setSize(400, 300);
        setLocationRelativeTo(null); // 화면 중앙
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 배경색 설정
        getContentPane().setBackground(new Color(240, 248, 255));

        // 간단한 레이블 추가
        JLabel label = new JLabel("안녕하세요, Swing!", SwingConstants.CENTER);
        label.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        label.setForeground(new Color(30, 30, 150));
        add(label);
    }

    public static void main(String[] args) {
        // EDT (Event Dispatch Thread): Swing 컴포넌트는 반드시 EDT에서 생성/조작
        SwingUtilities.invokeLater(() -> {
            BasicWindow window = new BasicWindow();
            window.setVisible(true);
        });
    }
}
