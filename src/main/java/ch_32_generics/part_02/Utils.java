package ch_32_generics.part_02;

// 제네릭 메서드: 메서드 레벨에서 타입 파라미터를 선언
public class Utils {

    // <T> 선언 위치: 반환 타입 앞
    public static <T> void printArray(T[] arr) {
        for (T item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // 두 값을 교환해 배열에 저장 후 반환
    public static <T> T[] swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    // 배열에서 특정 값의 인덱스 반환 (-1: 없음)
    public static <T> int indexOf(T[] arr, T target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) return i;
        }
        return -1;
    }
}
