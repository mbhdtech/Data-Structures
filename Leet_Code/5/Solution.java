public class Solution{
    public static void main(String[] args){
        System.out.println(longestPalindrome("babadabndbnmasbdadmawbkjshbdmattamattamkugskdgshdkhjsad"));
    }

    public static String longestPalindrome(String s) {
        String max = "";
        String temp;
        for(int i = 0; i < s.length(); i++){
            for(int j = s.length()-1; j > i; j--){
                if(s.charAt(i) == s.charAt(j)){
                    if(isPalindrome(s.substring(i, j+1))){
                        temp = s.substring(i, j+1);
                        if(temp.length() > max.length()){
                            max = temp;
                            }
                        }
                    }
                }
            }
            return max;
        }

    public static boolean isPalindrome(String str){
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}