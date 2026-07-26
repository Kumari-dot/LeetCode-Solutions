class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[2*n];
        int y=0;
        for(int i=0;i<2*n;i+=2){
            arr[i]=nums[y];
            y++;
        }
        for(int i=1;i<2*n;i+=2)
        {
            arr[i]=nums[y];
            y++;
        }
        return arr;
    }
}