package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.CarreraModel;
import com.example.demo.repositories.CarrerraRepository;

@Service
public class CarreraService {
    @Autowired
    CarrerraRepository carrerraRepository;

    public ArrayList<CarreraModel> getCarreras() {
        return (ArrayList<CarreraModel>) carrerraRepository.findAll();
    }

    public Optional<CarreraModel> getById(Integer id) {
        return carrerraRepository.findById(id);
    }
}
