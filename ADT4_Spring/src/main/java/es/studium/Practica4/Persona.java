package es.studium.Practica4;

// Importación de la anotación Component de Spring, que indica que esta clase es un componente
// que debe ser gestionado por el contenedor de Spring.
import org.springframework.stereotype.Component;

// La clase Persona está marcada con la anotación @Component, lo que indica que es un
// componente gestionado por Spring. Esto significa que Spring se encargará de crear
// instancias de esta clase cuando sea necesario (a través de inyección de dependencias).
@Component
public class Persona {
    
    // Definición de la variable de instancia 'nombre', que representará el nombre de la persona.
    private String nombre;

    // Constructor vacío. Esto permite crear una instancia de la clase Persona sin especificar un nombre.
    // Utilizado por Spring para crear una instancia de Persona cuando es necesario.
    public Persona() {}

    // Constructor que recibe un parámetro 'nombre' para inicializar el objeto con un nombre específico.
    // Se puede utilizar cuando se necesita una Persona con un nombre al crear la instancia.
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Método getter para obtener el valor de la propiedad 'nombre'.
    // Devuelve el nombre de la persona.
    public String getNombre() {
        return nombre;
    }

    // Método setter para modificar el valor de la propiedad 'nombre'.
    // Permite actualizar el nombre de la persona después de que el objeto ha sido creado.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método toString() sobrescrito para proporcionar una representación en forma de cadena de la
    // instancia de la clase Persona. Es útil para mostrar información de la persona de forma legible.
    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "'}";  // Devuelve el nombre dentro de un formato claro.
    }
}
