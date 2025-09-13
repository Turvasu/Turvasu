class Solution {
    public int maxFreqSum(String s) {
        int c=0,v=0;
        int a[]=new int[26];
        for(int i=0;i<s.length();i++)
            a[s.charAt(i)-97]++;
        for(int i=0;i<a.length;i++)
        {
            switch(i)
            {
                case ('a'-97),('e'-97),('i'-97),('o'-97),('u'-97):
                v=v<a[i]?a[i]:v;
                break;
                default:
                c=c<a[i]?a[i]:c;
            }
        }
        return (c+v);
    }
}