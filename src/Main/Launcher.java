package Main;

import Guis.GuiEquipo;

import javax.swing.*;

public class Launcher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new GuiEquipo();
                frame.setSize(400,400);
                frame.setVisible(true);
            }
        });
    }
}
