class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="",s2="";
        for (String s:word1)
        {
            s1+=s;
        }
        for (String s:word2)
        {
            s2+=s;
        }
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        
        if (a.length==b.length)
        {
            for (int i=0;i<a.length;i++)
            {
                if(a[i]!=b[i])
                {
                    return false;
                }
            }
            return true;
        }
        else 
        {
            return false;
        }
    }
}