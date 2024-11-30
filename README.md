________________________________________
Proyecto: Sistema de Gestión de Contenidos Audiovisuales
Este proyecto es un sistema para gestionar contenidos audiovisuales, incluyendo películas, series de TV y documentales. Permite crear, guardar y cargar contenidos desde un archivo CSV, así como visualizarlos en consola.
________________________________________
Estructura del Código
El proyecto sigue un diseño basado en principios de SOLID, con una arquitectura modular y separada en paquetes:
1.	uni1a: Clases principales del modelo.
o	ContenidoAudiovisual: Clase base abstracta.
o	Pelicula: Representa una película.
o	SerieDeTV: Representa una serie de TV.
o	Documental: Representa un documental.
o	Clases Auxiliares: 
	Actor: Representa un actor en una película.
	Temporada: Representa una temporada en una serie de TV.
	Investigador: Representa un investigador en un documental.
2.	Vista: Interfaz de usuario.
o	Vista: Define los métodos necesarios para interactuar con el usuario.
o	VistaConsola: Implementación de la vista basada en consola.
3.	Controlator: Controlador del sistema.
o	ControladorContenido: Gestiona la interacción entre el modelo y la vista.
4.	Utilidades: Clases para el manejo de archivos.
o	LecturaArchivo: Lee contenidos desde un archivo CSV.
o	EscrituraArchivo: Guarda contenidos en un archivo CSV.
________________________________________
Cambios Realizados
1.	Refactorización del Código:
o	Aplicación de principios de SOLID.
o	Separación de responsabilidades (clases LecturaArchivo y EscrituraArchivo).
2.	Pruebas Unitarias:
o	Se implementaron pruebas con JUnit 4 para todas las clases principales.
3.	Diagrama de Clases:
o	Se creó un diagrama de clases para visualizar la estructura del proyecto.
4.	Documentación:
o	Se agregaron comentarios explicativos en todas las clases y métodos principales.
________________________________________
Cómo Clonar y Ejecutar el Proyecto
Requisitos Previos
1.	Java JDK (versión 8 o superior).
2.	NetBeans IDE (versión 12 o superior).
3.	JUnit 4 configurado en el proyecto.
Pasos para Clonar el Proyecto
1.	Clona el repositorio en tu máquina local: 
2.	git clone https://github.com/usuario/proyecto-contenidos-audiovisuales.git
3.	Abre el proyecto en NetBeans: 
o	Selecciona File > Open Project.
o	Navega hasta la carpeta donde clonaste el repositorio y selecciona el proyecto.
Ejecución del Proyecto
1.	Ejecuta la clase principal: ClasePrincipal.
2.	En la consola, interactúa con el menú: 
o	1. Mostrar contenidos: Lista los contenidos actuales.
o	2. Cargar contenidos desde archivo: Carga un archivo CSV.
o	3. Guardar contenidos en archivo: Guarda los contenidos actuales en un archivo CSV.
o	4. Salir: Termina el programa.
________________________________________
Cómo Ejecutar las Pruebas
El proyecto incluye pruebas unitarias con JUnit 4. Sigue estos pasos para ejecutarlas:
1.	Abre el proyecto en NetBeans.
2.	Haz clic derecho en la carpeta test y selecciona Test o Run All Tests.
3.	Los resultados aparecerán en la pestaña Test Results.
Pruebas Implementadas
1.	PeliculaTest: 
o	Verifica los métodos toCSV y fromCSV.
o	Comprueba la correcta adición de actores.
2.	SerieDeTVTest: 
o	Prueba la adición de temporadas y la conversión a CSV.
3.	DocumentalTest: 
o	Valida la adición de investigadores y la conversión a CSV.
4.	LecturaArchivoTest y EscrituraArchivoTest: 
o	Validan la lectura y escritura de contenidos en archivos CSV.
________________________________________
Archivos Importantes
•	ClasePrincipal.java: Punto de entrada del proyecto.
•	LecturaArchivo.java: Manejo de la lectura de archivos CSV.
•	EscrituraArchivo.java: Manejo de la escritura de archivos CSV.
•	README.md: Documentación del proyecto.
________________________________________

