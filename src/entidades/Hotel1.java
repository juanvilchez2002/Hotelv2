package entidades;

public class Hotel1 extends Hotel {

    //declaramos los atributos
    protected Double precio;
    protected Double superficie;
    protected boolean bano=true;
    protected boolean ascensor = true;
    protected boolean calefaccion = true;

    //creando el constructor

    public Hotel1(Double precio, Double superficie, Integer cantidadHabitaciones) {
        super(cantidadHabitaciones);
        this.precio = precio;
        this.superficie = superficie;
    }
}
