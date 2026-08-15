
//     public int[] twoSum(int[] nums, int target) {
//         int left = 0;
//         int right = arr.length-1;

//         while (left < right){
//             int sum = arr[left] + arr[right];

//             if (sum == target){
//                 System.out.println("Found");
//             }
//                 else if(sum > target){
//                     right --
//                 }
//                     else {
//                         left--
//                     }
//                 }
//             }
//         }
        
//     }
// }


class Solution{
public int []twoSum(int[]nums, int target){
    HashMap<Integer, Integer>map = new HashMap<>();

    for(int i=0; i<nums.length; i++){
        int complement = target - nums[i];

        if (map.containsKey(complement)){
        return new int[]{map.get(complement), i};
    }
     map.put(nums[i], i);
}

return new int[]{};
}
}