package com.example.demo.repository;

import com.example.demo.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DogRepository extends CrudRepository<Dog, Long> {
    @Query("Select d.id, d.breed From Dog d")
    List<String> findAllBreeds();

    @Query("Select d.id, d.name From Dog d")
    List<String> findAllNames();

    @Query("Select d.id, d.breed From Dog d Where d.id=:id")
    String findBreedById(Long id);
}
