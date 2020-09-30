package pl.lukaszp.restApiCarRental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.lukaszp.restApiCarRental.model.Car;
import pl.lukaszp.restApiCarRental.model.Color;
import pl.lukaszp.restApiCarRental.repository.CarRepository;

@Service
public class CarService {

    private CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runEx(){
        Car car1 = new Car("BMW", "320", 2020, Color.BLACK );
        carRepository.save(car1);

        Car car2 = new Car("Audi", "A4", 2020, Color.BLUE );
        carRepository.save(car2);

        Car car3 = new Car("Ford", "Mondeo", 2018, Color.WHITE );
        carRepository.save(car3);

        Car car4 = new Car("Toyota", "Yaris", 2019, Color.RED );
        carRepository.save(car4);

        //Iterable<Car> all = carRepository.findAllByColor(Color.BLACK);
        //all.forEach(System.out::println);
    }




}

