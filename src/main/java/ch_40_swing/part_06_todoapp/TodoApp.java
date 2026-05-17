package ch_40_swing.part_06_todoapp;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

// 미니 프로젝트 2: Todo 리스트 앱 (추가/삭제/완료 체크)
public class TodoApp extends JFrame {

    private DefaultListModel<String> listModel;
    private JList<String> todoList;
    private JTextField inputField;
    private ArrayList<Boolean> completedFlags;
    private JLabel countLabel;

    public TodoApp() {
        setTitle("Todo 리스트");
        setSize(450, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        completedFlags = new ArrayList<>();
        listModel = new DefaultListModel<>();

        // 헤더
        JLabel header = new JLabel("✅ Todo 리스트", SwingConstants.CENTER);
        header.setFont(new Font("맑은 고딕", Font.BOLD, 22));
        header.setOpaque(true);
        header.setBackground(new Color(70, 130, 180));
        header.setForeground(Color.WHITE);
        header.setBorder(new EmptyBorder(12, 0, 12, 0));

        // 입력 영역
        inputField = new JTextField();
        inputField.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
        inputField.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(70, 130, 180), 2),
            new EmptyBorder(5, 8, 5, 8)
        ));
        inputField.addActionListener(e -> addTodo()); // Enter 키로 추가

        JButton addBtn = new JButton("추가");
        addBtn.setFont(new Font("맑은 고딕", Font.BOLD, 13));
        addBtn.setBackground(new Color(70, 130, 180));
        addBtn.setForeground(Color.WHITE);
        addBtn.setFocusPainted(false);
        addBtn.addActionListener(e -> addTodo());

        JPanel inputPanel = new JPanel(new BorderLayout(6, 0));
        inputPanel.setBorder(new EmptyBorder(10, 10, 5, 10));
        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(addBtn, BorderLayout.EAST);

        // 할일 목록
        todoList = new JList<>(listModel);
        todoList.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
        todoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        todoList.setCellRenderer(new TodoCellRenderer());
        JScrollPane scrollPane = new JScrollPane(todoList);
        scrollPane.setBorder(new EmptyBorder(0, 10, 0, 10));

        // 하단 버튼
        JButton completeBtn = new JButton("완료 체크");
        JButton deleteBtn   = new JButton("삭제");
        JButton clearBtn    = new JButton("완료 항목 삭제");

        countLabel = new JLabel("총 0개");
        countLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));

        completeBtn.addActionListener(e -> toggleComplete());
        deleteBtn.addActionListener(e -> deleteTodo());
        clearBtn.addActionListener(e -> clearCompleted());

        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 5, 5));
        btnPanel.setBorder(new EmptyBorder(0, 10, 5, 10));
        btnPanel.add(countLabel);
        btnPanel.add(completeBtn);
        btnPanel.add(deleteBtn);
        btnPanel.add(clearBtn);

        setLayout(new BorderLayout());
        add(header, BorderLayout.NORTH);
        add(inputPanel, BorderLayout.PAGE_START); // NORTH 아래
        add(scrollPane, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);

        // 기본 항목 추가
        addTodoItem("Java Swing 공부하기");
        addTodoItem("Stream API 복습");
        addTodoItem("알고리즘 문제 3개 풀기");
    }

    private void addTodo() {
        String text = inputField.getText().trim();
        if (text.isEmpty()) return;
        addTodoItem(text);
        inputField.setText("");
        inputField.requestFocus();
    }

    private void addTodoItem(String text) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm");
        listModel.addElement(LocalDateTime.now().format(fmt) + "  " + text);
        completedFlags.add(false);
        updateCount();
    }

    private void toggleComplete() {
        int idx = todoList.getSelectedIndex();
        if (idx < 0) return;
        completedFlags.set(idx, !completedFlags.get(idx));
        todoList.repaint();
        updateCount();
    }

    private void deleteTodo() {
        int idx = todoList.getSelectedIndex();
        if (idx < 0) return;
        listModel.remove(idx);
        completedFlags.remove(idx);
        updateCount();
    }

    private void clearCompleted() {
        for (int i = listModel.size() - 1; i >= 0; i--) {
            if (completedFlags.get(i)) {
                listModel.remove(i);
                completedFlags.remove(i);
            }
        }
        updateCount();
    }

    private void updateCount() {
        long done = completedFlags.stream().filter(b -> b).count();
        countLabel.setText("완료 " + done + "/" + listModel.size() + "개");
    }

    // 완료된 항목은 취소선 + 회색 표시
    class TodoCellRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(
                JList<?> list, Object value, int index, boolean isSelected, boolean hasFocus) {
            JLabel label = (JLabel) super.getListCellRendererComponent(
                    list, value, index, isSelected, hasFocus);
            label.setBorder(new EmptyBorder(6, 10, 6, 10));
            if (index < completedFlags.size() && completedFlags.get(index)) {
                label.setText("<html><strike><font color='gray'>" + value + "</font></strike></html>");
            }
            return label;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TodoApp().setVisible(true));
    }
}
