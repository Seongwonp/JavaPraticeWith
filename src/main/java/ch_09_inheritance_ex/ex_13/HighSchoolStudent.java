package ch_09_inheritance_ex.ex_13;

import java.util.List;
/*
   2. HighSchoolStudent 클래스를 작성하세요. 이 클래스는 Student 클래스를 상속받아야 합니다.
    HighSchoolStudent 클래스는 다음과 같은 추가 속성을 가져야 합니다.
    year (정수): 고등학교 학년 (1부터 3까지)
    HighSchoolStudent 클래스에는 다음과 같은 메서드가 있어야 합니다.
    HighSchoolStudent 생성자: 이름, 학번, 성적, 학년을 매개변수로 받아 초기화합니다.
    calculateAverageGrade() 메서드: 학년에 따라 성적을 가중평균하여 반환합니다. (오버라이딩)

  * 예를 들어, 고등학교 학년에 따라 다음과 같은 가중치를 부여할 수 있습니다.
    1학년: 국어 30%, 영어 30%, 수학 20%, 과학 20%
    2학년: 국어 25%, 영어 25%, 수학 25%, 과학 25%
    3학년: 국어 20%, 영어 20%, 수학 30%, 과학 30%
    각 학년별로 가중치를 다르게 설정한 후, 해당 가중치를 과목 성적과 곱하여 가중합을 계산하고, 학년에 따른 가중평균 성적을 구할 수 있습니다.
 */
public class HighSchoolStudent extends Student {
    private int year;
    private final double[][] weight = {{0.3,0.3,0.2,0.2},{0.25,0.25,0.25,0.25},{0.2,0.2,0.3,0.3}};

    public HighSchoolStudent(String name, int studentID, List<Integer> grades,int year) {
        super(name, studentID, grades);
        this.year = year;
    }

    @Override
    public double calculateAverageGrade() {
        double weighted_avg = 0;
        switch(year){
            case 1:
                for(int i=0; i<grades.size(); i++) {
                    weighted_avg += (grades.get(i) * weight[0][i]);
                }
                return weighted_avg;
            case 2:
                for(int i=0; i<grades.size(); i++) {
                    weighted_avg += (grades.get(i) * weight[1][i]);
                }
                return weighted_avg;
            case 3:
                for(int i=0; i<grades.size(); i++) {
                    weighted_avg += (grades.get(i) * weight[2][i]);
                }
                return weighted_avg;
            default:
                System.out.println("[ERROR]: Year out of range");
                return 0;
        }
    }
}
