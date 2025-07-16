package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars  = Arrays.asList(
            new Car("Toyota", "Red", 2010),
            new Car("Honda", "Blue", 2012),
            new Car("BMW", "Black", 2015),
            new Car("Mazda", "White", 2017),
            new Car("Kia", "Green", 2020)
    );

    public List<Car> getCars(int count) {

        return cars.subList(0, Math.min(count, cars.size()));
    }


}
