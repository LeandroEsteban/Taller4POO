package Model;

import java.util.List;

public class Equipo {
    private List<Jugador> jugadores;

    public Equipo() {
        this.jugadores = null; // Inicializar según necesidades
    }

    public void cargarDatosDesdeArchivo(String nombrePais) {
        String rutaArchivo = "src/Datos/" + nombrePais.toLowerCase() + ".txt";
        this.jugadores = Jugador.leerDatos(rutaArchivo);
    }

}
