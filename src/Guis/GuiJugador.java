package Guis;

import Model.Jugador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GuiJugador extends JFrame {
    private JPanel panelJugador;
    private JButton atrasButton;
    private JTextPane textPane1;
    private JButton editarAlineacionButton;
    private JLabel banderaLabel;

    public GuiJugador(String pais) {
        atrasButton = new JButton("Atrás");
        textPane1 = new JTextPane();
        editarAlineacionButton = new JButton("Editar Alineación");
        banderaLabel = new JLabel();

        // Crea tu panel y establece el LayoutManager
        JPanel contentPane = new JPanel(new FlowLayout(FlowLayout.LEFT));

        // Agrega tus componentes al panel
        contentPane.add(atrasButton);
        contentPane.add(textPane1);
        contentPane.add(editarAlineacionButton);
        contentPane.add(banderaLabel);

        setContentPane(contentPane);
        setSize(500, 500);

        // Carga los datos del país y la bandera
        cargarDatosPais(pais);
        cargarBandera(pais);

        atrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cierra la ventana actual
                dispose();
            }
        });
    }

    private void cargarDatosPais(String pais) {
        String rutaArchivo = "C:\\Users\\lmata\\OneDrive\\Documentos\\Programacion\\CodigoSO\\Taller4POO\\src\\Datos\\" + pais + ".txt";
        List<Jugador> jugadores = Jugador.leerDatos(rutaArchivo);

        StringBuilder sb = new StringBuilder();

        for (Jugador jugador : jugadores) {
            sb.append(jugador.getNumero()).append(" - ").append(jugador.getNombre()).append(" (").append(jugador.getPosicion()).append(")\n");
        }

        textPane1.setText(sb.toString());
    }

    private void cargarBandera(String pais) {
        // Supongamos que tienes las imágenes de las banderas en un directorio llamado "Banderas"
        String rutaBandera = "C:\\Users\\lmata\\OneDrive\\Documentos\\Programacion\\CodigoSO\\Taller4POO\\src\\Datos\\" + pais + ".png";

        // Cargar la imagen de la bandera y establecerla en el JLabel
        ImageIcon banderaIcon = new ImageIcon(new ImageIcon(rutaBandera).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        banderaLabel.setIcon(banderaIcon);
    }
}
