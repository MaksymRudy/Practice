package animal;

import animal.food.Food;

public class Penguin extends Bird implements SwimAbility, WalkAbility {
    @Override
    void makeSound() {
        System.out.println("Pinguin says - I'm a Penguin");
    }

    @Override
    void eat(Food food) {
        System.out.println(food.name);
    }

    public void swim() {
        System.out.println("Pinguin can swim");
    }

    @Override
    public void walk() {
        System.out.println("Pinguin can walk");
    }
}
