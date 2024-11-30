package Utilidades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import uni1a.ContenidoAudiovisual;

public class EscrituraArchivo {

    // Escribe los contenidos en un archivo CSV
    public static void escribirArchivoCSV(String rutaArchivo, List<ContenidoAudiovisual> contenidos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (ContenidoAudiovisual contenido : contenidos) {
                writer.write(contenido.toCSV()); // Convierte cada contenido a CSV y lo escribe en el archivo
                writer.newLine(); // Agrega una nueva línea después de cada contenido
            }
            System.out.println("Archivo CSV guardado exitosamente en: " + rutaArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo CSV: " + e.getMessage()); // Si ocurre un error al escribir
        }
    }
}

