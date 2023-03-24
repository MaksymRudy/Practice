package animal;

import animal.food.Food;
import animal.food.Grain;
import animal.food.Worm;

public class Main {
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.makeSound();
        penguin.move();
        Food worm = new Worm();
        penguin.eat(worm);
        penguin.swim();
        penguin.walk();

        Parrot perrot = new Parrot();
        perrot.makeSound();
        perrot.move();
        perrot.fly();
        perrot.walk();
        Grain grain = new Grain();
        perrot.eat(grain);

        Salmon salmon = new Salmon();
        salmon.makeSound();
        salmon.move();
        salmon.swim();
        salmon.eat(new Worm());

        Exocoetidae exocoetidae = new Exocoetidae();
        exocoetidae.makeSound();
        exocoetidae.move();
        exocoetidae.swim();
        exocoetidae.fly();

        Dog dog = new Dog();
        dog.makeSound();
        dog.move();
        dog.swim();
        dog.walk();

        Bat bat = new Bat();
        bat.makeSound();
        bat.move();
        bat.fly();

        Whale whale = new Whale();
        whale.makeSound();
        whale.move();
        whale.swim();
        whale.eat(new Worm());

//        Mammalia whale2 = new Whale();
//        whale2.makeSound();
//        whale2.move();
//        whale2.swim();
//        whale2.eat(new Worm());

        Fish salmon2 = new Salmon();
//        salmon2.makeSound();
//        salmon2.move();
//        salmon2.swim();
//        salmon2.eat(new Worm());


        Salmon salmon3 = new Salmon();
        salmon3.makeSound();
        salmon3.move();
       // salmon3.swim():
        salmon3.eat(new Worm());



    }



}