package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class DogBreeder implements WithBreed,WithColour{

        private String name;
        private String breed;
        private LocalDateTime dateOfBirth;
        private String favouriteFood;
        private String color;
        private String favouriteToy;

        public DogBreeder(String name) {
            this.name = name;
        }
        public WithColour ofBreed(String breed) {
            this.breed = breed;
            return this;
        }

    public DogBreeder ofColour(String color) {
        this.color = color;
        return this;
    }
        public Dog bornOn(LocalDateTime dateOfBirth) {
           return new Dog(name,breed,color,favouriteFood,favouriteToy,dateOfBirth);
        }

        public DogBreeder withFavouriteFood(String favouriteFood) {
            this.favouriteFood = favouriteFood;
            return this;
        }
        public DogBreeder withFavouriteToy(String favouriteToy) {
            this.favouriteToy = favouriteToy;
            return this;
        }

    }