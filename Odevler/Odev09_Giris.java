package Odevler;

import hafta09.formRegex;

import javax.swing.*;

public class Odev09_Giris {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() { //ekrana basılması için thread
            @Override
            public void run() {
                Odev09_form fr = new Odev09_form();
                fr.setVisible(true);
            }
        });
    }
}

