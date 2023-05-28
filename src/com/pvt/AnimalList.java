package com.pvt;

import java.util.Iterator;
import java.util.LinkedList;

public class AnimalList<T extends Animal> {
    public LinkedList<Animal> animalList;
    public Iterator<Animal> animalIterator;

    public LinkedList<Animal> makeAnimalList() {
        animalList = new LinkedList<>();
        return this.animalList;
    }

    public Iterator<Animal> makeAnimalIterator() {
        this.animalList = animalList;
        animalIterator = animalList.iterator();
        return this.animalIterator;
    }
    public void printAnimalListIteratorAge() {
        this.animalList = animalList;
        this.animalIterator = animalIterator;
        while (animalIterator.hasNext()) System.out.println(animalIterator.next().age);
    }
    public void printAnimalListIteratorName() {
        this.animalList = animalList;
        this.animalIterator = animalIterator;
        while (animalIterator.hasNext()) System.out.println(animalIterator.next().name);
    }
}
