package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.CarreraModel;
import com.example.demo.services.CarreraService;

@RestController
@RequestMapping("/carrera")
public class CarreraController {

    @Autowired
    CarreraService carreraService;

    @GetMapping()
    public ArrayList<CarreraModel> getSalones() {
        return carreraService.getCarreras();
    }

    @GetMapping(path = "/{id}")
    public Optional<CarreraModel> getUserById(@PathVariable("id") Integer id) {
        return this.carreraService.getById(id);
    }
}
