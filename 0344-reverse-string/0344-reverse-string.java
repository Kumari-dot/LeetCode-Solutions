class Solution {
    public void reverseString(char[] s) {
        char []a= new char[s.length];
        int i=0;
        while(i<s.length)
        {
            a[s.length-1-i]=s[i];
            i++;
        }
        for (int j = 0; j < s.length; j++) {
            s[j] = a[j];
        }
    }
}