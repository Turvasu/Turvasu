import java.util.Arrays;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int b=0;
        int a[]=new int[128];
        if(s.length()==1)
            return 1;
        for(int i =0;i<s.length();i++)
        {
            for(int j=i;;j++)
            {
                a[s.charAt(j)]++;
                if(a[s.charAt(j)]==2)
                {
                    b=j-i>b?j-i:b;
                    break;
                }
                if(j==s.length()-1)
                {
                    b=j-i+1>b?j-i+1:b;
                    break;
                }
            }
            Arrays.fill(a,0);
        }
        return b;
    }
}