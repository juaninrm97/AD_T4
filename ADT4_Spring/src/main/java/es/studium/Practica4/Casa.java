package es.studium.Practica4;

import org.springframework.stereotype.Component;
import java.util.List;

// La anotación @Component indica que esta clase es un componente gestionado por el contenedor de Spring.
// Al igual que en las otras clases, Spring se encargará de instanciar y gestionar la vida del objeto Casa.
@Component
public class Casa {
    
    // Atributos privados para las propiedades de la casa.
    private String nombreCasa;       // Nombre de la casa (por ejemplo, "Casa Blanca").
    private List<Habitacion> habitaciones;  // Una lista de habitaciones asociadas a esta casa.
    private Persona propietario;     // La persona propietaria de la casa (instancia de la clase Persona).

    // Constructor por defecto (vacío). Es necesario para que Spring pueda crear una instancia de Casa sin parámetros.
    public Casa() {}

    // Método getter para obtener el nombre de la casa.
    public String getNombreCasa() {
        return nombreCasa;
    }

    // Método setter para asignar un nombre a la casa.
    public void setNombreCasa(String nombreCasa) {
        this.nombreCasa = nombreCasa;
    }

    // Método getter para obtener la lista de habitaciones de la casa.
    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    // Método setter para asignar una lista de habitaciones a la casa.
    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    // Método getter para obtener la persona propietaria de la casa.
    public Persona getPropietario() {
        return propietario;
    }

    // Método setter para asignar una persona como propietaria de la casa.
    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    // Sobrescribe el método toString() de la clase Object para representar la casa de manera legible.
    @Override
    public String toString() {
        return "Casa{nombreCasa='" + nombreCasa + "', habitaciones=" + habitaciones + ", propietario=" + propietario + "}";
    }
}
