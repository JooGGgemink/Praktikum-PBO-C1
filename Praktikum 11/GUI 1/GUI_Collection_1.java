import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class GUI_Collection_1 extends JFrame {
    private DefaultListModel<String> listModel = new DefaultListModel<>();
    private JList<String> jList = new JList<>(listModel);
    private JTextField inputField = new JTextField(15);
    private JButton addButton = new JButton("Add");
    private JButton updateButton = new JButton("Update");
    private JButton deleteButton = new JButton("Delete");
    private JButton clearButton = new JButton("Clear All");
    private JButton saveButton = new JButton("Save Data");
    private JButton insertButton = new JButton("Insert Data");

    private java.util.List<String> savedList = new ArrayList<>();
    private Set<String> dataSet = new HashSet<>();
    private Map<Integer, String> dataMap = new HashMap<>();

    public GUI_Collection_1() {
        setTitle("JList GUI + Collection");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        JPanel panel = new JPanel();

        JScrollPane scrollPane = new JScrollPane(jList);
        scrollPane.setPreferredSize(new java.awt.Dimension(200, 150));
        panel.add(scrollPane);
        panel.add(inputField);
        panel.add(addButton);
        panel.add(updateButton);
        panel.add(deleteButton);
        panel.add(clearButton);
        panel.add(saveButton);
        panel.add(insertButton);
        add(panel);

        // Actions
        addButton.addActionListener(e -> addItem());
        updateButton.addActionListener(e -> updateItem());
        deleteButton.addActionListener(e -> deleteItem());
        clearButton.addActionListener(e -> listModel.clear());
        saveButton.addActionListener(e -> saveData());
        insertButton.addActionListener(e -> insertData());
    }

    private void addItem() {
        String text = inputField.getText();
        if (!text.isEmpty()) listModel.addElement(text);
    }

    private void updateItem() {
        int i = jList.getSelectedIndex();
        if (i != -1) listModel.set(i, inputField.getText());
    }

    private void deleteItem() {
        int i = jList.getSelectedIndex();
        if (i != -1) listModel.remove(i);
    }

    private void saveData() {
        savedList.clear();
        dataSet.clear();
        dataMap.clear();
        for (int i = 0; i < listModel.size(); i++) {
            String val = listModel.getElementAt(i);
            savedList.add(val);
            dataSet.add(val);
            dataMap.put(i, val);
        }
        JOptionPane.showMessageDialog(this, "Data saved to List, Set, and Map.");
    }

    private void insertData() {
        for (String item : savedList) listModel.addElement(item);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GUI_Collection_1().setVisible(true));
    }
}