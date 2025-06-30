package stringPakage;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
//https://school.programmers.co.kr/learn/courses/30/lessons/176963
class 추억점수 {
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String,Integer > map = new HashMap<>();
        int[] answer = new int[photo.length];  // ← 올바른 선언
//        for(int i=0; i<name.length; i++){
//            if(i > yearning.length){
//                continue;
//            }
//            map.put(name[i], yearning[i]);
//        }
//
//        for (int i=0; i<photo.length; i++){
//            int res = 0;
//            for (int j=0; j<photo[i].length; j++){
//                res += map.getOrDefault(photo[i][j], 0); // ✅ 안전하게 처리 (NullPointerException 방지, 문자열 및 숫자도 안전하게 처리가능.)
//            }
//            answer[i] = res;
//        }

        for(int i=0; i<name.length && i < yearning.length; i++){
            map.put(name[i], yearning[i]);
        }

        for(int i=0; i<photo.length; i++){
            int res = 0;
            for(String str : photo[i]){
                //정리 (확장 for문)
                //배열이나 List, Set 같은 Iterable한 자료구조를 순회할 때,
                //index를 직접 관리하지 않아도 자동으로 하나씩 꺼내주는 문
                res += map.getOrDefault(str, 0);
            }
            answer[i] = res;
        }

        return answer;
    }


    public static void main(String[] args) {
        String[] name = new String[] { "may", "kein", "kain", "radi" };
        int[] yearning = new int[] {5, 10, 1, 3};

        String[][] photo = {
                {"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}
        };

        int[] result = solution(name,yearning,photo);
        System.out.println(Arrays.toString(result));
    }
}