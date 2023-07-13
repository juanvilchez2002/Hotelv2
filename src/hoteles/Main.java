package hoteles;
import entidades.Hotel;
import entidades.Hotel1;
import entidades.Hotel2;
import entidades.Hotel3;
import entidades.Hotel4;
import entidades.Hotel5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Hotel> hoteles = new ArrayList();

        Hotel1 h1 = new Hotel1(1500d, 9d, 10);
        Hotel1 h2 = new Hotel2(2500d, 12d, 15);
        Hotel1 h3 = new Hotel3(3500d, 15d, 20);
        Hotel1 h4 = new Hotel4(5000d, 20d, 30);
        Hotel1 h5 = new Hotel5(10000d, 30d, 50);

        hoteles.add(h1);
        hoteles.add(h2);
        hoteles.add(h3);
        hoteles.add(h4);
        hoteles.add(h5);

        for(Hotel aux:hoteles){
            // instanceof hace referencia al Objeto instanciado
            if(aux instanceof Hotel5){
                Hotel5 obj = (Hotel5)  aux;
                System.out.println("Soy un Hotel 5");
                continue;
            }

            if(aux instanceof Hotel4){
                Hotel4 obj = (Hotel4)  aux;
                System.out.println("Soy un Hotel 4");
                System.out.println(obj.getCantidadHabitaciones());
                continue;
            }

            if(aux instanceof Hotel3){
                Hotel3 obj = (Hotel3)  aux;
                System.out.println("Soy un Hotel 3");
                continue;
            }
        }
    }
}