import java.util.HashSet;
public class Solution{
    public static void main(String[] args){
        System.out.println(oneAway("pale", "ple"));
    }

    public static boolean oneAway(String str1, String str2){
        HashSet<Character> set = new HashSet<>();
        boolean answer = false;
        int count = 0;
        for(int i = 0; i < str1.length(); i++){
            set.add(str1.charAt(i));
        }

        for(int i = 0; i < str2.length(); i++){
            if(set.contains(str2.charAt(i))){
                count++;
            }
        }

        if(str1.length() - 1 == count || str1.length() == count){
            return answer = true;
        }

        return answer;

    }

}