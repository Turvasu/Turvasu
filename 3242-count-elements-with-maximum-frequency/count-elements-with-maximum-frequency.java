import java.util.Arrays;
class Solution {
    public int maxFrequencyElements(int[] n) {
        int c=1,b=1,f=1;
        Arrays.sort(n);
        for(int i=0;i<n.length-1;i++)
        {
            if(n[i]==n[i+1])
            {
                c++;
                if(i==n.length-2)
                {
                    if(b==c)
                        f=b+f;
                    else if(c>b)
                        f=c;
                }
            }
            else
            {
                if(b==c)
                    f=b+f;
                else if(c>b)
                {
                    b=c;
                    f=b;
                }
                c=1;   
            }
        }
        return f;
    }
}