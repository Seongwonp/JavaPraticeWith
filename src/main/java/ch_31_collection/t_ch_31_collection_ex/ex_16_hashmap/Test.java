package ch_31_collection.t_ch_31_collection_ex.ex_16_hashmap;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        /*
            HashMap에 아이디(String)와 점수(Integer)가 저장되어있음
            실행 결과와 같이 평균 점수를 출력하고, 최고점수와 최고점수를 받은 아이디를 출력할 것.
         */

        Map<String, Integer> scores = new HashMap<>();

        scores.put("blue",96);
        scores.put("hong",86);
        scores.put("white",92);

        String name = null; // 최고점수 받은아이디 저장
        int maxScore = 0; // 최고 점수 저장
        int totalScore = 0; // 점수 합계 저장

        for(String key : scores.keySet()){
            int score = scores.get(key);
            totalScore += score;
            if(score > maxScore){
                maxScore = score;
                name = key;
            }
        }

        System.out.println("최고 점수를 받은 아이디 : " + name);
        System.out.println("최고 점수 : " + maxScore);
        System.out.println("평균 점수 : " + (double)totalScore/scores.size());

    }
}
