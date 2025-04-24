package ch_10_abstract.part_02.step_02;

abstract public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void bark();

    public abstract String toString();

    public void introduce(){
        System.out.println(toString() + "입니다. ");
        bark();
    }
}
