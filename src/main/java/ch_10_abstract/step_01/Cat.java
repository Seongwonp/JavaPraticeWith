package ch_10_abstract.step_01;

public class Cat extends Animal {
    private int age;
    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void bark() {
        System.out.println("Meow");
    }


    @Override
    public String toString() {
        return "이름: " + getName() + ", 나이: " + age;
    }
}

