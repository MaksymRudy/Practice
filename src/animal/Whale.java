package animal;

import animal.food.Food;

public class Whale extends Mammalia implements SwimAbility{
    @Override
    void makeSound() {
        System.out.println("Whale says - I'm a Whale");

    }

    @Override
    void eat(Food food) {
        System.out.println(food.name);

    }

    @Override
    public void swim() {
        System.out.println("Whale swim");

    }
}
