package com.example.demo.service;

import com.example.demo.entity.Dog;

import java.util.List;

public interface DogService {
    List<Dog> getAllDogs();
    List<String> getAllBreeds();
    List<String> getAllNames();
    String getBreedById(Long id);
}
