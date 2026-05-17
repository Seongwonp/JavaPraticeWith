package ch_40_swing.part_04;

import javax.swing.*;
import java.awt.*;

// 레이아웃 매니저: BorderLayout, GridLayout, FlowLayout, BoxLayout
public class LayoutDemo extends JFrame {
    public LayoutDemo() {
        setTitle("레이아웃 매니저 예제");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 탭 패널로 각 레이아웃 비교
        JTabbedPane tabs = new JTabbedPane();

        // BorderLayout: 5구역 (North/South/East/West/Center)
        JPanel borderPanel = new JPanel(new BorderLayout(5, 5));
        borderPanel.add(makeColoredLabel("NORTH",  Color.RED),    BorderLayout.NORTH);
        borderPanel.add(makeColoredLabel("SOUTH",  Color.BLUE),   BorderLayout.SOUTH);
        borderPanel.add(makeColoredLabel("WEST",   Color.GREEN),  BorderLayout.WEST);
        borderPanel.add(makeColoredLabel("EAST",   Color.ORANGE), BorderLayout.EAST);
        borderPanel.add(makeColoredLabel("CENTER", Color.GRAY),   BorderLayout.CENTER);
        tabs.addTab("BorderLayout", borderPanel);

        // GridLayout: 균등 격자
        JPanel gridPanel = new JPanel(new GridLayout(3, 3, 5, 5));
        for (int i = 1; i <= 9; i++) {
            gridPanel.add(makeColoredLabel("(" + i + ")",
                    new Color((i * 30) % 256, (i * 70) % 256, (i * 110) % 256)));
        }
        tabs.addTab("GridLayout", gridPanel);

        // FlowLayout: 왼쪽→오른쪽 순서대로 배치
        JPanel flowPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        String[] sizes = {"Small", "Medium-sized", "Big Button", "Tiny", "Wide Button Here"};
        for (String s : sizes) {
            JButton b = new JButton(s);
            b.setBackground(new Color(173, 216, 230));
            flowPanel.add(b);
        }
        tabs.addTab("FlowLayout", flowPanel);

        // BoxLayout: 수직 정렬
        JPanel boxPanel = new JPanel();
        boxPanel.setLayout(new BoxLayout(boxPanel, BoxLayout.Y_AXIS));
        boxPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        for (String label : new String[]{"항목 1", "항목 2", "항목 3"}) {
            JButton b = new JButton(label);
            b.setAlignmentX(Component.CENTER_ALIGNMENT);
            boxPanel.add(b);
            boxPanel.add(Box.createVerticalStrut(10)); // 수직 간격
        }
        tabs.addTab("BoxLayout", boxPanel);

        add(tabs);
    }

    private JLabel makeColoredLabel(String text, Color color) {
        JLabel label = new JLabel(text, SwingConstants.CENTER);
        label.setOpaque(true);
        label.setBackground(color);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("맑은 고딕", Font.BOLD, 14));
        label.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        return label;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LayoutDemo().setVisible(true));
    }
}
