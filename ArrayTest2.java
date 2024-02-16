
import java.util.Scanner;

public class ArrayTest2 {
    /**
     * 최적화 문제 중 최대값 구하기
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("다음 시험에서 1등 학생의 이름과 점수를 구하시오");

        System.out.println("시험에 응시한 학생수는 몇명입니까 ?");
        int numberOfStudent = sc.nextInt();
        String[] names = new String[numberOfStudent];
        int[] scores = new int[numberOfStudent];
        System.out.println("응시한 학생의 이름을 입력하세요");
        //


        int max = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.println("자연수를 입력: ");
            scores[i] = sc.nextInt();
            if(max < scores[i]) {
                max = scores[i];
            }
        }
        System.out.println("응시생 중에 1등 이름 : 제임스, 점수: " + max + "이다.");

    }
}