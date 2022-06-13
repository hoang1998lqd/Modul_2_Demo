package Demo_B7_AbstractClass_Interface;

public class Animal_Tiger extends Animal implements Edible{

    @Override
    public String makeSound() {
        return "Tiger: Roar Roar";
    }

    @Override
    public String howToEat() {
        return "Thịt chiên nước mắm";
    }
}
