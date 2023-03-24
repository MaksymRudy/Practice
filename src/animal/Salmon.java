package animal;

import animal.food.Food;

public class Salmon extends Animal implements SwimAbility,Fish{
    @Override
    void makeSound() {
        System.out.println("Salmon says - I'm a Salmon");

    }

    @Override
    void eat(Food food) {
        System.out.println(food.name);

    }

    @Override
    public void swim() {
        System.out.println("Salmon swim");

    }
}
