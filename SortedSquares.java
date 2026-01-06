class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        int result[]=new int[n];
        int left=0;
        int right=n-1;
        int index=n-1;
        while(left<=right){
         int leftSquare =  nums[left]*nums[left];
         int rightSquare = nums[right]*nums[right];
         if(leftSquare>rightSquare){
            
            result[index]=leftSquare;
            left++;

         }else{
             result[index]=rightSquare;
             right--;

         }
        index--;
    }
     return result;
}
}


/*Using Array.sort()

import java.util.Arrays;
class SortedSquares{
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Square each element
        for (int i = 0; i < n; i++) {
            result[i] = nums[i] * nums[i];
        }

        // Step 2: Sort the squared array
        Arrays.sort(result);

        return result;
    }
}    */
