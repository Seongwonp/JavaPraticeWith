package ch_08_class.t_ch_08_class_ex.ex03;

public class Test {

    public static void main(String[] args) {
        Information i = new Information();
        i.setName("홍길동");
        i.setAge(20);
        i.setGrade((short)1);
        i.setAvg(3.75);

        int[] arr = {1,2,3,4,5,6};
        i.setNumArr(arr);


        System.out.println(i.getName());
        System.out.println(i.getAge());
        System.out.println(i.getGrade());
        System.out.println(i.getAvg());
        for(int j = 0; j <arr.length ; j++){
            System.out.print(i.getNumArr()[j] + " ");
        }



    }
}
