import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Penjumlahan extends JFrame implements ActionListener {
    JTextField angka1Field, angka2Field, jawabanField;
    JButton checkButton;
    JLabel pesanLabel;
    int angka1, angka2;

    public Penjumlahan() {
        setTitle("Game Kuis Penjumlahan");
        setSize(400, 250); // <- Ukuran diperbesar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // ==== Generate angka random ====
        Random rand = new Random();
        angka1 = rand.nextInt(10); // 0–9
        angka2 = rand.nextInt(10); // 0–9

        // ==== Panel Soal ====
        JPanel panelSoal = new JPanel(new FlowLayout());
        angka1Field = new JTextField(String.valueOf(angka1), 5);
        angka1Field.setEditable(false);
        angka2Field = new JTextField(String.valueOf(angka2), 5);
        angka2Field.setEditable(false);
        jawabanField = new JTextField(5);

        panelSoal.add(angka1Field);
        panelSoal.add(new JLabel("+"));
        panelSoal.add(angka2Field);
        panelSoal.add(new JLabel("="));
        panelSoal.add(jawabanField);

        // ==== Tombol ====
        checkButton = new JButton("CHECK");
        checkButton.addActionListener(this);

        JPanel panelTombol = new JPanel();
        panelTombol.add(checkButton);

        // ==== Label Hasil ====
        pesanLabel = new JLabel(" ", SwingConstants.CENTER);
        pesanLabel.setPreferredSize(new Dimension(380, 30)); // ← agar kelihatan
        pesanLabel.setFont(new Font("Arial", Font.BOLD, 14));

        // ==== Panel Utama ====
        JPanel panelUtama = new JPanel(new BorderLayout(10, 10));
        panelUtama.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelUtama.add(panelSoal, BorderLayout.NORTH);
        panelUtama.add(panelTombol, BorderLayout.CENTER);
        panelUtama.add(pesanLabel, BorderLayout.SOUTH);

        add(panelUtama);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int jawabanUser = Integer.parseInt(jawabanField.getText());
            int hasilBenar = angka1 + angka2;

            if (jawabanUser == hasilBenar) {
                pesanLabel.setText("Selamat Jawaban Anda Benar !!! " + hasilBenar);
                pesanLabel.setForeground(Color.GREEN.darker());
                getContentPane().setBackground(Color.GREEN.brighter());
            } else {
                pesanLabel.setText("Maaf, Jawaban Anda Salah");
                pesanLabel.setForeground(Color.RED.darker());
                getContentPane().setBackground(Color.RED.brighter());
            }
        } catch (NumberFormatException ex) {
            pesanLabel.setText("Masukkan angka yang valid!");
            pesanLabel.setForeground(Color.ORANGE.darker());
            getContentPane().setBackground(Color.ORANGE.brighter());
        }
    }

    public static void main(String[] args) {
        new Penjumlahan();
    }
}