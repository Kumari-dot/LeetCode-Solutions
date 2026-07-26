class Solution {
    public int addDigits(int num) {
        int c=0,sum=0;
        while(num!=0)
        {
            int rem=num%10;
            num/=10;
            sum+=rem;
            while(num==0&&sum>=10)
            {
                num=sum;
                sum=0;
            }
        }
        return sum;

    }
}