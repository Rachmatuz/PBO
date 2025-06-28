import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Kalkulator extends JFrame implements ActionListener {
    JTextField input1, input2;
    JLabel hasil;
    JButton tambah, kurang, kali, bagi, modulus;

    public Kalkulator() {
        setTitle("Kalkulator Sederhana");
        setSize(300, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel atas: input dan hasil
        JPanel panelAtas = new JPanel(new FlowLayout());
        input1 = new JTextField(5);
        input2 = new JTextField(5);
        hasil = new JLabel("= ");
        panelAtas.add(input1);
        panelAtas.add(input2);
        panelAtas.add(hasil);
        add(panelAtas, BorderLayout.NORTH);

        // Tombol operator
        tambah = new JButton("+");
        kurang = new JButton("-");
        kali = new JButton("*");
        bagi = new JButton("/");
        modulus = new JButton("Modulus");

        // Tambahkan listener
        tambah.addActionListener(this);
        kurang.addActionListener(this);
        kali.addActionListener(this);
        bagi.addActionListener(this);
        modulus.addActionListener(this);

        // Panel grid (tombol vertikal)
        JPanel panelGrid = new JPanel(new GridLayout(5, 1, 5, 5));
        panelGrid.add(tambah);
        panelGrid.add(kurang);
        panelGrid.add(kali);
        panelGrid.add(bagi);
        panelGrid.add(modulus);

        // Bungkus grid dalam panel tengah agar tidak melebar
        JPanel panelTengah = new JPanel(new FlowLayout());
        panelTengah.add(panelGrid); // Grid di tengah dengan ukuran tetap

        add(panelTengah, BorderLayout.CENTER);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String text1 = input1.getText().trim();
            String text2 = input2.getText().trim();

            if (text1.isEmpty() || text2.isEmpty()) {
                hasil.setText("= Masukkan kedua angka");
                return;
        }

        int num1 = Integer.parseInt(text1);
        int num2 = Integer.parseInt(text2);
        int result = 0;

        if (e.getSource() == tambah) {
            result = num1 + num2;
        } else if (e.getSource() == kurang) {
            result = num1 - num2;
        } else if (e.getSource() == kali) {
            result = num1 * num2;
        } else if (e.getSource() == bagi) {
            result = num1 / num2;
        } else if (e.getSource() == modulus) {
            result = num1 % num2;
        }

        hasil.setText("= " + result);
    } catch (NumberFormatException nfe) {
        hasil.setText("= Input harus angka");
    } catch (ArithmeticException ae) {
        hasil.setText("= Error Aritmatika");
    }
    }

    public static void main(String[] args) {
        new Kalkulator();
    }
}