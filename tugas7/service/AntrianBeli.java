package service;

import java.util.ArrayDeque;
import model.User;

public class AntrianBeli {
    private ArrayDeque<User> antrian = new ArrayDeque<>();

    public void tambah(User user) {
        antrian.add(user);
    }

    public void prosesAntrian() {
        while (!antrian.isEmpty()) {
            User user = antrian.poll();
            user.info();
        }
    }
}