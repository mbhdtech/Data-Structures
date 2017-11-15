import java.util.HashSet;
public class Solution{
    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int temp = 0;
        int max = 0;

        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                if(temp >= max){
                    max = temp;
                    temp = 0;
                }
                set.clear();
                set.add(s.charAt(i));
                temp++;
            }
            else{
                set.add(s.charAt(i));
                temp++;
            }
        }
        return max;
    }
}