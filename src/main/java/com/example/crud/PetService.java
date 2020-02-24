package com.example.crud;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class PetService {

    List<Pet> PetList = new ArrayList<>();

    public void addPet(Pet pet) {
        PetList.add(pet);
    }

    public Pet getPet(Integer petId) {
        for (Pet pet : PetList){
            if (pet.getid().equals(petId)) {
                return pet;
            }
        }
        return null;
    }

    public List<Pet> getAllPet() {
        return PetList;
    }

    public void updatePet(Integer petId, Pet newPet) {
        int count = 0;
        for (Pet pet : PetList){
            if (pet.getid().equals(petId)) {
                PetList.set(count, newPet);
            }
            count++;
        }
    }

    public void deletePet(Integer petId) {
        PetList.removeIf(pet -> pet.getid().equals(petId));
    }

}