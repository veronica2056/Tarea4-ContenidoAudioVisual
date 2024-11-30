package Utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import uni1a.ContenidoAudiovisual;
import uni1a.Pelicula;
import uni1a.SerieDeTV;
import uni1a.Documental;

public class LecturaArchivo {

    // Lee el archivo CSV y convierte las líneas en objetos ContenidoAudiovisual
    public static List<ContenidoAudiovisual> leerArchivoCSV(String rutaArchivo) {
        List<ContenidoAudiovisual> contenidos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                ContenidoAudiovisual contenido = parsearLinea(linea); // Convierte la línea a un objeto
                if (contenido != null) {
                    contenidos.add(contenido); // Agrega el objeto a la lista
                }
            }
            System.out.println("Archivo CSV cargado exitosamente desde: " + rutaArchivo);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo CSV: " + e.getMessage());
        }
        return contenidos;
    }

    // Convierte una línea del archivo CSV a un objeto ContenidoAudiovisual
    private static ContenidoAudiovisual parsearLinea(String linea) {
        try {
            String[] datos = linea.split(","); // Separa la línea por comas
            switch (datos[0]) {
                case "Pelicula":
                    return Pelicula.fromCSV(linea); // Crea una Película desde el CSV
                case "SerieDeTV":
                    return SerieDeTV.fromCSV(linea); // Crea una SerieDeTV desde el CSV
                case "Documental":
                    return Documental.fromCSV(linea); // Crea un Documental desde el CSV
                default:
                    System.err.println("Tipo desconocido: " + datos[0]);
                    return null; // Si el tipo no es reconocido, devuelve null
            }
        } catch (Exception e) {
            System.err.println("Error al procesar la línea: " + linea + " - " + e.getMessage());
            return null; // Si ocurre algún error, devuelve null
        }
    }
}

