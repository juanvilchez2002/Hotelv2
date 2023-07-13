package entidades;

public class Hotel2 extends Hotel1{
    //atributos
    protected boolean cajaSeguridad = true;

    //constructor
    public Hotel2(Double precio, Double superficie, Integer cantidadHabitaciones) {
        super(precio, superficie, cantidadHabitaciones);
    }
}
