package animal;

import animal.food.Food;

public class Bat extends Mammalia implements FlyAbility {
    @Override
    void makeSound() {
        System.out.println("Bat says - I'm a Bat");
    }

    @Override
    void eat(Food food) {
        System.out.println(food.name);

    }

    @Override
    public void fly() {
        System.out.println("Bat can fly");

    }
}
