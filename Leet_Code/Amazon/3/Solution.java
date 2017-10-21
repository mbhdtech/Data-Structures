import java.util.*;

public class Solution{
    public static void main(String[] args){
        int answer = longestSubStr("bbbbb");
        System.out.println(answer);
    }

    public static int longestSubStr(String str){
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        int max = 0;
        for(int i = 0; i < str.length(); i++){
            if(set.contains(str.charAt(i))){
                set = new HashSet<>();
                set.add(str.charAt(i));

                if(count > max){
                    max = count;
                }
                count = 0;
                count++;
            }
            else{
                set.add(str.charAt(i));
                count = count + 1;
            }
        }

        return max;
    }
}