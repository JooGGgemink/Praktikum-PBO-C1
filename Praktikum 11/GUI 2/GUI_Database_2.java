import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class GUI_Database_2 extends JFrame {
    private JTextField idField = new JTextField(5);
    private JTextField nameField = new JTextField(10);
    private JButton addButton = new JButton("Tambah");
    private JButton updateButton = new JButton("Ubah");
    private JButton deleteButton = new JButton("Hapus");
    private JButton showButton = new JButton("Tampilkan");
    private JTextArea resultArea = new JTextArea(10, 30);

    private Connection conn;

    public GUI_Database_2() {
        setTitle("CRUD Mahasiswa - JDBC GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 350);
        setLocationRelativeTo(null);

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("ID:"));
        inputPanel.add(idField);
        inputPanel.add(new JLabel("Nama:"));
        inputPanel.add(nameField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(showButton);

        JPanel resultPanel = new JPanel();
        resultArea.setEditable(false);
        resultPanel.add(new JScrollPane(resultArea));

        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(resultPanel, BorderLayout.SOUTH);

        connectDB();

        addButton.addActionListener(e -> addMahasiswa());
        updateButton.addActionListener(e -> updateMahasiswa());
        deleteButton.addActionListener(e -> deleteMahasiswa());
        showButton.addActionListener(e -> tampilkanMahasiswa());
    }

    private void connectDB() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/mahasiswa_db", "root", "");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Koneksi Gagal: " + e.getMessage());
        }
    }

    private void addMahasiswa() {
        try (PreparedStatement pst = conn.prepareStatement("INSERT INTO mahasiswa (id, nama) VALUES (?, ?);")) {
            pst.setInt(1, Integer.parseInt(idField.getText()));
            pst.setString(2, nameField.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan.");
            tampilkanMahasiswa();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal tambah data: " + e.getMessage());
        }
    }

    private void updateMahasiswa() {
        try (PreparedStatement pst = conn.prepareStatement("UPDATE mahasiswa SET nama=? WHERE id=?;")) {
            pst.setString(1, nameField.getText());
            pst.setInt(2, Integer.parseInt(idField.getText()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil diubah.");
            tampilkanMahasiswa();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal ubah data: " + e.getMessage());
        }
    }

    private void deleteMahasiswa() {
        try (PreparedStatement pst = conn.prepareStatement("DELETE FROM mahasiswa WHERE id=?;")) {
            pst.setInt(1, Integer.parseInt(idField.getText()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus.");
            tampilkanMahasiswa();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal hapus data: " + e.getMessage());
        }
    }

    private void tampilkanMahasiswa() {
        resultArea.setText("");
        try (Statement st = conn.createStatement(); ResultSet rs = st.executeQuery("SELECT * FROM mahasiswa;")) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String nama = rs.getString("nama");
                resultArea.append(id + " - " + nama + "\n");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal menampilkan data: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GUI_Database_2().setVisible(true));
    }
}