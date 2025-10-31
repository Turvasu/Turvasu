class Solution {
    public int[] getSneakyNumbers(int[] n) {
        int l= n.length;
        int f[]=new int[l];
        for(int i=0;i<l;i++)
        {
            int a=n[i];
            f[a]++;
        }
        int a[]=new int[2];
        int j=0;
        for(int i=0;i<l;i++)
        {
            if(f[i]>1)
            {
                a[j]=i;
                j++;
            }
            if(j>1)
                break;
        }
        return a;
    }
}