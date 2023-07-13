package entidades;

public class Hotel3 extends Hotel2{
    //atributos
    protected boolean aireAcondicionado = true;
    protected boolean bar = true;

    //constructor
    public Hotel3(Double precio, Double superficie, Integer cantidadHabitaciones){
        super(precio, superficie, cantidadHabitaciones);
    }
}
