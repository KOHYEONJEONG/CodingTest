package stringPakage;

import java.util.Scanner;

public class Quiz6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력 => ");
        String input = sc.nextLine();

        System.out.println("문자 입력 => ");
        String input2 = sc.nextLine();
        int num = 0;
        for(int i=0; i<input.length(); i++){

            if(input2.equalsIgnoreCase(String.valueOf(input.charAt(i)))){
                num++;
            }
        }

        System.out.println("총 수 = "+num);

    }
    }
