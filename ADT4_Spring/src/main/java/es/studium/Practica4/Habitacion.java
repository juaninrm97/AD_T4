package es.studium.Practica4;

// Importa la anotación Component de Spring para marcar la clase como un componente gestionado por el contenedor de Spring.
import org.springframework.stereotype.Component;

// La anotación @Component indica que esta clase es un componente gestionado por el contenedor de Spring.
// Al igual que en la clase Persona, Spring gestionará la instancia de la clase Habitacion.
@Component
public class Habitacion {

    // Atributos privados que definen las propiedades de la habitación.
    private String nombreHabitacion; // Nombre de la habitación.
    private Integer pisoHabitacion;  // Piso en el que se encuentra la habitación.
    private Boolean tieneVentana;    // Indica si la habitación tiene ventana (true o false).
    private Persona persona;         // Una referencia a una persona asociada a la habitación (relación de objeto).

    // Constructor por defecto (vacío) necesario para que Spring pueda instanciar la clase sin parámetros.
    public Habitacion() {}

    // Método getter para obtener el nombre de la habitación.
    public String getNombreHabitacion() {
        return nombreHabitacion;
    }

    // Método setter para asignar un nombre a la habitación.
    public void setNombreHabitacion(String nombreHabitacion) {
        this.nombreHabitacion = nombreHabitacion;
    }

    // Método getter para obtener el número de piso de la habitación.
    public Integer getPisoHabitacion() {
        return pisoHabitacion;
    }

    // Método setter para asignar el número de piso de la habitación.
    public void setPisoHabitacion(Integer pisoHabitacion) {
        this.pisoHabitacion = pisoHabitacion;
    }

    // Método getter para saber si la habitación tiene ventana.
    public Boolean getTieneVentana() {
        return tieneVentana;
    }

    // Método setter para asignar si la habitación tiene o no ventana.
    public void setTieneVentana(Boolean tieneVentana) {
        this.tieneVentana = tieneVentana;
    }

    // Método getter para obtener la persona asociada a la habitación.
    public Persona getPersona() {
        return persona;
    }

    // Método setter para asignar una persona a la habitación.
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    // Sobrescribe el método toString() de la clase Object para representar la habitación como una cadena legible.
    // Este método proporciona una visión general de los atributos de la habitación.
    @Override
    public String toString() {
        return "Habitacion{nombreHabitacion='" + nombreHabitacion + "', pisoHabitacion=" + pisoHabitacion + ", tieneVentana=" + tieneVentana + ", persona=" + persona + "}";
    }
}
