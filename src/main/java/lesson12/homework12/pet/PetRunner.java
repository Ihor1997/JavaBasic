package lesson12.homework12.pet;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PetRunner {
    public static void main(String[] args) {
        PetRunner petRunner = new PetRunner();
        Pet dog = new Dog(22);
        Pet cat = new Cat(12);
        Pet parrot = new Parrot(32);

        HashMap<String, Pet> petMap = new HashMap<>();
        petMap.put("Dog", dog);
        petMap.put("Cat", cat);
        petMap.put("Parrot", parrot);
        petRunner.printAnimals(petMap);




    }

    public void printAnimals(HashMap<?,?> animalMap){
        Set<? extends Map.Entry<?, ?>> entries = animalMap.entrySet();
        for (Map.Entry<?, ?> entry: entries){
            System.out.println("Animal name is: " + entry.getKey());
        }
    }
}
