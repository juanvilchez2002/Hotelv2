package entidades;

public class Hotel {

    //declaramos los atributos
    protected Integer cantidadHabitaciones;

    //creando los constructoress
    public Hotel() {
    }

    public Hotel(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    //setters y getters

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }
}
