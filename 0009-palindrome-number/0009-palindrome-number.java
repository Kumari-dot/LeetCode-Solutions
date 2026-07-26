class Solution {
    public boolean isPalindrome(int x) {
        int s=0,temp=x;
        if(x<0){
            return false;
        }
        else{
            while(temp!=0){
                int rem=temp%10;
                temp/=10;
                s=rem+s*10;
            }
            if(x==s)
            {
                return true;
            }
            else{
                return false;
            }
        }
        
    }
}