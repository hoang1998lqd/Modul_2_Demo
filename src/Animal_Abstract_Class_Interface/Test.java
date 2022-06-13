package Demo_B7_AbstractClass_Interface;

public class Test {
    public static void main(String[] args) {
        Animal [] animal = new Animal[2];
        animal[0] = new Animal_Chicken();
        animal[1] = new Animal_Tiger();
        for (Animal animal1: animal) {
            // Duyệt mảng để gọi Method MakeSound từ lớp cha là Animal.
            System.out.println(animal1.makeSound());
            // Kiểm tra đối tượng Chicken có thuộc anmal hay không???
            if (animal1 instanceof Animal_Tiger){
                // Lấy phương thức trừu tượng từ lớp Interface (Phương thức không có phần thân).
                Edible edible = (Animal_Tiger) animal1;
                System.out.println(edible.howToEat());
            }
        }


    }
}
