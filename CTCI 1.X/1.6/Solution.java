
public class Solution{
    public static void main(String[] args){

        System.out.println(strCompressor("aabcccccbc"));

    }


    public static String strCompressor(String str){

        int counter = 0;
        char character = str.charAt(counter);
        StringBuilder comp = new StringBuilder();

        for(int i = 0; i < str.length(); i++){


            if(character != str.charAt(i)){
                comp.append(character);
                comp.append(String.valueOf(counter));
                counter = 1;
                character = str.charAt(i);
            }

            else{
                counter++;
            }

            if(i == str.length()-1){
                comp.append(character);
                comp.append(counter);
            }

        }

        if(comp.toString().length() > str.length()) {
            return str;
        }

        return comp.toString();
    }



}