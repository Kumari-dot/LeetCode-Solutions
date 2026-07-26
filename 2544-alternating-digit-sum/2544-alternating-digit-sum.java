class Solution {
    public int alternateDigitSum(int n) {
        int temp=n;
        int c=0,sum=0;
        while(temp!=0)
        {
            temp=temp/10;
            c++;
        }
        while(n!=0)
        {
            int rem=n%10;
            n/=10;
            if(c%2!=0)
            {
                sum+=rem;
                c--;
            }
            else{
                sum-=rem;
                c--;
            }
        }
return sum;
        
    }
}