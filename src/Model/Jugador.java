package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private int numero;
    private String nombre;
    private String posicion;

    // Constructor
    public Jugador(int numero, String nombre, String posicion) {
        this.numero = numero;
        this.nombre = nombre;
        this.posicion = posicion;
    }

    // Getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    // Método para leer los datos de un archivo .txt
    public static List<Jugador> leerDatos(String rutaArchivo) {
        List<Jugador> jugadores = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                int numero = Integer.parseInt(partes[0]);
                String nombre = partes[1];
                String posicion = partes[2];
                jugadores.add(new Jugador(numero, nombre, posicion));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jugadores;
    }
}