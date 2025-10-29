class Solution {
    public int smallestNumber(int n) {
        int x=0;
        for(int i=0;i<=10 && x<n;i++)
        {
            x=(int)Math.pow(2,i)-1;
        }
        return x;
    }
}