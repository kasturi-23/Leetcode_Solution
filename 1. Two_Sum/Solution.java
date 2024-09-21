class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j, a,b, sum;
        int n= nums.length;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                sum=nums[i]+nums[j];
                if(sum==target){
                        return new int[]{ i,j};
                }
            }
        }
return null;
    }

}

