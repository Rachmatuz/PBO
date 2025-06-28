import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame {
    private JButton[][] buttons = new JButton[3][3];
    private boolean giliranX = true; // true = X, false = O

    public TicTacToe() {
        setTitle("Tic-Tac-Toe Sederhana");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3)); // 3x3 kotak

        // Inisialisasi tombol
        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 3; kolom++) {
                JButton button = new JButton();
                button.setFont(new Font("Arial", Font.BOLD, 40));
                button.setFocusPainted(false);
                button.setBackground(Color.DARK_GRAY);
                button.setForeground(Color.WHITE);

                // Tambahkan event click
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (!button.getText().equals("")) {
                            return; // jika sudah diklik, abaikan
                        }

                        if (giliranX) {
                            button.setText("X");
                        } else {
                            button.setText("O");
                        }

                        button.setEnabled(false); // tidak bisa diklik lagi
                        giliranX = !giliranX; // ganti giliran
                    }
                });

                buttons[baris][kolom] = button;
                add(button); // Tambahkan ke frame
            }
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}