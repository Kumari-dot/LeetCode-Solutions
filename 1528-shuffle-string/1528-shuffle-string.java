class Solution {
    public String restoreString(String s, int[] indices) {
         char[] a = s.toCharArray(); 
        char[] arr = new char[a.length];
        int i=0;
        for(i=0;i<arr.length;i++)
        {
            arr[indices[i]]=a[i];
        }
        return new String(arr);
    }
}