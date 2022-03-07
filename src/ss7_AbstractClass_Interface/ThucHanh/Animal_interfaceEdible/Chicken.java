package ss7_AbstractClass_Interface.ThucHanh.Animal_interfaceEdible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken : Cuc tac!";
    }

    @Override
    public String howToEat() {
        return "toc toc";
    }
}
