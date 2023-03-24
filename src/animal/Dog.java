package animal;

import animal.food.Food;

public class Dog extends Mammalia implements WalkAbility, SwimAbility{
    @Override
    void makeSound() {
        System.out.println("Dog says - I'm a Dog");

    }

    @Override
    void eat(Food food) {
        System.out.println(food.name);

    }

    @Override
    public void swim() {
        System.out.println("Dog can swim");

    }

    @Override
    public void walk() {
        System.out.println("Dog can walk");

    }
}
