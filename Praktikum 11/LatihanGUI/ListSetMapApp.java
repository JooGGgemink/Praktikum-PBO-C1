import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class ListSetMapApp extends javax.swing.JFrame {
    DefaultListModel<String> listModel = new DefaultListModel<>();
    List<String> dataList = new ArrayList<>();
    Set<String> dataSet = new HashSet<>();
    Map<Integer, String> dataMap = new HashMap<>();
    int mapIndex = 0;

    public ListSetMapApp() {
        initComponents();
        jList.setModel(listModel);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jScrollPane1 = new JScrollPane();
        jList = new JList<>();
        txtItem = new JTextField();
        btnAdd = new JButton("Add");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");
        btnClear = new JButton("Clear All");
        btnSaveList = new JButton("Save to List ->");
        btnInsertList = new JButton("<- Insert from List");
        lblListCount = new JLabel("Data tersimpan = 0");
        btnSaveSet = new JButton("Save to Set ->");
        btnInsertSet = new JButton("<- Insert from Set");
        lblSetCount = new JLabel("Data tersimpan = 0");
        btnSaveMap = new JButton("Save to Map ->");
        btnInsertMap = new JButton("<- Insert from Map");
        lblMapCount = new JLabel("Data tersimpan = 0");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("List, Set, Map Demo");

        jScrollPane1.setViewportView(jList);

        btnAdd.addActionListener(e -> {
            String item = txtItem.getText().trim();
            if (!item.isEmpty()) listModel.addElement(item);
        });

        btnUpdate.addActionListener(e -> {
            int i = jList.getSelectedIndex();
            if (i >= 0) listModel.set(i, txtItem.getText().trim());
        });

        btnDelete.addActionListener(e -> {
            int i = jList.getSelectedIndex();
            if (i >= 0) listModel.remove(i);
        });

        btnClear.addActionListener(e -> listModel.clear());

        btnSaveList.addActionListener(e -> {
            dataList.clear();
            for (int i = 0; i < listModel.size(); i++) dataList.add(listModel.get(i));
            lblListCount.setText("Data tersimpan = " + dataList.size());
        });

        btnInsertList.addActionListener(e -> {
            listModel.clear();
            for (String s : dataList) listModel.addElement(s);
        });

        btnSaveSet.addActionListener(e -> {
            dataSet.clear();
            for (int i = 0; i < listModel.size(); i++) dataSet.add(listModel.get(i));
            lblSetCount.setText("Data tersimpan = " + dataSet.size());
        });

        btnInsertSet.addActionListener(e -> {
            listModel.clear();
            for (String s : dataSet) listModel.addElement(s);
        });

        btnSaveMap.addActionListener(e -> {
            dataMap.clear();
            mapIndex = 0;
            for (int i = 0; i < listModel.size(); i++) dataMap.put(mapIndex++, listModel.get(i));
            lblMapCount.setText("Data tersimpan = " + dataMap.size());
        });

        btnInsertMap.addActionListener(e -> {
            listModel.clear();
            for (String s : dataMap.values()) listModel.addElement(s);
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createParallelGroup()
            .addComponent(jScrollPane1)
            .addComponent(txtItem)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnAdd)
                .addComponent(btnUpdate)
                .addComponent(btnDelete)
                .addComponent(btnClear))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnSaveList)
                .addComponent(btnInsertList)
                .addComponent(lblListCount))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnSaveSet)
                .addComponent(btnInsertSet)
                .addComponent(lblSetCount))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnSaveMap)
                .addComponent(btnInsertMap)
                .addComponent(lblMapCount))
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
            .addComponent(jScrollPane1)
            .addComponent(txtItem)
            .addGroup(layout.createParallelGroup()
                .addComponent(btnAdd)
                .addComponent(btnUpdate)
                .addComponent(btnDelete)
                .addComponent(btnClear))
            .addGroup(layout.createParallelGroup()
                .addComponent(btnSaveList)
                .addComponent(btnInsertList)
                .addComponent(lblListCount))
            .addGroup(layout.createParallelGroup()
                .addComponent(btnSaveSet)
                .addComponent(btnInsertSet)
                .addComponent(lblSetCount))
            .addGroup(layout.createParallelGroup()
                .addComponent(btnSaveMap)
                .addComponent(btnInsertMap)
                .addComponent(lblMapCount))
        );

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new ListSetMapApp().setVisible(true));
    }

    private JScrollPane jScrollPane1;
    private JList<String> jList;
    private JTextField txtItem;
    private JButton btnAdd, btnUpdate, btnDelete, btnClear;
    private JButton btnSaveList, btnInsertList;
    private JLabel lblListCount;
    private JButton btnSaveSet, btnInsertSet;
    private JLabel lblSetCount;
    private JButton btnSaveMap, btnInsertMap;
    private JLabel lblMapCount;
}
