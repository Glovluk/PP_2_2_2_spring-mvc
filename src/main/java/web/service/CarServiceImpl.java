package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> carList = Arrays.asList(
        new Car("Honda", "CR-V", 2013),
        new Car("Kia", "RIO", 2013),
        new Car("Audi", "Q5", 2018),
        new Car("Land Rover", "Range Rover", 2023),
        new Car("Moscvich", "Svyatogor", 2005)
    );

    @Override
    public List<Car> getCars(int count) {
        return carList.subList(0, Math.min(count, carList.size()));
    }
}
