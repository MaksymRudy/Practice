package animal;

import animal.food.Food;

public class Exocoetidae extends Animal implements Fish, SwimAbility, FlyAbility {
    @Override
    void makeSound() {
        System.out.println("Exocoetidae says - I'm a Exocoetidae");

    }

    @Override
    void eat(Food food) {
        System.out.println(food.name);

    }

    @Override
    public void swim() {
        System.out.println("Exocoetidae can swim");

    }

    public void fly() {
        System.out.println("Exocoetidae can fly");
    }
}
