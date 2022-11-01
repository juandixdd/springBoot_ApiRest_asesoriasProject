package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.SalonModel;
import com.example.demo.services.SalonService;

@RestController
@RequestMapping("/salon")
public class SalonController {

    @Autowired
    SalonService salonService;

    @GetMapping()
    public ArrayList<SalonModel> getSalones() {
        return salonService.getSalones();
    }

    @GetMapping(path = "/{id}")
    public Optional<SalonModel> getUserById(@PathVariable("id") Integer id) {
        return this.salonService.getById(id);
    }

    @PostMapping()
    public SalonModel guardarSalon(@RequestBody SalonModel salon) {
        return this.salonService.guardarSalon(salon);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Integer id) {
        boolean ok = this.salonService.deleteSalon(id);
        if (ok) {
            return "Se eliminó el salón con id: " + id;
        } else {
            return "No se eliminó el salón con id: " + id;
        }
    }

}
