package stringPakage;

import java.sql.Struct;

public class Quiz7 {

    public static void main(String[] args) {

        //아스키코드
        //A = 65 ~ Z = 90
        //a = 97 ~ z = 122

        String str = "StuDy";
        String result = "";

        for(int i = 0 ; i< str.length() ;i++){

            int num = str.charAt(i);

            if(num >=65 && num <= 90){
                result += String.valueOf(str.charAt(i)).toLowerCase();
            }

            if(num >=97 && num <= 122){
                result += String.valueOf(str.charAt(i)).toUpperCase();
            }
        }

        System.out.println("결과 => "+result);

    }
}
