package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //변수 선언 및 초기화
        int n1 = 0, n2 = 0, result = 0;

        System.out.print("수1 입력: ");//123
        try{
            //에러가 날거 같은 구문
            n1 = in.nextInt();
        }catch (InputMismatchException e){
            System.out.println("수1 입력형식 예외");
            e.printStackTrace();
        }

        System.out.print("수2 입력: ");//qwe

        try{
            //에러가 날거 같은 구문
            n2 = in.nextInt();
        }catch (InputMismatchException e){
            System.out.println("수2 입력형식 예외");
            e.printStackTrace();
        }

        try {
            result = n1/n2;
        }catch (ArithmeticException e){
            //💥try에서 예외가 발생되면 잡아서 확인하고 잡아주겠다!
            System.out.println(e.getMessage()); // "/ by zero"
            e.printStackTrace();//일반적인 방법
        }

        //예외 범위를 잘 생각해서 멑티로 예외 블록을 생성할 수 있다.
        // -> 추가로 Exception은 최상위 에러이다. ( 마지막에 작성하자 )

        System.out.printf("%d/%d=%d\n",n1,n2,result);

    }
}
