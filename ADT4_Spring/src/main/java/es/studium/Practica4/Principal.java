package es.studium.Practica4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// La clase Principal contiene el método main, que es el punto de entrada para la ejecución de la aplicación.
// Aquí se carga el contexto de Spring y se obtiene el bean configurado para realizar tareas de la aplicación.
public class Principal {
    public static void main(String[] args) {
        // Cargar el contexto de Spring desde el archivo beans.xml.
        // El contexto es el entorno en el que Spring gestiona los objetos (beans) definidos en el archivo XML.
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Obtener el bean de Casa. Spring inyectará la instancia de Casa configurada en el contexto.
        // Al obtener el bean, Spring crea o recupera la instancia de Casa según la configuración.
        Casa casa = context.getBean(Casa.class);

        // Mostrar por consola los valores configurados para la casa.
        // Aquí se imprime la representación de la casa obtenida a través del método toString(), 
        // lo cual muestra los detalles de la casa (nombre, habitaciones y propietario).
        System.out.println("Información de la casa:");
        System.out.println(casa);
    }
}
