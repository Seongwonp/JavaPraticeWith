package ch_10.ch_10_abstract.part_02.step_02;

public class Dog extends Animal{

    private String type;
    public Dog(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    public void bark() {
        System.out.println("멍멍!");
    }


    @Override
    public String toString() {
        return "이름: " + getName() + ", 견종: " + type;
    }
}
