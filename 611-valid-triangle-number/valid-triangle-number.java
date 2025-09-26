import java.util.Arrays;
class Solution {
    public int triangleNumber(int[] n) {
        if(n.length<3)
            return 0;
        Arrays.sort(n);
        int i=0,j=1,k=2,c=0;
        while(i<n.length-2)
        {
            if(n[i]+n[j]>n[k])
                c++;
            if((j==n.length-2) )
            {
                i++;
                j=i+1;
                k=i+2;
            }
            else if(k==n.length-1 || n[i]+n[j]<=n[k])
            {
                j++;
                k=j+1;
            }
            else
                k++;
        }
        return c;
    }
}