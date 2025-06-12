package stringPakage;

public class Quiz8 {
    public static void main(String[] args) {
//        String str = "it is bananana time to banananabananana study";
        String str = "it is time to study";

        String[] strArr= str.split(" ");

        int max = strArr[0].length();
        String result = "";

        for(int i=1; i<strArr.length;i++){
            int current = strArr[i].length();
            if(max < current) {
                max = current;
                result = strArr[i];
            }
        }
        System.out.println(result);
    }
}
