package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.CarreraModel;

@Repository
public interface CarrerraRepository extends CrudRepository<CarreraModel, Integer> {
    
}
