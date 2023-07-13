package entidades;

public class Hotel5 extends Hotel4{
    //atributos
    protected boolean casino = true;
    protected boolean restaurant = true;

    //constructor
    public Hotel5(Double precio, Double superficie, Integer cantidadHabitaciones) {
        super(precio, superficie, cantidadHabitaciones);
    }
}
