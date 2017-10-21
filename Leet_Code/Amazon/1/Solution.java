

public class Solution{
    public static void main(String[] args){

        int[] array = {5, 7, 2, 15};
        int target = 9;

        int[] ans = twoSum(array, target);

        for(int i =0; i < ans.length; i++){
            System.out.println(ans[i]);
        }

    }

    public static int[] twoSum(int[] nums, int target){

        int[] answer = new int[2];

        for(int i = 0; i < nums.length; i++){
            int num1 = nums[i];

            for(int j = i + 1; j < nums.length; j ++){
                int num2 = nums[j];

                if(num1 + num2 == target){
                    answer[0] = i;
                    answer[1] = j;

                    return answer;
                }

            }

        }

        return answer;

    }
}