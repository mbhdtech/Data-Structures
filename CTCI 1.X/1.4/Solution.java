import java.util.HashSet;

public class Solution{
    public static void main(String[] args){

        System.out.println(palindromePerm("racecare"));


    }

    public static boolean palindromePerm(String str){
        boolean answer = false;
        int count = 0;
        int setCount = 0;
        int spaces = 0;
        str = str.toLowerCase();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < str.length(); i++){

            if(set.contains(str.charAt(i))){
                setCount++;
            }

            else{
                if(str.charAt(i) == ' '){
                    i++;
                    spaces++;

                    if(set.contains(str.charAt(i))){
                        setCount++;
                    }
                }

                else {
                    set.add(str.charAt(i));
                    count++;
                }
            }
        }

        //If the string has an odd length
        if((str.length() - spaces) % 2 > 0 && setCount + 1 == count){
            return answer = true;
        }

        //If the string has an even length
        if((str.length() - spaces) % 2 == 0 && setCount == count){
            return answer = true;
        }


        return answer;
    }
}