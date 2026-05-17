package ch_40_swing.part_02;

import javax.swing.*;
import java.awt.*;

// 주요 Swing 컴포넌트 모음: JLabel, JButton, JTextField, JTextArea, JCheckBox, JComboBox
public class ComponentDemo extends JFrame {
    public ComponentDemo() {
        setTitle("Swing 컴포넌트 모음");
        setSize(450, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2, 8, 8));
        getRootPane().setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // JLabel
        add(new JLabel("이름:"));
        JTextField nameField = new JTextField("홍길동");
        add(nameField);

        // JPasswordField
        add(new JLabel("비밀번호:"));
        JPasswordField passField = new JPasswordField();
        add(passField);

        // JTextArea (스크롤 포함)
        add(new JLabel("메모:"));
        JTextArea textArea = new JTextArea(3, 20);
        textArea.setText("여기에 메모를 입력하세요.");
        add(new JScrollPane(textArea));

        // JCheckBox
        add(new JLabel("옵션:"));
        JPanel checkPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        checkPanel.add(new JCheckBox("알림 수신", true));
        checkPanel.add(new JCheckBox("자동 저장"));
        add(checkPanel);

        // JComboBox
        add(new JLabel("언어 선택:"));
        JComboBox<String> combo = new JComboBox<>(new String[]{"Java", "Python", "Go", "Kotlin"});
        add(combo);

        // JRadioButton
        add(new JLabel("등급:"));
        JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        ButtonGroup group = new ButtonGroup();
        for (String g : new String[]{"Bronze", "Silver", "Gold"}) {
            JRadioButton rb = new JRadioButton(g);
            group.add(rb);
            radioPanel.add(rb);
        }
        add(radioPanel);

        // JButton
        add(new JLabel(""));
        JButton submitBtn = new JButton("제출");
        submitBtn.setBackground(new Color(70, 130, 180));
        submitBtn.setForeground(Color.WHITE);
        submitBtn.addActionListener(e ->
            JOptionPane.showMessageDialog(this, "이름: " + nameField.getText()));
        add(submitBtn);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ComponentDemo().setVisible(true));
    }
}
