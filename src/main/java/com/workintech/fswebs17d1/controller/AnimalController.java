package com.workintech.fswebs17d1.controller;

import com.workintech.fswebs17d1.entity.Animal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/workintech/animal")
public class AnimalController {

    private Map<Integer, Animal> animals = new HashMap();

    @Value("${course.name}")
    private String courseName;

    @Value("${project.developer.fullname}")

    private String developerName;

    @GetMapping
    public List<Animal> getAnimals() {
        return new ArrayList<>(animals.values());
    }

    @GetMapping("/{id}")
    public Animal getAnimal(@PathVariable int id) {
        if (id < 0) {
            return null;
        }
        return this.animals.get(id);
    }

/*
    @PostMapping
    public void addAnimal(@RequestParam int id, @RequestParam String name) {
        Animal a = new Animal(id, name);
        animals.put(id, a);

    }  */

    @PostMapping
    public Animal addAnimal(@RequestBody Animal animal) {
        animals.put(animal.getId(), animal);
        return animal;
    }


    @PutMapping("/{id}")
    public void putAnimal(@PathVariable int id, @RequestBody Animal newAnimal) {
        animals.put(id, newAnimal);
    }

    @DeleteMapping("/{id}")
    public void deleteAnimal(@PathVariable int id) {
        animals.remove(id);
    }

}
