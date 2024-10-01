class Solution {
    public int maxSubArray(int[] nums) {
        int total=0;
        int i,j,x=0;
        int reset=nums[0];
        for(int n:nums){
            if(total<0){
                total=0;
            }
            total += n;
            reset =Math.max(reset ,total);
        }
        return reset;
    }
}
