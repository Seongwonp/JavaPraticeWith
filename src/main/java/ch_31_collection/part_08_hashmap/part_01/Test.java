package ch_31_collection.part_08_hashmap.part_01;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //Map 컬랙션 생성 <Key,Value>
        HashMap<String,Integer> scores = new HashMap<>();

        //객체 저장
        scores.put("신용균",85);
        scores.put("홍길동",90);
        scores.put("동장군",80);
        scores.put("홍길동",95); //key는 중복을 허용하지 않음 value 값은 마지막 저장값으로 대체

        System.out.println("1. 객체 출력");
        System.out.println("Total Entries : " + scores.size());
        System.out.println(scores);
        System.out.println();

        System.out.println("2. 객체 찾기");
        System.out.println("홍길동: " + scores.get("홍길동")); //Key로 value를 검색
        System.out.println();

        System.out.println("3. 순회: 객체를 하나씩 처리");
        Set<String> keySet = scores.keySet();
        //1) Iterator 사용
        System.out.println("* Using Iterator");
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + " : " + scores.get(key));
        }
        System.out.println();

        // 2) for-each문 사용
        System.out.println("* Using For-Each");
        for(var key : keySet){ //Java 10 이상의 버전에서는 변수 타입 추론을 사용할 수 있음. (var)
            System.out.println(key + " : " + scores.get(key));
        }
        System.out.println();

        // 3) for-each문 사용 - 2
        //entrySet(): 키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 Set에 담아서 리턴
        System.out.println("* Using For-Each -> Map.Entry");
        for(Map.Entry<String,Integer> entry : scores.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();

        System.out.println("4) 객체 삭제");
        System.out.println("홍길동 Removed");
        scores.remove("홍길동");
        System.out.println("Total Entry : " + scores.size());
        System.out.println(scores);

        System.out.println("5) 전체 삭제");
        scores.clear();
        if(scores.isEmpty()){
            System.out.println("Map is empty!");
        }

    }
}
