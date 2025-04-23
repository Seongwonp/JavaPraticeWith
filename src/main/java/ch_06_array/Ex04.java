package ch_06_array;

public class Ex04 {
    public static void main(String[] args) {
        String[] students = {
                "김민경", "권기쁨", "이상현", "이병민", "김형곤",
                "엄주호", "남동하", "설현오", "이재욱", "박성원",
                "김동환", "김소영", "김나은", "윤남웅", "윤서정"};
        for(int i=0; i<students.length ; i++){
            int idx = (int)(Math.random()*students.length);
            String temp = students[idx];
            students[idx] = students[i];
            students[i] = temp;
        }

        for(int i=1 ; i<=students.length/3 ; i++){
            System.out.println( i + "조: ");
            for(int j=i+1 ; j<students.length ; j++){
                System.out.println(students[j] + " ");
            }

            System.out.println();
        }
    }
}
