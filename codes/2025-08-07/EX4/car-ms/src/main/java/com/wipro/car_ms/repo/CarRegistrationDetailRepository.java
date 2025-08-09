package com.wipro.car_ms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.car_ms.entity.CarRegistrationDetail;
@Repository
public interface CarRegistrationDetailRepository extends JpaRepository<CarRegistrationDetail,Long>{

}
