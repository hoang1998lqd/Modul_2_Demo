package Demo_B7_AbstractClass_Interface;

public class Animal_Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Cục tác cục tác";
    }

    @Override
    public String howToEat() {
        return "Gà chiên giòn KFC";
    }
}
