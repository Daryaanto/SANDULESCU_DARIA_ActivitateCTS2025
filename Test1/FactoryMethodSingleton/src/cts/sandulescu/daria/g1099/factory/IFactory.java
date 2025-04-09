package cts.sandulescu.daria.g1099.factory;

import cts.sandulescu.daria.g1099.classes.AAnimal;

public interface IFactory {

   AAnimal getAnimal(ITipAnimal tipAnimal, String nume, int varsta);
}
