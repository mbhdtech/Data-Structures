import java.util.*;

public class palindromicSubString{
    public static void main(String[] args){
        String test = "babad";
        String answer = subPalindrome(test);

        System.out.println(answer);

    }

    public static String subPalindrome(String s){
        //char[] arr = s.toCharArray();
        String k = null;
        for(int i=0; i<s.length(); i++){
            for(int j = s.length()-1; 0 <= j; j--){


                //If the letters are the same, check if its a palindrome
                if(s.charAt(i)==s.charAt(j)){


                    //If its a palindrome then add it and return it.
                    if(isPalindrome(s, i, j) == true){
                        int size = (j - i) + 1;
                        char[] str = new char[size];
                        int count = 0;
                        int index = 0;
                        while(count < str.length){
                            str[index] = s.charAt(i);
                            count++;
                            i++;
                            index++;
                        }

                        k = Arrays.toString(str);
                        return k;
                    }
                }
                else{
                    //Do nothing
                }
            }
        }

        if(k!=null){
            return k;
        }

        else{ return null; }
    }

    public static boolean isPalindrome(String x, int y, int z){
        int dist = z - y;
        int palin = 0;
        int count = 0;
        boolean answer;

        while(count < dist){
            if(x.charAt(y) == x.charAt(z)){
                palin++; y++; z++;
            }
            count++;
        }

        if(palin==dist){
            answer = true;
        }

        else{ answer = false;}
        System.out.println(answer);
        return answer;
    }
}