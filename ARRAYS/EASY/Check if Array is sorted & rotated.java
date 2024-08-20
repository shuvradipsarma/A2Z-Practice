class Solution {
    // Current element should be greater than the previous element
    // for every element in nums from 0 to n-1th element this says array is sorted.
    // But since we rotate nums[] by x positions (Clockwise or Anticlockwise), 
    // there exists a pivot where the previous element is greater or equal to 
    // the current element. 

    // Note - If there is at most one occurrence of pivot then 
    // we can say array is rotated and sorted.

    // Time Complexity - O(N) , Space Complexity - O(1) extra space
    public boolean check(int[] nums) {
        int c=0;
        int n = nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[i-1]>nums[i])
            {
                c++;
            }
        }
        if(nums[n-1] > nums[0]) // check the last value and first value
        {
            c++;
        }
        // c = 0 or 1 return true otherwise false
        // c = 0 for testcase [1,1,1] if all elements have same value
        // c = 1 there should be 1 or less pair where nums[i-1]>nums[i]
        return c<=1; 

    }
}
/*
    To remove the last if checking for last and first element
    we can write the for loop like -
    
    for(int i=0;i<n;i++)
    {
        if(nums[i]>nums[(i+1)%n])
        {
            c++;
        }
    }
    return c<=1;
*/
