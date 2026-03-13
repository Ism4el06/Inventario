# Inventario de Camisetas de Fútbol - Emprendimiento Koefh

## Descripción del Emprendimiento
Este proyecto consiste en un sistema de gestión de inventario para un emprendimiento dedicado a la venta de camisetas de fútbol de las ligas más importantes del mundo. El sistema permite llevar un control detallado de los equipos, ligas, tipos de camiseta (local/visitante), colores, precios y stock disponible.

## Problema que resuelve el sistema
Anteriormente, el control del inventario se realizaba de forma manual o en hojas de cálculo dispersas, lo que dificultaba la actualización en tiempo real y la toma de decisiones sobre reposición de stock. Este sistema CRUD (Create, Read, Update, Delete) centraliza la información y permite una gestión ágil y eficiente de los productos.

## Tecnologías Utilizadas
*   **Java 17**: Lenguaje de programación principal.
*   **Spring Boot 3.2.3**: Framework para el desarrollo de la aplicación.
*   **Spring Data JPA**: Para la persistencia de datos y mapeo objeto-relacional.
*   **H2 Database**: Base de datos en memoria para facilitar la ejecución y pruebas.
*   **Thymeleaf**: Motor de plantillas para la interfaz web.
*   **Bootstrap 5**: Framework CSS para un diseño responsivo y moderno.
*   **Maven**: Herramienta de gestión de dependencias y construcción del proyecto.

## Equipos Incluidos en el Inventario Inicial
El sistema viene precargado con camisetas de los siguientes equipos:
*   **Premier League**: Manchester City, Arsenal.
*   **La Liga**: Real Madrid, FC Barcelona.
*   **Serie A**: Inter Milan, Juventus, AC Milan.

## Instrucciones para ejecutar el proyecto
1.  Asegúrate de tener instalado **Java 17** y **Maven**.
2.  Clona el repositorio o descarga el código fuente.
3.  Navega hasta la carpeta raíz del proyecto: `cd futbol-inventory`.
4.  Ejecuta el comando: `mvn spring-boot:run`.
5.  Abre tu navegador y accede a: `http://localhost:8080/camisetas`.

## Autor del proyecto
Ismael Quishpe]
