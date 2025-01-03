package com.example.controller;

import com.example.entity.Car;
import com.example.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CarController {
    @Autowired
    CarRepository repo;

    //get all the car
    //localhost:8095/cars
    @GetMapping("/cars")
    public List<Car> getAllCar(){
        List<Car> cars = repo.findAll();
          return cars;
    }

    //get cars based on the id
    //localhost:8095/cars/1
    @GetMapping("/cars/{id}")
    public Car getCar(@PathVariable int id){
        Car car = repo.findById(id).get();
        return car;
    }

    //to add new cars
    //localhost:8095/car/add
    @PostMapping("/car/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void craeteCar(@RequestBody Car car){
        repo.save(car);
    }

    //to update the data
    //localhost:8095/car/update/1 -----1 means car which is id 1
    @PutMapping("/car/update/{id}")
    public Car updateCar(@PathVariable int id, @RequestBody Car updatedCar) {
        Car car = repo.findById(id).orElseThrow(() -> new RuntimeException("Car not found"));
        car.setName(updatedCar.getName());
        car.setModel(updatedCar.getModel());
        car.setYear(updatedCar.getYear());
        repo.save(car);
        return car;
    }


    //to delete car
    //localhost:8095/car/delete/1
    @DeleteMapping("/car/delete/{id}")
    public void removeCar(@PathVariable int id){
        Car car = repo.findById(id).get();
        repo.delete(car);
    }
}
