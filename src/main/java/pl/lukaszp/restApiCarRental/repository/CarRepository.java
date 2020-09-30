package pl.lukaszp.restApiCarRental.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.lukaszp.restApiCarRental.model.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

    //List<Car> findAllByColor (Color color);
}
