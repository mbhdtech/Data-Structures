
public class Solution{
    public static void main(String[] args){
        System.out.println(atoi("-65456"));
    }

    public static int atoi(String str){

        if(str.length() == 0 || str == null){
            return 0;
        }

        int finalSum = 0;
        char basis = '0';
        int power = str.length()-1;
        boolean negative = false;
        for(int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);     //Gets character from left to right of string

            if(str.charAt(i) == '-' && i == 0){ //If there is a negative sign at the beginning ignore it for now
                curr = str.charAt(++i);
                negative = true;
            }

            if(str.charAt(i) == '+' && i == 0){ //If there is a positive sign at the beginning ignore it for now
                curr = str.charAt(++i);
            }

            if(str.charAt(i) == '-' && i != 0){
                return 0;        //Because why would they have a negative inside of a number
            }

            int currNum = (curr - basis);       //Subtracts the character (or digit) from the basis character. When you minus the difference between the characters, you get the real value
            finalSum =(int)(finalSum + (currNum * Math.pow(10, power--))); //Character value * 10 ^ i ---- added to whatever sum was previously.
        }

        if(negative == true){
            finalSum *= -1;
        }

        return finalSum;

    }

}