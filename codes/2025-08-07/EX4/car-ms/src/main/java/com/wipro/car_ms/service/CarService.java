package com.wipro.car_ms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.car_ms.entity.Car;
import com.wipro.car_ms.repo.CarRepository;

import jakarta.transaction.Transactional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    @Transactional
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Optional<Car> getCarById(Long id) {
        return carRepository.findById(id);
    }

    @Transactional
    public Optional<Car> updateCar(Long id, Car updatedCar) {
        return carRepository.findById(id).map(existingCar -> {
            existingCar.setMake(updatedCar.getMake());

            if (updatedCar.getRegistrationDetail() != null) {
                if (existingCar.getRegistrationDetail() != null) {
                    existingCar.getRegistrationDetail().setRegistrationNumber(updatedCar.getRegistrationDetail().getRegistrationNumber());
                    existingCar.getRegistrationDetail().setDateOfRegistration(updatedCar.getRegistrationDetail().getDateOfRegistration());
                } else {
                    existingCar.setRegistrationDetail(updatedCar.getRegistrationDetail());
                }
            } else {
                existingCar.setRegistrationDetail(null);
            }
            return carRepository.save(existingCar);
        });
    }

    @Transactional
    public boolean deleteCar(Long id) {
        if (carRepository.existsById(id)) {
            carRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
