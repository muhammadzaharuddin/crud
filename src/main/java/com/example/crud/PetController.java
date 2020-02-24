package com.example.crud;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
public class PetController {

    @Autowired
    private PetService petService;

    @PostMapping("/pets")
    public void addPet(@RequestBody Pet pet) {
        petService.addPet(pet);
    }

    @GetMapping("/pets/{petId}")
    public Pet getPet(@PathVariable("petId") Integer petId) {
        return petService.getPet(petId);
    }

    @GetMapping("/pets")
    public List<Pet> getAllPet() {
        return petService.getAllPet();
    }

    @PutMapping("/pets/{petId}")
    public void updatePet(@PathVariable("petId") Integer petId, @RequestBody Pet pet){
        petService.updatePet(petId, pet);
    }

    @DeleteMapping("/pets/{petId}")
    public void deletePet(@PathVariable("petId") Integer petId){
        petService.deletePet(petId);
    }

}