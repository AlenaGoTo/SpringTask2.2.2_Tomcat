package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDao {
    // создание и получение списка машин
    private static List<String> cars;

    static {
        cars = new ArrayList<>();
        cars.add(new Car(1,"model-1").toString());
        cars.add(new Car(2,"model-2").toString());
        cars.add(new Car(3,"model-3").toString());
        cars.add(new Car(4,"model-4").toString());
        cars.add(new Car(5,"model-5").toString());
    }

    public static List<String> printCars(){
        return List.copyOf(cars);
    }



}
