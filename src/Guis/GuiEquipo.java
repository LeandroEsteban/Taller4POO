package Guis;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiEquipo extends JFrame{
    private JPanel panelEquipos;
    private JButton australiaButton;
    private JButton chileButton;
    private JButton camerunButton;
    private JButton alemaniaButton;

    public GuiEquipo() {

        super("Mundial Fifa");

        setContentPane(panelEquipos);


        australiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiJugador guiJugador = new GuiJugador("aus");
                guiJugador.setVisible(true); // Esto mostrará la ventana de GuiJugador
            }
        });
        chileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiJugador guiJugador = new GuiJugador("chi");
                guiJugador.setVisible(true); // Esto mostrará la ventana de GuiJugador
            }
        });
        camerunButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiJugador guiJugador = new GuiJugador("cmr");
                guiJugador.setVisible(true); // Esto mostrará la ventana de GuiJugador

            }
        });
        alemaniaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiJugador guiJugador = new GuiJugador("ger");
                guiJugador.setVisible(true); // Esto mostrará la ventana de GuiJugador
            }
        });
    }
}
