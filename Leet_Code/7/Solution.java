public class Solution{
    public static void main(String[] args){
        System.out.println(reverse(-321));
    }

    public static int reverse(int x) {
            int result = 0;

            while (x != 0)
            {
                int tail = x % 10; // Goes into number 321 ... 32 times and returns -1
                int newResult = result * 10 + tail; //New Result will then
                if ((newResult - tail) / 10 != result)
                { return 0; }
                result = newResult;
                x = x / 10; // X goes from 321 to 32. Process starts all over again.
            }
            return result;
    }
}