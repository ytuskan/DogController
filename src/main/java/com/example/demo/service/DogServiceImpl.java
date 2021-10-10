package com.example.demo.service;

import com.example.demo.entity.Dog;
import com.example.demo.exception.DogNotFoundException;
import com.example.demo.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogServiceImpl implements DogService{
    @Autowired
    private DogRepository dogRepository;

    @Override
    public List<Dog> getAllDogs() {
        return (List<Dog>) dogRepository.findAll();
    }

    @Override
    public List<String> getAllBreeds() {
        return dogRepository.findAllBreeds();
    }

    @Override
    public List<String> getAllNames() {
        return dogRepository.findAllNames();
    }

    @Override
    public String getBreedById(Long id) {
        Optional<String> optionalS = Optional.of(dogRepository.findBreedById(id));
        String breed = optionalS.orElseThrow(DogNotFoundException::new);
        return breed;
    }
}
