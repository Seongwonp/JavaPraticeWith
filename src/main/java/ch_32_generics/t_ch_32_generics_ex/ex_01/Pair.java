package ch_32_generics.t_ch_32_generics_ex.ex_01;

// 연습: 두 개의 서로 다른 타입을 쌍으로 저장하는 Pair<K, V> 클래스
public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }

    public static void main(String[] args) {
        Pair<String, Integer> score = new Pair<>("Alice", 95);
        Pair<Integer, Boolean> flag = new Pair<>(1, true);

        System.out.println("점수: " + score);
        System.out.println("플래그: " + flag);
        System.out.println("이름: " + score.getKey() + ", 점수: " + score.getValue());
    }
}
