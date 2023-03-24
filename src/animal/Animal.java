package animal;

import animal.food.Food;

public abstract class Animal {
   abstract void makeSound ();
   abstract void eat(Food food);
   void move () {
       System.out.println("Animal Moved");
   }
}
