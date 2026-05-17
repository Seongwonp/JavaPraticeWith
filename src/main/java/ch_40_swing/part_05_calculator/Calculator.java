package ch_40_swing.part_05_calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// 미니 프로젝트 1: 계산기 (GridLayout + 이벤트 처리)
public class Calculator extends JFrame {
    private JTextField display;
    private StringBuilder currentInput = new StringBuilder();
    private double prevValue = 0;
    private String operator = "";
    private boolean newInput = true;

    public Calculator() {
        setTitle("계산기");
        setSize(280, 380);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(5, 5));
        getRootPane().setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // 디스플레이
        display = new JTextField("0");
        display.setFont(new Font("맑은 고딕", Font.BOLD, 28));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setBackground(Color.WHITE);
        display.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        add(display, BorderLayout.NORTH);

        // 버튼 패널
        JPanel btnPanel = new JPanel(new GridLayout(5, 4, 5, 5));

        String[] buttons = {
            "C", "±", "%", "÷",
            "7", "8", "9", "×",
            "4", "5", "6", "−",
            "1", "2", "3", "+",
            "0", ".", "←", "="
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
            btn.setFocusPainted(false);

            if (text.equals("=")) {
                btn.setBackground(new Color(255, 149, 0));
                btn.setForeground(Color.WHITE);
            } else if ("÷×−+".contains(text)) {
                btn.setBackground(new Color(210, 210, 210));
            } else if ("C±%".contains(text)) {
                btn.setBackground(new Color(180, 180, 180));
            } else {
                btn.setBackground(Color.WHITE);
            }

            btn.addActionListener(this::handleButton);
            btnPanel.add(btn);
        }

        add(btnPanel, BorderLayout.CENTER);
    }

    private void handleButton(ActionEvent e) {
        String cmd = ((JButton) e.getSource()).getText();
        switch (cmd) {
            case "0","1","2","3","4","5","6","7","8","9" -> {
                if (newInput) { display.setText(cmd); newInput = false; }
                else if (!display.getText().equals("0")) display.setText(display.getText() + cmd);
                else display.setText(cmd);
            }
            case "." -> {
                if (!display.getText().contains(".")) display.setText(display.getText() + ".");
            }
            case "C" -> { display.setText("0"); operator = ""; prevValue = 0; newInput = true; }
            case "←" -> {
                String t = display.getText();
                display.setText(t.length() > 1 ? t.substring(0, t.length() - 1) : "0");
            }
            case "±" -> {
                double v = Double.parseDouble(display.getText());
                display.setText(formatResult(-v));
            }
            case "%" -> {
                double v = Double.parseDouble(display.getText());
                display.setText(formatResult(v / 100));
            }
            case "+","−","×","÷" -> {
                prevValue = Double.parseDouble(display.getText());
                operator = cmd;
                newInput = true;
            }
            case "=" -> {
                double cur = Double.parseDouble(display.getText());
                double result = switch (operator) {
                    case "+" -> prevValue + cur;
                    case "−" -> prevValue - cur;
                    case "×" -> prevValue * cur;
                    case "÷" -> cur != 0 ? prevValue / cur : Double.NaN;
                    default  -> cur;
                };
                display.setText(Double.isNaN(result) ? "오류" : formatResult(result));
                operator = "";
                newInput = true;
            }
        }
    }

    private String formatResult(double v) {
        return v == (long) v ? String.valueOf((long) v) : String.valueOf(v);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculator().setVisible(true));
    }
}
