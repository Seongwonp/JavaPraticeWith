package ch_32_generics.part_01;

// 제네릭 클래스: 타입 파라미터 T를 사용해 어떤 타입이든 담을 수 있는 박스
public class Box<T> {
    private T value;

    public void set(T value) { this.value = value; }
    public T get() { return value; }

    @Override
    public String toString() {
        return "Box[" + value + "]";
    }
}
