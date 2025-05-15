package ch_10.ch_10_abstract.part_02.step_02;

public class Test {
    public static void main(String[] args) {

        Animal[] animals = {
                new Dog("바둑이","삽살개"),
                new Cat("아롱이",7),
                new Dog("백두","진돗개"),
        };

        for (Animal a : animals) {
            a.introduce();
            System.out.println();
        }
        
    }
}
