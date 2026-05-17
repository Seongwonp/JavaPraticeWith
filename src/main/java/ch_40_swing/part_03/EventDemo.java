package ch_40_swing.part_03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// 이벤트 처리: ActionListener, MouseListener, KeyListener
public class EventDemo extends JFrame {
    private JLabel statusLabel;
    private int clickCount = 0;

    public EventDemo() {
        setTitle("이벤트 처리 예제");
        setSize(500, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // 상태 표시 레이블
        statusLabel = new JLabel("버튼을 클릭하거나 마우스를 움직여 보세요", SwingConstants.CENTER);
        statusLabel.setBorder(BorderFactory.createLoweredBevelBorder());
        add(statusLabel, BorderLayout.SOUTH);

        // 중앙 패널
        JPanel center = new JPanel(new FlowLayout());

        // ActionListener: 버튼 클릭
        JButton btn = new JButton("클릭 카운터");
        btn.addActionListener(e -> {
            clickCount++;
            statusLabel.setText("클릭 횟수: " + clickCount);
        });

        // MouseListener: 마우스 이벤트
        JLabel mouseArea = new JLabel("[ 마우스 영역 ]", SwingConstants.CENTER);
        mouseArea.setPreferredSize(new Dimension(200, 80));
        mouseArea.setOpaque(true);
        mouseArea.setBackground(Color.LIGHT_GRAY);
        mouseArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        mouseArea.addMouseListener(new MouseAdapter() {
            @Override public void mouseEntered(MouseEvent e) {
                mouseArea.setBackground(new Color(144, 238, 144));
                statusLabel.setText("마우스 진입");
            }
            @Override public void mouseExited(MouseEvent e) {
                mouseArea.setBackground(Color.LIGHT_GRAY);
                statusLabel.setText("마우스 이탈");
            }
            @Override public void mouseClicked(MouseEvent e) {
                statusLabel.setText("마우스 클릭 (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        center.add(btn);
        center.add(mouseArea);

        // KeyListener: 입력 감지
        JTextField keyField = new JTextField(15);
        keyField.addKeyListener(new KeyAdapter() {
            @Override public void keyReleased(KeyEvent e) {
                statusLabel.setText("입력: \"" + keyField.getText() + "\"  (" + keyField.getText().length() + "자)");
            }
        });

        JPanel top = new JPanel();
        top.add(new JLabel("키 입력: "));
        top.add(keyField);
        add(top, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EventDemo().setVisible(true));
    }
}
