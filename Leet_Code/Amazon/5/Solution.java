import java.util.*;

public class Solution{
    public static void main(String[] args){
        int answer = longestPalindrome("rkdracecarbb");
        System.out.println(answer);
    }

    public static int longestPalindrome(String str) {
        int size = 0;
        int max = 0;

        for(int i = 0; i < str.length(); i++){

            for(int j = str.length()-1; j > i; j--){

                if(str.charAt(i) == str.charAt(j)){
                    size = checkifPalindrome(str.substring(i,j+1));
                    //System.out.println(str.substring(i, j+1));
                    if(size > max){
                        max = size;
                    }
                }

            }
        }

        return max;
    }


    public static int checkifPalindrome(String str){

        //If word is odd
        if(str.length() % 2 > 0){
            int endPointer = str.length() - 1;
            int counter = 0;

            for(int i = 0; i < str.length(); i++){
                char one = str.charAt(i);
                char two = str.charAt(endPointer);

                //Checks if first and last letter are the same
                if(one == two){
                    counter++;
                }

                //If they are not the same, stop right there
                if(one != two){
                    return 0;
                }

                //The moment i and endPointer is the same, we should stop the loop
                if(i == endPointer){
                    return str.length();
                }

                endPointer--;

            }
        }

        //If word is even
      else{
            int endPointer = str.length() - 1;
            int counter = 0;

            for(int i = 0; i < str.length(); i++){
                char one = str.charAt(i);
                char two = str.charAt(endPointer);

                //Checks if first and last letter are the same
                if(one == two){
                    counter++;
                }

                //If they are not the same, stop right there
                if(one != two){
                    return 0;
                }

                //The moment i and endPointer is the same, we should stop the loop
                if(i + 1 == endPointer){
                    return str.length();
                }

                endPointer--;

            }

        }

        return 0;

    }


}