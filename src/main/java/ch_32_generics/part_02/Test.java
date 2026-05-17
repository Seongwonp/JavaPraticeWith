package ch_32_generics.part_02;

public class Test {
    public static void main(String[] args) {
        Integer[] nums = {3, 1, 4, 1, 5, 9, 2, 6};
        String[] words = {"apple", "banana", "cherry"};

        System.out.print("정수 배열: ");
        Utils.printArray(nums);

        System.out.print("문자열 배열: ");
        Utils.printArray(words);

        Utils.swap(nums, 0, 7);
        System.out.print("0번↔7번 교환: ");
        Utils.printArray(nums);

        int idx = Utils.indexOf(words, "banana");
        System.out.println("banana 인덱스: " + idx);
    }
}
