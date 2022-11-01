package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.SalonModel;
import com.example.demo.repositories.SalonRepository;

@Service
public class SalonService {
    @Autowired
    SalonRepository salonRepository;

    public ArrayList<SalonModel> getSalones() {
        return (ArrayList<SalonModel>) salonRepository.findAll();
    }

    public SalonModel guardarSalon(SalonModel salon) {
        return salonRepository.save(salon);
    }

    public Optional<SalonModel> getById(Integer id) {
        return salonRepository.findById(id);
    }

    public boolean deleteSalon(Integer id) {
        try {
            salonRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
