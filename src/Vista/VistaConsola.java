
package Vista;

import java.util.Scanner;

public class VistaConsola {
       private final Scanner scanner = new Scanner(System.in);
// Muestra el menú y lee la opción seleccionada
  
    public int mostrarMenu() {
        System.out.println("\nMenú de Contenidos Audiovisuales:");
        System.out.println("1. Mostrar contenidos");
        System.out.println("2. Cargar contenidos desde archivo");
        System.out.println("3. Guardar contenidos en archivo");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
        return scanner.nextInt();
    }
 // Muestra un mensaje genérico
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    // Muestra los detalles de un contenido audiovisual
    public void mostrarContenido(String contenido) {
        System.out.println(contenido);
    }
}

