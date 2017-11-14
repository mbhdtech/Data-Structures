import java.util.*;
public class Solution{
    /*
    Given nums = [2, 7, 11, 15], target = 9,

    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].
    */

    public static void main(String[] args){
        int[] answer = new int[2];
        int target = 10;
        int[] nums = {1, 6, 7, 8, 2};
        answer = twoSum(nums, target);

        for(int x : answer){
            System.out.print(x + " ");
        }

    }

    //My Solution O(N^2)
    public static int[] target(int target, int[] numbers){
        int size = numbers.length;
        int[] answer = new int[2];
        for(int i = 0; i < size; i++){

            for(int j = i; j < size; j++){
                if(numbers[i] == numbers[j]){
                    //Do Nothing
                }

                else if(numbers[i] + numbers[j] == target){
                    answer[0] = i;
                    answer[1] = j;
                }

            }
        }

        return answer;
    }
    // [3,2,4]
    // 6
    //Better Solution -- O(N)
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        //Add the numbers into HashMap
        //Each number is linked to a certain index
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        //Iterate through the numbers
        //Then every time you go through the list, you try to see if the complement is already in the Map
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}