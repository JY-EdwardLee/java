package Array;

public class Array1Ref2 {
    public static void main(String[] args) {
        // int[] students; //int형 배열 변수 선언
        // students = new int[5] // int를 5개 넣을 수 있는 변수
        // students = new int[]{70, 40, 30, 60, 20, 50}; // 생성하면서 초기화
        // int[] students = new int[]{70, 40, 30, 60, 20, 50};
        int[] students = {70, 40, 30, 60, 20, 50};

        System.out.println(students.length);



        // 변수값 대입
//        students[0] = 90;
//        students[1] = 40;
//        students[2] = 60;
//        students[3] = 70;
//        students[4] = 30;
//        students[5] = 40;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

    }
}
